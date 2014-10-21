package com.openIdeas.apps.apisflorea.impl;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linkage.netmsg.NetMsgclient;
import com.openIdeas.apps.apisflorea.entity.MailEntity;
import com.openIdeas.apps.apisflorea.entity.SmsOpLog;
import com.openIdeas.apps.apisflorea.enums.HandlerStatus;
import com.openIdeas.apps.apisflorea.exception.BizException;
import com.openIdeas.apps.apisflorea.intf.AnthenServiceIntf;
import com.openIdeas.apps.apisflorea.intf.MailMessageServiceIntf;
import com.openIdeas.apps.apisflorea.intf.OperatorLogServiceIntf;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.model.ReceiveSmsMsg;
import com.openIdeas.apps.apisflorea.result.CollectionResult;
import com.openIdeas.apps.apisflorea.result.GeniResult;
import com.openIdeas.apps.apisflorea.result.Result;

@Service(RequestHandlerIntf.SEND_SMS)
public class SmsServiceImpl extends AbstractRequestHandleImpl {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private AnthenServiceIntf anthenService;

	@Autowired
	private OperatorLogServiceIntf operLogService;

	@Autowired
	private MailMessageServiceIntf mailMessageService;

	@Autowired
	private ReceiveSmsMsg receiveSmsMsg;

	@Override
	public Result clientLogin() {
		Result r = new Result();
		// 短信接口认证登录
		if (!anthenService.isAnthed()) {
			logger.debug("{} 短信接口登录", "initParams");
			anthenService.anthenMsg(receiveSmsMsg);
		}
		r.setSuccess(anthenService.isAnthed());
		return r;
	}

	protected String getForwardContent(Map<String, String> params) {
		// 1. 请求中获取内容
		String content = params.get("content");
		// content = "测试短信" + new Timestamp(System.currentTimeMillis());
		logger.debug("短信内容： {}", content);
		return content;
	}

	@Override
	protected GeniResult<HandlerStatus> handleForward(String msgId) {
		// 初始化返回值
		GeniResult<HandlerStatus> result = new GeniResult<HandlerStatus>(
				HandlerStatus.N);
		String methodName = "handleForward";
		logger.info("{}, 开始转发消息 msgId:{}", new Object[] { methodName, msgId });
		// 1. 先初始化队列
		CollectionResult<List<SmsOpLog>> colResult = operLogService
				.initOplogs(msgId);

		if (CollectionUtils.isEmpty(colResult.getDataSet())) {
			logger.warn("初始化队列为空。。。");
			throw new BizException(colResult);
		}

		// 2. 待发送邮件内容
		MailEntity me = getMessageById(msgId);

		String content = me.getSubject();

		// 3. 登录认证
		clientLogin();

		result.setObject(HandlerStatus.P);
		// 4. 循环发送
		for (SmsOpLog log : colResult.getDataSet()) {

			if (HandlerStatus.S.equals(log.getStatus())) {
				// 该手机短信已经发送成功，则继续
				continue;
			}

			Long phoneNo = log.getPhoneNo();
			logger.info("{}, 正在处理 msgId:{}, phoneNo:{}", new Object[] {
					methodName, log.getMessageId(), phoneNo });
			// 2.1 更新处理中
			operLogService.update2Processing(log.getMessageId(), phoneNo);

			// 2.2 发送短信
			NetMsgclient msgClient = anthenService.getMsgClient();
			logger.info("isStoped:{}, flag: {}", msgClient.isStoped,
					msgClient.flag);
			String ss = sendSMS(content, phoneNo);
			logger.info("{}, 发送短信返回：{}", methodName, ss);
			// 2.3 发送完成后更新短信序列
			operLogService.updateSmsSerail(msgId, phoneNo, ss);
			// 发送完短信则休息半秒中
			try {
				Thread.sleep(550);
			} catch (InterruptedException e) {
				logger.debug("系统异常", e);
				throw new BizException(e.getMessage());
			}
		}

		result.setObject(HandlerStatus.S);

		return result;
	}

	/**
	 * 发送短信处理
	 * 
	 * @param content
	 * @param phoneNo
	 */
	private String sendSMS(String content, Long phoneNo) {
		// 1.直接发送
		NetMsgclient msgClient = anthenService.getMsgClient();

		String ss = msgClient.sendMsg(msgClient, 0, phoneNo.toString(),
				content, 1);

		try {
			// 连接出现异常，需要重新发送
			while ("16".equals(ss)) {
				logger.warn("连接已经断开");
				// msgClient = anthenService.reconnect();
				// logger.info("尝试重新连接" + msgClient);
				// 3. 等待一分钟后重新连接
				Thread.sleep(500);
				logger.info("sendSMs, 等待500m后重新发送。。。。");
				clientLogin();
				ss = sendSMS(content, phoneNo);
			}
		} catch (InterruptedException e) {
			// 线程异常
			logger.error("系统异常", e);
			return "0";
		}
		return ss;
	}

	public static String getAnnot() {
		return SEND_SMS;
	}
}

package com.openIdeas.apps.apisflorea.impl;

import java.sql.Timestamp;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.openIdeas.apps.apisflorea.entity.MailEntity;
import com.openIdeas.apps.apisflorea.enums.HandlerStatus;
import com.openIdeas.apps.apisflorea.exception.BizException;
import com.openIdeas.apps.apisflorea.intf.MailMessageServiceIntf;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.result.GeniResult;
import com.openIdeas.apps.apisflorea.result.Result;

/**
 * 抽象请求处理实现
 * 
 * @author mupeng
 *
 */
@Service
public abstract class AbstractRequestHandleImpl implements RequestHandlerIntf {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private MailMessageServiceIntf mailMessageService;

	@Override
	public Result handlerRequest(Map<String, String> params) {
		logger.debug("handlerRequest 参数{}", params);

		// 1. 获取转发内容
		String content = getForwardContent(params);

		handleForward(content);

		return new Result();
	}

	/**
	 * 获取转发内容
	 * 
	 * @param params
	 * @return
	 */
	protected abstract String getForwardContent(Map<String, String> params);

	/**
	 * 处理转发
	 * 
	 * @param content
	 */
	protected abstract GeniResult<HandlerStatus> handleForward(String msgId);

	@Override
	@Transactional
	public Result handleMailMessage(String msgId) {
		GeniResult<String> result = new GeniResult<String>();
		// 0 检查是否超时
		MailEntity me = getMessageById(msgId);
		Timestamp curt = new Timestamp(System.currentTimeMillis());
		// if (me.getEventTime().) {
		//
		// }

		// 1. 如果未成功，先处理异常情况（消息状态为处理中，异常等）
		if (!HandlerStatus.N.equals(me.getStatus())) {
			// 需要进入异常流程
			logger.warn("邮件【{}】已经非新建状态", msgId);
			throw new BizException("邮件【" + msgId + "】已经非新建状态");
		}

		// 2. 检查该邮件是否所有手机都已经发送成功
		if (mailMessageService.isDealSucd(msgId)) {
			logger.warn("邮件【{}】已经处理成功了，无需处理了", msgId);
			return result;
		}

		// 3. 更新为处理中
		Result ur = mailMessageService.updateMailStatus(msgId, HandlerStatus.P);
		if (!ur.isSuccess()) {
			logger.warn("更新邮件状态失败，id：{}", msgId);
			result.fail(ur.getErrorCode());
			return result;
		}

		// 3. 转发处理
		GeniResult<HandlerStatus> gr = handleForward(msgId);

		if (null == gr || !gr.isSuccess()) {
			logger.warn("转发处理失败，id：{}", msgId);
			result.fail(gr.getErrorCode());
			return result;
		}

		if (HandlerStatus.S.equals(gr.getObject())) {
			logger.info("转发处理完成，id：{}", msgId);
		}

		return result;
	}

	protected MailEntity getMessageById(String msgId) {
		GeniResult<MailEntity> grm = mailMessageService.getMessage(msgId);
		MailEntity me = grm.getObject();
		if (null == me) {
			logger.warn("找不到待处理的消息");
			throw new BizException("待处理邮件已经不存在");
		}
		return me;
	}
}

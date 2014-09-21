package com.openIdeas.apps.apisflorea.quartz;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.enums.HandlerStatus;
import com.openIdeas.apps.apisflorea.enums.InterfaceEm;
import com.openIdeas.apps.apisflorea.impl.InterfaceServcie;
import com.openIdeas.apps.apisflorea.intf.MailMessageServiceIntf;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.mail.RemoteMailServiceIntf;
import com.openIdeas.apps.apisflorea.model.TaskStatus;
import com.openIdeas.apps.apisflorea.result.CollectionResult;
import com.openIdeas.apps.apisflorea.result.Result;

/**
 * 收取邮件定時任务
 * 
 * @author evan
 * 
 */
@Service("receiveMailTask")
public class ReceiveMailTask implements InitializingBean {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private RemoteMailServiceIntf receiveMail;

	@Autowired
	private MailMessageServiceIntf mailMessageService;

	private static TaskStatus curTask = new TaskStatus();

	public void receive() {

		if (!curTask.isFinish()) {
			logger.warn("上一次的任务未处理完成，不能进入 ！");
			return;
		} else {
			curTask.restart();
		}

		RequestHandlerIntf handler = InterfaceServcie
				.getHandler(InterfaceEm.sendSms);

		logger.debug("定时任务在运行...");
		// 1. 初始化连接
		Result init = handler.clientLogin();
		if (!init.isSuccess()) {
			logger.warn("initParams fail");
			return;
		}

		// 1. 获取待发送列表
		CollectionResult<List<String>> result = receiveMail.get2HanlerMail();
		if (!result.isSuccess()) {
			logger.error("获取待发送邮件列表失败, msg: {}", result);
			return;
		}

		// 3. 处理邮件
		for (String msgid : result.getDataSet()) {
			Result gr = InterfaceServcie.getHandler(InterfaceEm.sendSms)
					.handleMailMessage(msgid);
			if (!gr.isSuccess()) {
				// 失败则更新邮件状态为异常
				mailMessageService.updateMailStatus(msgid, HandlerStatus.E);
			} 
		}

		curTask.finish();
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		curTask.finish();
	}
}

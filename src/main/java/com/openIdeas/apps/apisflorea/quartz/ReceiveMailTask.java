package com.openIdeas.apps.apisflorea.quartz;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.enums.InterfaceEm;
import com.openIdeas.apps.apisflorea.impl.InterfaceServcie;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.mail.RemoteMailServiceIntf;
import com.openIdeas.apps.apisflorea.result.CollectionResult;
import com.openIdeas.apps.apisflorea.result.Result;

/**
 * 收取邮件定時任务
 * 
 * @author evan
 * 
 */
@Service("receiveMailTask")
public class ReceiveMailTask {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private RemoteMailServiceIntf receiveMail;

	public void receive() {
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

		// 2. 处理邮件
		for (String msgid : result.getDataSet()) {
			Result gr = InterfaceServcie.getHandler(InterfaceEm.sendSms)
					.handleMailMessage(msgid);
			if (!gr.isSuccess()) {
				// 失败则更新邮件状态为异常

			}
		}

	}
}

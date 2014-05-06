package com.openIdeas.apps.apisflorea.quartz;

import java.util.List;

import javax.mail.Message;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.enums.InterfaceEm;
import com.openIdeas.apps.apisflorea.impl.InterfaceServcie;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.mail.ReceiveMailServiceIntf;
import com.openIdeas.apps.apisflorea.model.MailMessage;
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
	private ReceiveMailServiceIntf receiveMail;

	public void receive() {
	    RequestHandlerIntf handler = InterfaceServcie.getHandler(InterfaceEm.sendSms);
        
		logger.debug("定时任务在运行...");
		//1. 初始化连接
		Result init = handler.initParams();
		if(!init.isSuccess()) {
		    logger.warn("initParams fail");
		    return;
		}
		
		CollectionResult<List<Message>> result = receiveMail
				.getSubjects4Sms();
		if (!result.isSuccess()) {
			return;
		}

		if (CollectionUtils.isEmpty(result.getDataSet())) {
			logger.debug("getSubjects4Sms mails is null");
			return;
		}

		for (Message mail : result.getDataSet()) {
			handler.handleMailMessage(mail);
		}
	}
}

package com.openIdeas.apps.apisflorea.quartz;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.mail.ReceiveMailServiceIntf;
import com.openIdeas.apps.apisflorea.model.MailMessage;
import com.openIdeas.apps.apisflorea.result.CollectionResult;

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

	@Autowired
	private RequestHandlerIntf requestHandler;

	public void receive() {
		logger.debug("定时任务在运行...");
		CollectionResult<List<MailMessage>> result = receiveMail
				.getSubjects4Sms();
		if (!result.isSuccess()) {
			return;
		}

		if (CollectionUtils.isEmpty(result.getDataSet())) {
			logger.debug("getSubjects4Sms mails is null");
			return;
		}

		for (MailMessage mail : result.getDataSet()) {
			requestHandler.handleMailMessage(mail);
		}
	}
}

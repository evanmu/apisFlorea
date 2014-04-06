package com.openIdeas.apps.apisflorea.mail;

import java.util.List;

import com.openIdeas.apps.apisflorea.model.MailMessage;
import com.openIdeas.apps.apisflorea.result.CollectionResult;

/**
 * 接收邮件服务接口
 * 
 * @author evan
 * 
 */
public interface ReceiveMailServiceIntf {

	/**
	 * 获取待发送主题
	 * @return
	 */
	CollectionResult<List<MailMessage>> getSubjects4Sms();
}

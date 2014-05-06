package com.openIdeas.apps.apisflorea.mail;

import java.util.List;

import javax.mail.Message;

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
	CollectionResult<List<Message>> getSubjects4Sms();
}

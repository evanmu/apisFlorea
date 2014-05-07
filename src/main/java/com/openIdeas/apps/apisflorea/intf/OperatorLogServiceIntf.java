package com.openIdeas.apps.apisflorea.intf;

import java.util.List;

import com.openIdeas.apps.apisflorea.entity.SmsOpLog;
import com.openIdeas.apps.apisflorea.result.CollectionResult;

public interface OperatorLogServiceIntf {

	/**
	 * 初始化待发送手机记录
	 * @param msgId
	 * @return
	 */
	CollectionResult<List<SmsOpLog>> initOplogs(String msgId);
	
	/**
	 * 获取手机发送记录
	 * @param msgId 邮件ID
	 * @return
	 */
	CollectionResult<List<SmsOpLog>> getOplog(String msgId);
	
}

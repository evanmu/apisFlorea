package com.openIdeas.apps.apisflorea.intf;

import java.util.List;

import com.openIdeas.apps.apisflorea.entity.SmsOpLog;
import com.openIdeas.apps.apisflorea.result.CollectionResult;
import com.openIdeas.apps.apisflorea.result.GeniResult;
import com.openIdeas.apps.apisflorea.result.Result;

public interface OperatorLogServiceIntf {

	/**
	 * 初始化待发送手机记录
	 * 
	 * @param msgId
	 * @return
	 */
	CollectionResult<List<SmsOpLog>> initOplogs(String msgId);

	/**
	 * 获取手机发送记录
	 * 
	 * @param msgId
	 *            邮件ID
	 * @return
	 */
	CollectionResult<List<SmsOpLog>> getOplog(String msgId);

	/**
	 * 更新处理状态为处理中
	 * 
	 * @param msgId
	 * @param phoneNo
	 * @return
	 */
	Result update2Processing(String msgId, Long phoneNo);

	/**
	 * 更新处理状态为成功
	 * 
	 * @param smsSerail
	 * @return
	 */
	Result update2Sucd(String smsSerail);

	/**
	 * 更新短信序列
	 * 
	 * @param msgId
	 * @param phoneNo
	 * @return
	 */
	Result updateSmsSerail(String msgId, Long phoneNo, String smsSerail);

	/**
	 * 根据短信序列号查询邮件ID
	 * 
	 * @param smsSerail
	 * @return
	 */
	GeniResult<String> getMsgId(String smsSerail);

}

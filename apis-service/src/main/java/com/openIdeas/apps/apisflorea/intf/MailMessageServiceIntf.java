package com.openIdeas.apps.apisflorea.intf;

import com.openIdeas.apps.apisflorea.entity.MailEntity;
import com.openIdeas.apps.apisflorea.enums.HandlerStatus;
import com.openIdeas.apps.apisflorea.result.GeniResult;
import com.openIdeas.apps.apisflorea.result.Result;

/**
 * 待发送邮件管理
 * 
 * @author evan
 * 
 */
public interface MailMessageServiceIntf {

	/**
	 * 获取消息记录
	 * 
	 * @param msgId
	 * @return
	 */
	GeniResult<MailEntity> getMessage(String msgId);

	/**
	 * 新建邮件状态
	 * 
	 * @param mail
	 * @return
	 */
	Result saveMail(MailEntity mail);

	/**
	 * 更新邮件状态
	 * 
	 * @param id
	 * @param status
	 * @return
	 */
	Result updateMailStatus(String id, HandlerStatus status);

	/**
	 * 更新邮件记录为成功
	 * 
	 * @param msgId
	 */
	void updateMailSucd(String msgId);
	
	/**
	 * 更新邮件记录为成功
	 * @param msgId
	 * @param comment
	 */
	void updateMailSucd(String msgId, String comment);

	/**
	 * 判断是否处理成功<BR>
	 * 判断成功的短信条数等于手机items个数
	 * 
	 * @param msgId
	 * @return
	 */
	boolean isDealSucd(String msgId);

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	void deleteById(String id);

	/**
	 * 更新总数
	 * 
	 * @param msgId
	 * @param count
	 * @return
	 */
	Result updateTotalCount(String msgId);

	/**
	 * 累加成功个数
	 * 
	 * @param msgId
	 * @return
	 */
	Result grandSucdCount(String msgId);
	
	void checkStatus(String msgId);
}

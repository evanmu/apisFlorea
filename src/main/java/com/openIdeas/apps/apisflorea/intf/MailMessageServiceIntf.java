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
}

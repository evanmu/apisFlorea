package com.openIdeas.apps.apisflorea.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openIdeas.apps.apisflorea.entity.SmsOpLog;

/**
 * 
 * 短信操作记录
 * 
 * @author Evan Mu
 */
@Repository
public interface SmsOpLogDao extends CrudRepository<SmsOpLog, Long> {
	
	/**
	 * 根据消息ID查询操作记录
	 * @param msgId
	 * @return
	 */
	List<SmsOpLog> findByMessageId(String msgId);
}

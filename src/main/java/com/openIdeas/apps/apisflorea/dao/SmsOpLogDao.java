package com.openIdeas.apps.apisflorea.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.openIdeas.apps.apisflorea.entity.SmsOpLog;

/**
 * 
 * 短信操作记录
 * 
 * @author Evan Mu
 */
@Component
public interface SmsOpLogDao extends CrudRepository<SmsOpLog, Long> {
    
    SmsOpLog findBySerialNo(Long serialNo);
}

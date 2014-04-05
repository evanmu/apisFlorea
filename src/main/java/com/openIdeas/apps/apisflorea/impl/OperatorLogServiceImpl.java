package com.openIdeas.apps.apisflorea.impl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.openIdeas.apps.apisflorea.dao.SmsOpLogDao;
import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.apisflorea.entity.SmsOpLog;
import com.openIdeas.apps.apisflorea.enums.AnswerStatus;
import com.openIdeas.apps.apisflorea.enums.HandlerStatus;
import com.openIdeas.apps.apisflorea.intf.OperatorLogServiceIntf;

public class OperatorLogServiceImpl implements OperatorLogServiceIntf {
    @Autowired
    private SmsOpLogDao smsOpLogDao;

    @Override
    public SmsOpLog initLog(PhoneItem item, String content) {
        SmsOpLog log = new SmsOpLog();
        log.setItemId(item.getId());
        log.setPhoneNo(item.getPhoneNo());
        log.setCreateTime(new Date());
        log.setStatus(HandlerStatus.N);
        if (StringUtils.isNotEmpty(content)) {
            log.setContent(content);
        }
        return smsOpLogDao.save(log);
    }

    @Override
    public SmsOpLog completeLog(Long serialNo, AnswerStatus status) {
        SmsOpLog log = smsOpLogDao.findBySerialNo(serialNo);
        log.setFinishTime(new Date());
        log.setReceiveMsg(status.getDesc());
        return smsOpLogDao.save(log);
    }

}

package com.openIdeas.apps.apisflorea.intf;

import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.apisflorea.entity.SmsOpLog;
import com.openIdeas.apps.apisflorea.enums.AnswerStatus;

public interface OperatorLogServiceIntf {

    /**
     * 
     * 保存操作日志
     * 
     * @param item 发送项
     * @param content
     * @return 操作日志
     */
    SmsOpLog initLog(PhoneItem item, String content);

    /**
     * 操作完成日志
     * 
     * @param id
     * @param status 回应状态
     * @return 操作日志
     */
    SmsOpLog completeLog(Long id, AnswerStatus status);
}

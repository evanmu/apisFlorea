package com.openIdeas.apps.apisflorea.impl;

import java.sql.Timestamp;
import java.util.Map;

import javax.mail.Message;
import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.model.MailMessage;
import com.openIdeas.apps.apisflorea.result.GeniResult;
import com.openIdeas.apps.apisflorea.result.Result;

public abstract class AbstractRequestHandleImpl implements RequestHandlerIntf {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public Result handlerRequest(Map<String, String> params) {
        logger.debug("handlerRequest 参数{}", params);

        // 1. 获取转发内容
        String content = getForwardContent(params);

        handleForward(content);

        return new Result();
    }

    /**
     * 获取转发内容
     * 
     * @param params
     * @return
     */
    protected abstract String getForwardContent(Map<String, String> params);

    /**
     * 处理转发
     * 
     * @param content
     */
    protected abstract void handleForward(String content);

    @Override
    public GeniResult<MailMessage> handleMailMessage(Message message) {
        // logger.debug("事件发生时间: {}, 事件内容：{}", message.getOccurTime(), message.getSubject());
        // handleForward(message.getSubject());
        //
        GeniResult<MailMessage> result = new GeniResult<MailMessage>();
        MailMessage mm = new MailMessage();
        try {
            mm.setOccurTime(new Timestamp(message.getSentDate().getTime()));
        } catch (MessagingException e) {

        }
        result.setObject(mm);
        return result;
    }
}

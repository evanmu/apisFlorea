package com.openIdeas.apps.apisflorea.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.linkage.netmsg.NetMsgclient;
import com.openIdeas.apps.apisflorea.intf.AnthenServiceIntf;

public class SendMsgTask implements Runnable {

    private Logger logger = LoggerFactory.getLogger(getClass());

    /** 序列号 */
    private Long serialNo;

    /** 手机号 */
    private Long phoneNo;

    /** 内容 */
    private String content;

    private AnthenServiceIntf anthenService;

    public SendMsgTask(Long serialNo, Long phoneNo, String content) {
        this.serialNo = serialNo;
        this.phoneNo = phoneNo;
        this.content = content;
    }

    @Override
    public void run() {
        while (!getAnthenService().isAnthed()) {
            try {
                logger.info("未认证成功，线程休眠半分钟");
                
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                logger.error(e.getMessage());
            }
        }

        logger.debug("认证成功，发送短信，手机号：{}， 短信内容：{}", this.phoneNo, this.content);
        // 不再休眠说明已经认证成功，进行发短信处理
        NetMsgclient client = getAnthenService().getMsgClient();
        // 发送短信记录操作日志
        client.sendMsg(client, 0, this.phoneNo.toString(), this.content, 1);
    }

    /**
     * @return the serialNo
     */
    public Long getSerialNo() {
        return serialNo;
    }

    /**
     * @param serialNo the serialNo to set
     */
    public void setSerialNo(Long serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * @return the phoneNo
     */
    public Long getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @param anthenService the anthenService to set
     */
    public void setAnthenService(AnthenServiceIntf anthenService) {
        this.anthenService = anthenService;
    }

    /**
     * @return the anthenService
     */
    private AnthenServiceIntf getAnthenService() {
        return anthenService;
    }
}

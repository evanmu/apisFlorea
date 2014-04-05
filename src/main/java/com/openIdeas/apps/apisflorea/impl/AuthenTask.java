package com.openIdeas.apps.apisflorea.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.linkage.netmsg.server.ReceiveMsg;
import com.openIdeas.apps.apisflorea.intf.AnthenServiceIntf;
import com.openIdeas.apps.apisflorea.model.ReceiveSmsMsg;

public class AuthenTask implements Runnable {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private AnthenServiceIntf anthenService;

    @Override
    public void run() {
        boolean notAuth = !getAnthenService().isAnthed();
        while (notAuth) {
            logger.debug("........ 进行认证.........");
            try {
                ReceiveMsg msgImpl = new ReceiveSmsMsg();
                getAnthenService().anthenMsg(msgImpl);
            } catch (Throwable e) {
                logger.error("认证过程发生异常", e);
            }
            notAuth = !getAnthenService().isAnthed();
            if (notAuth) {
                // 休眠一分钟
                try {
                    Thread.sleep(60000);
                } catch (InterruptedException e) {
                    logger.error("线程中断异常", e);
                }
            }
        }
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

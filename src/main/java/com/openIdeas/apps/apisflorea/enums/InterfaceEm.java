package com.openIdeas.apps.apisflorea.enums;

import com.openIdeas.apps.apisflorea.impl.SmsServiceImpl;

/**
 * 
 * 接口类型枚举
 * 
 * @author Evan Mu
 */
public enum InterfaceEm {

    sendSms(SmsServiceImpl.getAnnot());

    private String beanName;

    InterfaceEm(String bean) {
        this.beanName = bean;
    }

    /**
     * @return the beanName
     */
    public String getBeanName() {
        return beanName;
    }

}

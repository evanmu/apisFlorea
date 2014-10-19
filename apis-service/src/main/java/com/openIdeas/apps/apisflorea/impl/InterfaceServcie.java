package com.openIdeas.apps.apisflorea.impl;

import com.openIdeas.apps.apisflorea.enums.InterfaceEm;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.util.SpringContextUtil;

public class InterfaceServcie {

    /**
     * 
     * 获取处理器
     * 
     * @param em
     * @return
     */
    public static RequestHandlerIntf getHandler(InterfaceEm em) {
        return (RequestHandlerIntf) SpringContextUtil.getApplicationContext().getBean(em.getBeanName());
    }

}

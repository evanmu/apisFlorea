package com.openIdeas.apps.apisflorea.intf;

import java.util.Map;

public interface RequestHandlerIntf {

    String SEND_SMS = "smsService";
    
    /**
     * 
     * 请求参数
     * 
     * @param params 请求参数
     * @return 响应
     */
    String handlerRequest(Map<String, String> params);
}

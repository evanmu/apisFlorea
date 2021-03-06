package com.openIdeas.apps.apisflorea.intf;

import java.util.Map;

import com.openIdeas.apps.apisflorea.result.Result;

public interface RequestHandlerIntf {

	String SEND_SMS = "smsService";

	/**
	 * 
	 * 处理map请求
	 * 
	 * @param params
	 *            请求参数
	 * @return 响应
	 */
	Result handlerRequest(Map<String, String> params);

	/**
	 * 处理mail消息
	 * 
	 * @param message
	 * @return
	 */
	Result handleMailMessage(String id);
	
	Result clientLogin();
}

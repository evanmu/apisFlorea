package com.openIdeas.apps.apisflorea.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.model.MailMessage;
import com.openIdeas.apps.apisflorea.result.Result;

public abstract class AbstractRequestHandleImpl implements RequestHandlerIntf {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public String handlerRequest(Map<String, String> params) {
		logger.debug("handlerRequest 参数{}", params);

		//1. 获取转发内容
		String content = getForwardContent(params);

		handleForward(content);
		
		return "SUCCESS";
	}

	/**
	 * 获取转发内容
	 * @param params
	 * @return
	 */
	protected abstract String getForwardContent(Map<String, String> params);	
	
	/**
	 * 处理转发
	 * @param content
	 */
	protected abstract void handleForward(String content);
	
	@Override
	public Result handleMailMessage(MailMessage message) {
		logger.debug("事件发生时间: {}, 事件内容：{}", message.getOccurTime(), message.getSubject());
		handleForward(message.getSubject());
		
		Result result = new Result();
		result.setMessage(message.getSubject());
		
		return result;
	}
}

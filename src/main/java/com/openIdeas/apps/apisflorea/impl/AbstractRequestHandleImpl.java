package com.openIdeas.apps.apisflorea.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.enums.HandlerStatus;
import com.openIdeas.apps.apisflorea.intf.MailMessageServiceIntf;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.result.GeniResult;
import com.openIdeas.apps.apisflorea.result.Result;

@Service
public abstract class AbstractRequestHandleImpl implements RequestHandlerIntf {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private MailMessageServiceIntf mailMessageService;

	@Override
	public Result handlerRequest(Map<String, String> params) {
		logger.debug("handlerRequest 参数{}", params);

		// 1. 获取转发内容
		// String content = getForwardContent(params);

		// handleForward(content);

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
	protected abstract GeniResult<HandlerStatus> handleForward(
			String msgId);

	@Override
	public Result handleMailMessage(String msgId) {
		GeniResult<String> result = new GeniResult<String>();
		// 1. 更新为处理中
		Result ur = mailMessageService.updateMailStatus(msgId,
				HandlerStatus.P);
		if (!ur.isSuccess()) {
			logger.warn("更新邮件状态失败，id：{}", msgId);
			result.fail(ur.getErrorCode());
			return result;
		}
		// 2. 转发处理
		GeniResult<HandlerStatus> gr = handleForward(msgId);
		
		if (null == gr || !gr.isSuccess()) {
			logger.warn("转发处理失败，id：{}", msgId);
			result.fail(gr.getErrorCode());
			return result;
		}

		if (HandlerStatus.S.equals(gr.getObject())) {
			logger.info("转发处理完成，id：{}", msgId);
		}

		return result;
	}
}

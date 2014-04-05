package com.openIdeas.apps.apisflorea.impl;

import java.util.Map;
import java.util.concurrent.ExecutorService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.dao.PhoneItemDao;
import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.apisflorea.intf.AnthenServiceIntf;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;

@Service(RequestHandlerIntf.SEND_SMS)
public class SmsServiceImpl implements RequestHandlerIntf {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private AnthenServiceIntf anthenService;

	@Autowired
	private PhoneItemDao phoneItemDao;

	/**
	 * 消息线程池
	 */
	@Autowired
	@Qualifier("msgthreadPool")
	private ExecutorService msgPool;

	@Override
	public String handlerRequest(Map<String, String> params) {
		logger.debug("handlerRequest 参数{}", params);

		// 1. 短信内容 使用|分割“ERROR” “FAILURE” “CRITICAL” “WARNING” “INFORMATIONAL”
		String content = params.get("content");
		// content = "测试短信" + new Timestamp(System.currentTimeMillis());
		logger.debug("短信内容： {}", content);
		// 2. 获取当前待发送的手机号队列
		Iterable<PhoneItem> list = phoneItemDao.findAll();

		// 3. 创建发送短信线程任务
		SendMsgTask task = new SendMsgTask(anthenService, list, content);
		msgPool.execute(task);

		return "SUCCESS";
	}

	public static String getAnnot() {
		return SEND_SMS;
	}
}

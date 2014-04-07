package com.openIdeas.apps.apisflorea.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.dao.PhoneItemDao;
import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.apisflorea.intf.AnthenServiceIntf;
import com.openIdeas.apps.apisflorea.intf.RequestHandlerIntf;
import com.openIdeas.apps.apisflorea.model.ReceiveSmsMsg;

@Service(RequestHandlerIntf.SEND_SMS)
public class SmsServiceImpl extends AbstractRequestHandleImpl {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private AnthenServiceIntf anthenService;

	@Autowired
	private PhoneItemDao phoneItemDao;

	private List<PhoneItem> phoneList = new ArrayList<PhoneItem>();;

	/**
	 * 消息线程池
	 */
	@Autowired
	@Qualifier("msgthreadPool")
	private ExecutorService msgPool;

	@Override
	public void initParams() {
		//短信接口认证登录
		if (!anthenService.isAnthed()) {
			logger.debug("{} 短信接口登录", "initParams");
			anthenService.anthenMsg(new ReceiveSmsMsg());
		}
	}

	protected String getForwardContent(Map<String, String> params) {
		// 1. 请求中获取内容
		String content = params.get("content");
		// content = "测试短信" + new Timestamp(System.currentTimeMillis());
		logger.debug("短信内容： {}", content);
		return content;
	}

	@Override
	public void handleForward(String content) {
		logger.debug("Entering {}", "handleForward");
		// 1. 获取当前待发送的手机号队列
		List<PhoneItem> list = getPhoneList();

		// 2. 创建发送短信线程任务
		SendMsgTask task = new SendMsgTask(anthenService, list, content);
		msgPool.execute(task);
		logger.debug("Exiting {}", "handleForward");
	}

	private List<PhoneItem> getPhoneList() {
		if (phoneList.size() != 0) {
			return phoneList;
		}

		// 查询数据库
		logger.debug("{} 数据库查询号码列表", "getPhoneList");
		Iterable<PhoneItem> itera = phoneItemDao.findAll();

		// 添加到list成员中
		if (null != itera) {
			CollectionUtils.addAll(phoneList, itera.iterator());
		}

		return phoneList;
	}

	public static String getAnnot() {
		return SEND_SMS;
	}

	@Override
	public void clearQueue() {
		this.phoneList.clear();
	}
}

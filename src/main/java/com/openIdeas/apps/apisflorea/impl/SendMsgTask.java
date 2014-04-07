package com.openIdeas.apps.apisflorea.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.linkage.netmsg.NetMsgclient;
import com.linkage.netmsg.server.ReceiveMsg;
import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.apisflorea.intf.AnthenServiceIntf;
import com.openIdeas.apps.apisflorea.model.ReceiveSmsMsg;

/**
 * 
 * @author evan
 * 
 */
public class SendMsgTask implements Runnable {

	private Logger logger = LoggerFactory.getLogger(getClass());

	private AnthenServiceIntf anthenService;

	private Iterable<PhoneItem> phoneList;

	/** 内容 */
	private String content;

	public SendMsgTask(AnthenServiceIntf anthenService,
			List<PhoneItem> list, String content) {
		logger.debug("新建短信发送任务, 发送内容{}, 待发送号码size={}", content, list.size());
		this.anthenService = anthenService;
		this.phoneList = list;
		this.content = content;
	}

	@Override
	public void run() {

		ReceiveMsg msgImpl = new ReceiveSmsMsg();
		// 1.调用认证任务
		if (!getAnthenService().isAnthed()) {
			anthenService.anthenMsg(msgImpl);
		}

		while (!getAnthenService().isAnthed()) {
			try {
				logger.info("未认证成功，线程休眠半分钟");
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				logger.error(e.getMessage());
			}
		}

		// 2. 不再休眠说明已经认证成功，进行发短信处理
		NetMsgclient client = getAnthenService().getMsgClient();
		logger.debug("认证成功, phoneList has next="
				+ phoneList.iterator().hasNext());
		for (PhoneItem phoneItem : phoneList) {
			logger.debug("发送短信，手机号：{}， 短信内容：{}", phoneItem.getPhoneNo(),
					this.content);
			// 发送短信记录操作日志
			client.sendMsg(client, 0, phoneItem.getPhoneNo().toString(),
					this.content, 1);
		}

	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @param anthenService
	 *            the anthenService to set
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

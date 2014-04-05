package com.openIdeas.apps.apisflorea.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 收取邮件定時任务
 * @author evan
 *
 */
public class ReceiveMailTask {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	
	public void receive() {
		logger.debug("定时任务在运行...");
	}
}

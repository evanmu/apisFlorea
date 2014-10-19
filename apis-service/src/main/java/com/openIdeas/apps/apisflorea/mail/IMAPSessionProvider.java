package com.openIdeas.apps.apisflorea.mail;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.openIdeas.apps.apisflorea.util.PropertyFileUtil;

public class IMAPSessionProvider implements SessionProvider {

	private Logger logger = LoggerFactory.getLogger(getClass());

	
	@Override
	public Session getSession() {
		Properties props = null;
		try {
			props = PropertyFileUtil.loadProperties(CONFIG_FILE);
		} catch (IOException e) {
			logger.error("初始化邮件配置失败", e);
		}

		return Session.getInstance(props, new MailAuthenticator());
	}

}

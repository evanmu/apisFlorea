package com.openIdeas.apps.apisflorea.mail;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

import com.openIdeas.apps.apisflorea.util.PropertyFileUtil;

public class MailAuthenticator extends Authenticator {

	@Override
	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(PropertyFileUtil.get("mail.user"),
				PropertyFileUtil.get("mail.pass"));
	}
}

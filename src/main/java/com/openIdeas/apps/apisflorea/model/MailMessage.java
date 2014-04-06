package com.openIdeas.apps.apisflorea.model;

import java.sql.Timestamp;

/**
 * 邮件消息
 * @author evan
 *
 */
public class MailMessage {
	
	/** 主题*/
	private String subject;
	
	/** 发生时间*/
	private Timestamp occurTime;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Timestamp getOccurTime() {
		return occurTime;
	}

	public void setOccurTime(Timestamp occurTime) {
		this.occurTime = occurTime;
	}

	@Override
	public String toString() {
		return "MailMessage [subject=" + subject + ", occurTime=" + occurTime
				+ "]";
	}
	
}

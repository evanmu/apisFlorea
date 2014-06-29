package com.openIdeas.apps.apisflorea.entity.pk;

import java.io.Serializable;

public class OpPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8234272304267156915L;

	private String messageId;

	/** 手机号 */
	private Long phoneNo;

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
}

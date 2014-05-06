package com.openIdeas.apps.apisflorea.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.openIdeas.apps.apisflorea.entity.pk.OpPK;

/**
 * 
 * 短信操作记录
 * 
 * @author Evan Mu
 */
@Entity
@IdClass(OpPK.class)
@Table(name = "AF_SMS_OP_LOG")
public class SmsOpLog implements Serializable {
	/**
     */
	private static final long serialVersionUID = 2080247462677732030L;

	private String messageId;

	/** 手机号 */
	private Long phoneNo;

	@Id
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	@Id
	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}
}

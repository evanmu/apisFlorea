package com.openIdeas.apps.apisflorea.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.openIdeas.apps.apisflorea.entity.pk.OpPK;
import com.openIdeas.apps.apisflorea.enums.HandlerStatus;

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

	/** 状态 */
	private HandlerStatus status;

	/** 创建时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp createTime;

	private String comments;

	public SmsOpLog() {
		this.status = HandlerStatus.N;
		this.createTime = new Timestamp(System.currentTimeMillis());
	}

	public SmsOpLog(String msgId, Long phoneNo) {
		this();
		this.messageId = msgId;
		this.phoneNo = phoneNo;
	}

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

	/**
	 * @return the status
	 */
	@Enumerated(javax.persistence.EnumType.STRING)
	public HandlerStatus getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(HandlerStatus status) {
		this.status = status;
	}

	/**
	 * @return the createTime
	 */
	public Timestamp getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments
	 *            the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SmsOpLog [messageId=" + messageId + ", phoneNo=" + phoneNo
				+ ", status=" + status + ", createTime=" + createTime
				+ ", comments=" + comments + "]";
	}
}

package com.openIdeas.apps.apisflorea.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.openIdeas.apps.apisflorea.enums.HandlerStatus;

@Entity
@Table(name = "AF_MAIL_MESSAGE")
public class MailEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6487418491176525017L;

	/** 邮件唯一编码 */
	private String messageId;

	/** 主题 */
	private String subject;

	/** 处理状态 */
	private HandlerStatus status;

	/** 总共需要发送个数 */
	private long totalCount;

	/** 成功条数 */
	private long sucdCount;

	/**
	 * 成功的手机号id
	 */
	private String sucdItems;

	/** 创建时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private Timestamp createTime;
	
	/** 事件时间 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private Timestamp eventTime;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss.SSS")
	private Timestamp finishTime;

	@Id
	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Enumerated(javax.persistence.EnumType.STRING)
	public HandlerStatus getStatus() {
		return status;
	}

	public void setStatus(HandlerStatus status) {
		this.status = status;
	}

	public long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}

	public long getSucdCount() {
		return sucdCount;
	}

	public void setSucdCount(long sucdCount) {
		this.sucdCount = sucdCount;
	}

	public String getSucdItems() {
		return sucdItems;
	}

	public void setSucdItems(String sucdItems) {
		this.sucdItems = sucdItems;
	}

	public Timestamp getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Timestamp getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(Timestamp finishTime) {
		this.finishTime = finishTime;
	}

	public Timestamp getEventTime() {
		return eventTime;
	}

	public void setEventTime(Timestamp eventTime) {
		this.eventTime = eventTime;
	}
}

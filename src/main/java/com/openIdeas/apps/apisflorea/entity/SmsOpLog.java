package com.openIdeas.apps.apisflorea.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.openIdeas.apps.apisflorea.enums.HandlerStatus;

/**
 * 
 * 短信操作记录
 * 
 * @author Evan Mu
 */
@Entity
@Table(name = "AF_SMS_OP_LOG")
public class SmsOpLog extends IdEntity implements Serializable {
    /**
     */
    private static final long serialVersionUID = 2080247462677732030L;

    private Long serialNo;

    /** 手机号 */
    private Long phoneNo;

    private Long itemId;

    /** 创建时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    private Date createTime;

    /** 完成时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date finishTime;

    /** 短信内容 */
    private String content;
    /**
     * 状态
     * 
     * @see HandlerStatus
     * */
    private HandlerStatus status;

    /** 结果消息 */
    private String retCode;

    /** 结果消息 */
    private String receiveMsg;

    /**
     * @return the serialNo
     */
    public Long getSerialNo() {
        return serialNo;
    }

    /**
     * @param serialNo the serialNo to set
     */
    public void setSerialNo(Long serialNo) {
        this.serialNo = serialNo;
    }

    /**
     * @return the phoneNo
     */
    public Long getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * @return the itemId
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime the createTime to set
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return the finishTime
     */
    public Date getFinishTime() {
        return finishTime;
    }

    /**
     * @param finishTime the finishTime to set
     */
    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the status
     */
    public HandlerStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(HandlerStatus status) {
        this.status = status;
    }

    /**
     * @return the retCode
     */
    public String getRetCode() {
        return retCode;
    }

    /**
     * @param retCode the retCode to set
     */
    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    /**
     * @return the receiveMsg
     */
    public String getReceiveMsg() {
        return receiveMsg;
    }

    /**
     * @param receiveMsg the receiveMsg to set
     */
    public void setReceiveMsg(String receiveMsg) {
        this.receiveMsg = receiveMsg;
    }
}

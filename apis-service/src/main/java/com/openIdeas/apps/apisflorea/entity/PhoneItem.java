package com.openIdeas.apps.apisflorea.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 
 * 手机号记录
 * 
 * @author Evan Mu
 */
@Entity
@Table(name = "AF_PHONE_ITEM")
public class PhoneItem extends IdEntity {
    /**
     */
    private static final long serialVersionUID = 1869923356378753307L;

    /** 手机号 */
    private Long phoneNo;

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
}

/*
 * Copyright (C), 2002-2014, 苏宁易购电子商务有限公司
 * FileName: DateStyle.java
 * Author:   Evan
 * Date:     2014年10月19日 下午4:56:42
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.openIdeas.apps.apisflorea.util;

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author Evan
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public enum DateStyle {
    
    MM_DD("MM-dd"),
    YYYY_MM("yyyy-MM"),
    YYYY_MM_DD("yyyy-MM-dd"),
    MM_DD_HH_MM("MM-dd HH:mm"),
    MM_DD_HH_MM_SS("MM-dd HH:mm:ss"),
    YYYY_MM_DD_HH_MM("yyyy-MM-dd HH:mm"),
    YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd HH:mm:ss"),
    
    MM_DD_EN("MM/dd"),
    YYYY_MM_EN("yyyy/MM"),
    YYYY_MM_DD_EN("yyyy/MM/dd"),
    MM_DD_HH_MM_EN("MM/dd HH:mm"),
    MM_DD_HH_MM_SS_EN("MM/dd HH:mm:ss"),
    YYYY_MM_DD_HH_MM_EN("yyyy/MM/dd HH:mm"),
    YYYY_MM_DD_HH_MM_SS_EN("yyyy/MM/dd HH:mm:ss"),
    
    MM_DD_CN("MM月dd日"),
    YYYY_MM_CN("yyyy年MM月"),
    YYYY_MM_DD_CN("yyyy年MM月dd日"),
    MM_DD_HH_MM_CN("MM月dd日 HH:mm"),
    MM_DD_HH_MM_SS_CN("MM月dd日 HH:mm:ss"),
    YYYY_MM_DD_HH_MM_CN("yyyy年MM月dd日 HH:mm"),
    YYYY_MM_DD_HH_MM_SS_CN("yyyy年MM月dd日 HH:mm:ss"),
    
    HH_MM("HH:mm"),
    HH_MM_SS("HH:mm:ss");
    
    
    private String value;
    
    DateStyle(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}

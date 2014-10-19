/*
 * Copyright (C), 2002-2014, 苏宁易购电子商务有限公司
 * FileName: Week.java
 * Author:   Evan
 * Date:     2014年10月19日 下午4:57:16
 * Description: //模块目的、功能描述      
 * History: //修改记录
 * <author>      <time>      <version>    <desc>
 * 修改人姓名             修改时间            版本号                  描述
 */
package com.openIdeas.apps.apisflorea.enums;

/**
 * 〈一句话功能简述〉<br> 
 * 〈功能详细描述〉
 *
 * @author Evan
 * @see [相关类/方法]（可选）
 * @since [产品/模块版本] （可选）
 */
public enum Week {

    MONDAY("星期一", "Monday", "Mon.", 1),
    TUESDAY("星期二", "Tuesday", "Tues.", 2),
    WEDNESDAY("星期三", "Wednesday", "Wed.", 3),
    THURSDAY("星期四", "Thursday", "Thur.", 4),
    FRIDAY("星期五", "Friday", "Fri.", 5),
    SATURDAY("星期六", "Saturday", "Sat.", 6),
    SUNDAY("星期日", "Sunday", "Sun.", 7);
    
    String name_cn;
    String name_en;
    String name_enShort;
    int number;
    
    Week(String name_cn, String name_en, String name_enShort, int number) {
        this.name_cn = name_cn;
        this.name_en = name_en;
        this.name_enShort = name_enShort;
        this.number = number;
    }
    
    public String getChineseName() {
        return name_cn;
    }

    public String getName() {
        return name_en;
    }

    public String getShortName() {
        return name_enShort;
    }

    public int getNumber() {
        return number;
    }
}

package com.openIdeas.apps.apisflorea.enums;

/**
 * 
 * 下行短信发送状态
 * 
 * @author Evan Mu
 */
public enum AnswerStatus {
    INIT(-1, "初始化"),
    /** 成功*/
    SUCD(0, "成功"),
    /** 系统错误 */
    SysError(1, "系统错误 "),
    /** 帐号错误 */
    AccountError(2, "帐号错误"),
    /** 密码错误 */
    PassError(3, "密码错误"),
    /** 连接数超过限制 */
    LinesOverOut(4, "连接数超过限制"),
    /** 秒发送条目数超过限制 */
    SendItemsOverOut(5, "秒发送条目数超过限制"),
    /** 目的号码受限制 */
    TargetLimited(6, "目的号码受限制"),
    /** 网络错误 */
    LanError(7, "网络错误"),
    /** 月发送条目数超过限制 */
    MonthSendsOverOut(8, "月发送条目数超过限制"),
    /** 客户端关闭连接 */
    ClientCloseConn(9, "客户端关闭连接"),
    /** 短信网关关闭连接 */
    SmsGatewayClose(10, "短信网关关闭连接"),
    /** 超时退出 */
    LogonOutTimedOut(11, "超时退出"),
    /** 连接数据库错误 */
    DBError(12, "连接数据库错误"),
    /** 连接短信网关错误 */
    SmsGatewayError(13, "连接短信网关错误"),
    /** 非法发送内容 */
    IllegalContent(14, "非法发送内容"),
    /** 非法发送时间 */
    IllegalTime(15, "非法发送时间"),
    /** socket连接已经关闭 */
    SocksClosed(16, "socket连接已经关闭"),
    /** 发送号码前缀错误 */
    PhoneNoPrefixError(23, "发送号码前缀错误");

    private int code;
    private String desc;

    AnswerStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }
}

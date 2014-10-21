package com.openIdeas.apps.apisflorea.intf;

import com.linkage.netmsg.NetMsgclient;
import com.linkage.netmsg.server.ReceiveMsg;

public interface AnthenServiceIntf {

    /**
     * 
     * 是否已经认证
     * 
     * @return
     */
    boolean isAnthed();
    
    void closeConn();

    void finallClose();
    
    NetMsgclient reconnect();
    
    /**
     * 
     * 认证请求
     * 
     * @param client
     * @return
     */
    boolean anthenMsg(ReceiveMsg msgImpl);

    /**
     * 获取消息客户端
     * 
     * @return
     */
    NetMsgclient getMsgClient();
}

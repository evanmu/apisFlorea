package com.openIdeas.apps.apisflorea.impl;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.linkage.netmsg.NetMsgclient;
import com.linkage.netmsg.server.ReceiveMsg;
import com.openIdeas.apps.apisflorea.intf.AnthenServiceIntf;
import com.openIdeas.apps.apisflorea.util.PropertyFileUtil;

@Service("anthenService")
public class AnthenServiceImpl implements AnthenServiceIntf {
	private Logger logger = LoggerFactory.getLogger(AnthenServiceImpl.class);

	private NetMsgclient msgClient;

	private boolean isAuthed = false;

	@Override
	public NetMsgclient getMsgClient() {
		return msgClient;
	}

	@Override
	public boolean isAnthed() {
		return isAuthed;
	}

	@Override
	public boolean anthenMsg(ReceiveMsg msgImpl) {
	    msgClient = new NetMsgclient().initParameters(PropertyFileUtil.get("sms.ip"),
                Integer.parseInt(PropertyFileUtil.get("sms.port")), PropertyFileUtil.get("authuser"),
                PropertyFileUtil.get("anthpass"), msgImpl);

        try {
            if (null == msgClient) {
                logger.error("msgClient is null 初始化失败");
                return false;
            }

            boolean result = msgClient.anthenMsg(msgClient);
            isAuthed = result;
            return result;
        } catch (IOException e) {
            logger.error(e.getMessage(), e);
        }

        return false;
	}

	@Override
	public void closeConn() {
		isAuthed = false;
		
		try {
			if (null != msgClient) {
				msgClient.closeConn();
			}
		} catch (Throwable e) {
			logger.warn("closeConn, 关闭连接。");
		}
	}

	@Override
	public void finallClose() {
		isAuthed = false;
		try {
			if (null != msgClient) {
				msgClient.finalClose();
			}
		} catch (Throwable e) {
			logger.warn("closeConn, 完全关闭连接。");
		}
	}

	@Override
	public NetMsgclient reconnect() {
		try {
			if (null != msgClient) {
				msgClient = msgClient.reconnect();
			}
		} catch (Throwable e) {
			logger.warn("closeConn, 完全关闭连接。");
		}
		return msgClient;
	}

}

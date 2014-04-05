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
	private Logger logger = LoggerFactory.getLogger(getClass());

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
		msgClient = new NetMsgclient();
		msgClient = msgClient.initParameters(PropertyFileUtil.get("sms.ip"),
				Integer.parseInt(PropertyFileUtil.get("sms.port")),
				PropertyFileUtil.get("authuser"),
				PropertyFileUtil.get("anthpass"), msgImpl);

		try {
			boolean result = msgClient.anthenMsg(msgClient);
			isAuthed = result;
			// isAuthed = true;
			return result;
		} catch (IOException e) {
			logger.error(e.getMessage(), e);
		}

		return false;
	}

}

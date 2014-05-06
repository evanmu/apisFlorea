package com.openIdeas.apps.apisflorea.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.openIdeas.apps.apisflorea.dao.SmsOpLogDao;
import com.openIdeas.apps.apisflorea.intf.OperatorLogServiceIntf;

public class OperatorLogServiceImpl implements OperatorLogServiceIntf {
	@Autowired
	private SmsOpLogDao smsOpLogDao;

}

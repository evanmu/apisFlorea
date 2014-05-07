package com.openIdeas.apps.apisflorea.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.openIdeas.apps.apisflorea.dao.SmsOpLogDao;
import com.openIdeas.apps.apisflorea.entity.SmsOpLog;
import com.openIdeas.apps.apisflorea.intf.OperatorLogServiceIntf;
import com.openIdeas.apps.apisflorea.result.CollectionResult;

public class OperatorLogServiceImpl implements OperatorLogServiceIntf {
    @Autowired
    private SmsOpLogDao smsOpLogDao;

    /*
     * (non-Javadoc)
     * @see com.openIdeas.apps.apisflorea.intf.OperatorLogServiceIntf#getOplog()
     */
    @Override
    public CollectionResult<List<SmsOpLog>> getOplog() {
        // TODO Auto-generated method stub
        return null;
    }

}

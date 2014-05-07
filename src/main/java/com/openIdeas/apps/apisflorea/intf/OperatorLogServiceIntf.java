package com.openIdeas.apps.apisflorea.intf;

import java.util.List;

import com.openIdeas.apps.apisflorea.entity.SmsOpLog;
import com.openIdeas.apps.apisflorea.result.CollectionResult;

public interface OperatorLogServiceIntf {

    CollectionResult<List<SmsOpLog>> getOplog();
}

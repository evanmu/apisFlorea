package com.openIdeas.apps.apisflorea.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.dao.PhoneItemDao;
import com.openIdeas.apps.apisflorea.dao.SmsOpLogDao;
import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.apisflorea.entity.SmsOpLog;
import com.openIdeas.apps.apisflorea.exception.BizException;
import com.openIdeas.apps.apisflorea.intf.OperatorLogServiceIntf;
import com.openIdeas.apps.apisflorea.result.CollectionResult;

@Service
public class OperatorLogServiceImpl implements OperatorLogServiceIntf {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private SmsOpLogDao smsOpLogDao;

	@Autowired
	private PhoneItemDao phoneItemDao;

	@Override
	public CollectionResult<List<SmsOpLog>> initOplogs(String msgId) {
		// 查询数据库
		String methodName = "initOplogs";
		logger.debug("{} 初始化操作记录, msgId={}", methodName, msgId);
		
		List<SmsOpLog> ols = smsOpLogDao.findByMessageId(msgId);
		if (null != ols && ols.size() > 0) {
			logger.warn("{} msgId：{} 已经进入处理队列,队列长度：{}", new Object[]{methodName, msgId, ols.size()});
			throw new BizException("msgId is proccessing", "消息已经进入处理队列");
		}
		//查出全部手机号
		Iterable<PhoneItem> itera = phoneItemDao.findAll();

		List<SmsOpLog> list = new ArrayList<SmsOpLog>();
		SmsOpLog log = null;
		for (PhoneItem phoneItem : itera) {
			log = new SmsOpLog(msgId, phoneItem.getPhoneNo());
			list.add(log);
		}
		
		smsOpLogDao.save(list);
		
		return new CollectionResult<List<SmsOpLog>>(list);
	}

	@Override
	public CollectionResult<List<SmsOpLog>> getOplog(String msgId) {
		// TODO Auto-generated method stub
		return null;
	}

}

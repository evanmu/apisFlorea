package com.openIdeas.apps.apisflorea.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.dao.PhoneItemDao;
import com.openIdeas.apps.apisflorea.dao.SmsOpLogDao;
import com.openIdeas.apps.apisflorea.entity.PhoneItem;
import com.openIdeas.apps.apisflorea.entity.SmsOpLog;
import com.openIdeas.apps.apisflorea.enums.HandlerStatus;
import com.openIdeas.apps.apisflorea.exception.BizException;
import com.openIdeas.apps.apisflorea.intf.MailMessageServiceIntf;
import com.openIdeas.apps.apisflorea.intf.OperatorLogServiceIntf;
import com.openIdeas.apps.apisflorea.result.CollectionResult;
import com.openIdeas.apps.apisflorea.result.GeniResult;
import com.openIdeas.apps.apisflorea.result.Result;

@Service
public class OperatorLogServiceImpl implements OperatorLogServiceIntf {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private SmsOpLogDao smsOpLogDao;

	@Autowired
	private PhoneItemDao phoneItemDao;

	@Autowired
	private MailMessageServiceIntf mailMessageService;

	@Override
	public CollectionResult<List<SmsOpLog>> initOplogs(String msgId) {
		// 查询数据库
		String methodName = "initOplogs";
		logger.debug("{} 初始化操作记录, msgId={}", methodName, msgId);

		List<SmsOpLog> ols = smsOpLogDao.findByMessageId(msgId);
		if (null != ols && ols.size() > 0) {
			logger.warn("{} msgId：{} 已经进入处理队列,队列长度：{}", new Object[] {
					methodName, msgId, ols.size() });
			throw new BizException("msgId is proccessing", "消息已经进入处理队列");
		}
		// 查出全部手机号
		Iterable<PhoneItem> itera = phoneItemDao.findAll();

		List<SmsOpLog> list = new ArrayList<SmsOpLog>();
		SmsOpLog log = null;
		for (PhoneItem phoneItem : itera) {
			log = new SmsOpLog(msgId, phoneItem.getPhoneNo());
			list.add(log);
		}

		// 保存成功记录
		Iterable<SmsOpLog> its = smsOpLogDao.save(list);
		List<SmsOpLog> ilist = new ArrayList<SmsOpLog>();
		CollectionUtils.addAll(ilist, its.iterator());
		// 更新待发邮件记录在队列数
		Result ur = mailMessageService.updateTotalCount(msgId);

		if (!ur.isSuccess()) {
			logger.warn("{} errorCode:{}, msg:{}", new Object[] { methodName,
					ur.getErrorCode(), ur.getMessage() });
			throw new BizException(ur);
		}
		return new CollectionResult<List<SmsOpLog>>(list);
	}

	@Override
	public CollectionResult<List<SmsOpLog>> getOplog(String msgId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update2Processing(String msgId, Long phoneNo) {
		return updateStatus(msgId, phoneNo, HandlerStatus.P);
	}

	@Override
	public Result update2Sucd(String msgId, Long phoneNo) {
		return updateStatus(msgId, phoneNo, HandlerStatus.S);
	}

	private Result updateStatus(String msgId, Long phoneNo, HandlerStatus status) {
		SmsOpLog log = getSmsOpLog(msgId, phoneNo);
		// 2. 更新状态
		log.setStatus(status);
		smsOpLogDao.save(log);
		return new Result();
	}

	private SmsOpLog getSmsOpLog(String msgId, Long phoneNo) {
		// 1. 获取记录
		SmsOpLog log = smsOpLogDao.findByMsgAndPhone(msgId, phoneNo);
		if (null == log) {
			logger.warn("{} 记录不存在，msgId:{}, phoneNo:{}", new Object[] {
					"update2Processing", msgId, phoneNo });
			throw new BizException("record not exists", "记录不存在");
		}
		return log;
	}

	@Override
	public Result updateSmsSerail(String msgId, Long phoneNo, String smsSerail) {
		SmsOpLog log = getSmsOpLog(msgId, phoneNo);
		log.setSmsSerailNo(smsSerail);
		smsOpLogDao.save(log);
		return new Result();
	}

	@Override
	public GeniResult<String> getMsgId(String smsSerail) {
		
		return null;
	}

}

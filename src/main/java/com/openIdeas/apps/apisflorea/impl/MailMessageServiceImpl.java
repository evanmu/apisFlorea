package com.openIdeas.apps.apisflorea.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.dao.MailMessageDao;
import com.openIdeas.apps.apisflorea.dao.SmsOpLogDao;
import com.openIdeas.apps.apisflorea.entity.MailEntity;
import com.openIdeas.apps.apisflorea.enums.HandlerStatus;
import com.openIdeas.apps.apisflorea.intf.MailMessageServiceIntf;
import com.openIdeas.apps.apisflorea.result.GeniResult;
import com.openIdeas.apps.apisflorea.result.Result;

@Service
public class MailMessageServiceImpl implements MailMessageServiceIntf {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private MailMessageDao mailMessageDao;

	@Autowired
	private SmsOpLogDao smsOpLogDao;

	@Override
	public Result saveMail(MailEntity mail) {
		// 1. 是否存在
		MailEntity mm = getById(mail.getMessageId());
		Result ret = new Result();

		// 如果不是新建，则表示邮件已经在处理
		if (null != mm && HandlerStatus.N.equals(mm.getStatus())) {
			return ret.fail("mail is Processing!");
		}

		if (null != mm) {
			return ret.fail("mail exists!");
		}

		mail.setStatus(HandlerStatus.N);
		// 保存数据
		mailMessageDao.save(mail);
		return ret;
	}

	private MailEntity getById(String id) {
		return mailMessageDao.findOne(id);
	}

	@Override
	public Result updateMailStatus(String id, HandlerStatus status) {
		// 1. 判断是否存在
		MailEntity mm = getById(id);
		Result ret = new Result();

		if (null == mm) {
			return ret.fail("mail not exists!");
		}

		mm.setStatus(status);

		mailMessageDao.save(mm);

		return ret;
	}

	@Override
	public void deleteById(String id) {
		mailMessageDao.delete(id);
	}

	@Override
	public Result updateTotalCount(String msgId) {
		// 1. 查出记录个数
		long count = smsOpLogDao.countByMessageId(msgId);
		logger.debug("updateTotalCount 获取手机记录个数{}", count);
		MailEntity me = getById(msgId);
		me.setTotalCount(count);
		// 2. 更新记录
		mailMessageDao.save(me);
		return new Result();
	}

	@Override
	public GeniResult<MailEntity> getMessage(String msgId) {
		return new GeniResult<MailEntity>(getById(msgId));
	}
}

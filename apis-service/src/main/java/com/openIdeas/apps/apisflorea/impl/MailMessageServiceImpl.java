package com.openIdeas.apps.apisflorea.impl;

import java.sql.Timestamp;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.openIdeas.apps.apisflorea.dao.MailMessageDao;
import com.openIdeas.apps.apisflorea.dao.PhoneItemDao;
import com.openIdeas.apps.apisflorea.dao.SmsOpLogDao;
import com.openIdeas.apps.apisflorea.entity.MailEntity;
import com.openIdeas.apps.apisflorea.enums.HandlerStatus;
import com.openIdeas.apps.apisflorea.exception.BizException;
import com.openIdeas.apps.apisflorea.intf.MailMessageServiceIntf;
import com.openIdeas.apps.apisflorea.mail.RemoteMailServiceIntf;
import com.openIdeas.apps.apisflorea.result.GeniResult;
import com.openIdeas.apps.apisflorea.result.Result;

@Service
public class MailMessageServiceImpl implements MailMessageServiceIntf {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private MailMessageDao mailMessageDao;

	@Autowired
	private SmsOpLogDao smsOpLogDao;

	@Autowired
	private PhoneItemDao phoneItemDao;

	@Autowired
	private RemoteMailServiceIntf remoteMail;

	@Override
	public Result saveMail(MailEntity mail) {
		// 1. 是否存在
		MailEntity mm = getById(mail.getMessageId());
		Result ret = new Result();

		// 如果不是新建，则表示邮件已经在处理
		if (null != mm && !HandlerStatus.N.equals(mm.getStatus())) {
			return ret.fail("mail is Processing!");
		}

		if (null != mm) {
			return ret.fail("mail exists!");
		}

		if (null == mail.getStatus()) {
			mail.setStatus(HandlerStatus.N);
		}

		mail.setCreateTime(new Timestamp(System.currentTimeMillis()));
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

		if (HandlerStatus.S.equals(status)) {
			mm.setFinishTime(new Timestamp(System.currentTimeMillis()));
		}

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
		logger.debug("获取待发送内容 {}", msgId);
		return new GeniResult<MailEntity>(getById(msgId));
	}

	@Override
	@Transactional
	public Result grandSucdCount(String msgId) {
		// 更新成功个数
		int uc = mailMessageDao.increaseSucdCount(msgId);
		if (1 != uc) {
			throw new BizException("更新主记录失败");
		}

		MailEntity me = getById(msgId);

		if (me.getTotalCount() == me.getSucdCount()) {
			logger.debug("{} 的消息所有都成功了", msgId);
			updateMailSucd(msgId);
		}

		mailMessageDao.save(me);
		return null;
	}

	@Override
	public boolean isDealSucd(String msgId) {
		MailEntity mm = getById(msgId);
		// 手机的条数
		long items = phoneItemDao.count();

		if (items == mm.getSucdCount()) {
			updateMailSucd(msgId);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void updateMailSucd(String msgId) {
		MailEntity mm = getById(msgId);
		// 如果主消息记录状态不为S则更新
		if (!HandlerStatus.S.equals(mm.getStatus())) {
			// 更新邮件状态为成功
			updateMailStatus(msgId, HandlerStatus.S);
		}
		remoteMail.reserveMail(msgId);
	}

	@Override
	public void updateMailSucd(String msgId, String comment) {
		MailEntity mm = getById(msgId);
		if (null == mm) {
			logger.warn("updateMailSucd mail not exists");
			return;
		}

		mm.setFinishTime(new Timestamp(System.currentTimeMillis()));
		if (StringUtils.isEmpty(mm.getComments())) {
			mm.setComments(comment);
		}

		// 如果主消息记录状态不为S则更新
		if (HandlerStatus.N.equals(mm.getStatus())) {
			// 更新邮件状态为成功
			updateMailStatus(msgId, HandlerStatus.S);
		}
		remoteMail.reserveMail(msgId);
	}
}

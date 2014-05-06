package com.openIdeas.apps.apisflorea.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openIdeas.apps.apisflorea.dao.MailMessageDao;
import com.openIdeas.apps.apisflorea.entity.MailEntity;
import com.openIdeas.apps.apisflorea.enums.HandlerStatus;
import com.openIdeas.apps.apisflorea.intf.MailMessageServiceIntf;
import com.openIdeas.apps.apisflorea.result.Result;

@Service
public class MailMessageServiceImpl implements MailMessageServiceIntf {

	@Autowired
	private MailMessageDao mailMessageDao;

	@Override
	public Result saveMail(MailEntity mail) {
		//1. 是否存在
		MailEntity mm = getById(mail.getMessageId());
		Result ret = new Result();
		
		//如果不是新建，则表示邮件已经在处理
		if (null != mm && HandlerStatus.N.equals(mm.getStatus())) {
			return ret.fail("mail is Processing!");
		}
		
		if (null != mm) {
			return ret.fail("mail exists!");
		}
		
		mail.setStatus(HandlerStatus.N);
		//保存数据
		mailMessageDao.save(mail);
		return ret;
	}
	
	private MailEntity getById(String id) {
		return mailMessageDao.findOne(id);
	}

	@Override
	public Result updateMailStatus(String id, HandlerStatus status) {
		//1. 判断是否存在
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
}

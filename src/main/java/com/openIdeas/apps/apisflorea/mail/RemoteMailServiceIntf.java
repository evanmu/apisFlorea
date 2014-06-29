package com.openIdeas.apps.apisflorea.mail;

import java.util.List;

import com.openIdeas.apps.apisflorea.result.CollectionResult;
import com.openIdeas.apps.apisflorea.result.Result;

/**
 * 接收邮件服务接口
 * 
 * @author evan
 * 
 */
public interface RemoteMailServiceIntf {

	/**
	 * 获取待处理邮件
	 * @return
	 */
	CollectionResult<List<String>> get2HanlerMail();
	
	/**
	 * 还原邮件状态为未读
	 * @param id
	 * @return
	 */
	Result reserveMail(String id);
	
}

package com.openIdeas.apps.apisflorea.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openIdeas.apps.apisflorea.entity.MailEntity;

@Repository
public interface MailMessageDao extends CrudRepository<MailEntity, String> {

	@Modifying
	@Query("update MailEntity set sucdCount=sucdCount+1 Where messageId=?1")
	int increaseSucdCount(String msgId);
}

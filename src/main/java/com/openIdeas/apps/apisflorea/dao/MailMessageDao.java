package com.openIdeas.apps.apisflorea.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openIdeas.apps.apisflorea.entity.MailEntity;

@Repository
public interface MailMessageDao extends CrudRepository<MailEntity, String> {

}

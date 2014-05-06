package com.openIdeas.apps.apisflorea.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openIdeas.apps.apisflorea.entity.PhoneItem;

@Repository
public interface PhoneItemDao extends CrudRepository<PhoneItem, Long> {

}

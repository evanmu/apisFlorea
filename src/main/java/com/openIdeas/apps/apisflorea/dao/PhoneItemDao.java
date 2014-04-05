package com.openIdeas.apps.apisflorea.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.openIdeas.apps.apisflorea.entity.PhoneItem;

@Component
public interface PhoneItemDao extends CrudRepository<PhoneItem, Long> {

}

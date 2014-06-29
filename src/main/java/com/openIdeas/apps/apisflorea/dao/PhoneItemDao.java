package com.openIdeas.apps.apisflorea.dao;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.openIdeas.apps.apisflorea.entity.PhoneItem;

@Repository
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public interface PhoneItemDao extends CrudRepository<PhoneItem, Long> {

}

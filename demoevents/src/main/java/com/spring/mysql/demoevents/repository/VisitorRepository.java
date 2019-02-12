package com.spring.mysql.demoevents.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.mysql.demoevents.model.Visitor;

/**
 * 
 * To save events to database
 *
 */
@Repository
public interface VisitorRepository extends CrudRepository<Visitor, Integer> {
	
	//public Events save(Events event);

	public List<Visitor> findAll();

	//public void deleteByName(Integer id);

	public void deleteById(Integer id);
	public void find

	//public List<Visitor> findByEmail(String date);

	//public List<Visitor> findByMob(String roomno);

	//public List<Visitor> findByEventname(String eventname);
}



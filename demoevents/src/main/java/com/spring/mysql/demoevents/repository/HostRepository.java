package com.spring.mysql.demoevents.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.spring.mysql.demoevents.model.Host;


/**
 * 
 * To save events to database
 *
 */
@Repository
public interface HostRepository extends JpaRepository<Host, Integer> {
	
	//public Events save(Events event);

	public List<Host> findAll();

	//public List<Visitor> findByEmail(String date);

	//public List<Visitor> findByMob(String roomno);

	//public List<Visitor> findByEventname(String eventname);
}


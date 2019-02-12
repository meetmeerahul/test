package com.spring.mysql.demoevents.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.spring.mysql.demoevents.model.Events;

/**
 * 
 * To save events to database
 *
 */
@Repository
public interface EventRepository extends JpaRepository<Events, Integer> {
	
	//public Events save(Events event);

	public List<Events> findAll();

	public List<Events> findByDate(String date);

	public List<Events> findByRoomno(String roomno);

	public List<Events> findByEventname(String eventname);
//	public Events update(Events event);

}
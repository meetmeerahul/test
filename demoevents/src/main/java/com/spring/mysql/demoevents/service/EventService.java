package com.spring.mysql.demoevents.service;


import java.util.List;

import com.spring.mysql.demoevents.model.Events;

public interface EventService {
	
	public   Events save(Events event); 
	public  List<Events>findAll();
	//public List< Events> findByName(String eventname);
	//public List<Events> findByDate(String date);
	//public List<Events> findByRoomno(String roomno);
//	public String update(Events event);
	//public String save1(Events event);
	public void deleteUserBy(Integer id);
	List<Events> findByDate(String date);

}
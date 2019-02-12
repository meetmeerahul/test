package com.spring.mysql.demoevents.serviceimpl;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mysql.demoevents.model.Events;
import com.spring.mysql.demoevents.repository.EventRepository;
import com.spring.mysql.demoevents.service.EventService;
@Service


public class EventServiceImpl implements EventService{
  @Autowired
  
  EventRepository eventrepo;
  EventService eventservice;

@Override
public Events save(Events event) {
	// TODO Auto-generated method stub
	return eventrepo.save(event);
}
@Override
public List<Events> findAll() {
	// TODO Auto-generated method stub
	return eventrepo.findAll();
}
/*@Override
public String update(Events event) {
	
	return eventrepo.u
}*/
@Override
public void deleteUserBy(Integer id) {
	eventrepo.deleteById(id);
	
}
@Override
public List<Events> findByDate(String date) {
	return eventrepo.findByDate(date);
}




}
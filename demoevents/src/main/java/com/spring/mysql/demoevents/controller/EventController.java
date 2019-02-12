package com.spring.mysql.demoevents.controller;

import java.util.List;

//import java.awt.Event;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mysql.demoevents.model.Events;
import com.spring.mysql.demoevents.service.EventService;

//import com.spring.mysql.demoevents.serviceimpl.EventServiceImpl;
@RestController // returns data as json
@RequestMapping("/events") // maps web requests to specific handler methods

public class EventController {

	@Autowired
	EventService eventservice;

	@PostMapping("/createevent")
	public String createEvent(@RequestBody Events event) {
		eventservice.save(event);
		return "Event Created ";
	}

	@GetMapping("/all")

	public List<Events> findAllevents() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		return eventservice.findAll();
	}

     @PutMapping("/update")

	public String update(@RequestBody Events event) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>");
		eventservice.save(event);
		return " Updated ";
	}
     @DeleteMapping("/deleteevent/{id}")
 	
 	public String deleteData(@PathVariable Integer id) {
 		eventservice.deleteUserBy(id);
 		return "Event deleted ";
     }
     @GetMapping("/date/{date}")
 	public List<Events> findByDate(@PathVariable String date) {
    	 
 		
 	
 			return eventservice.findByDate(date);
 		


 	}
   
}
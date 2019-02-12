package com.spring.mysql.demoevents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mysql.demoevents.model.Host;
import com.spring.mysql.demoevents.service.HostService;

@RestController 
@RequestMapping("/host") 

public class HostController {
	@Autowired
	HostService hostservice;
	
	@PostMapping("/addhost")
	public String createHost(@RequestBody Host host)
	{
		hostservice.save(host);
		return "Host added ";
	}
@GetMapping("/seehost")
	
	public List<Host> findAllhost() {
		
		return hostservice.findAll();
	}
@PutMapping("/updatehost")
  public String updateHost(@RequestBody Host host)
  {
	hostservice.save(host);
	return " Host details updated ";
  }
@DeleteMapping("/deletehost/{id}")
	
	public String deleteData(@PathVariable Integer id) {
		hostservice.deleteHostBy(id);
		return "Event deleted ";
 }
}
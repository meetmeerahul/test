package com.spring.mysql.demoevents.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.spring.mysql.demoevents.model.Host;
import com.spring.mysql.demoevents.model.Visitor;
import com.spring.mysql.demoevents.service.VisitorService;

@RestController 
@RequestMapping("/visitor") 

public class VisitorController {
	@Autowired
	VisitorService visitorservice;
	
	@PostMapping("/addvisitor")
	public String createVisitor(@RequestBody Visitor visitor)
	{
		System.out.println(visitor.toString());
		Visitor visitorRe =visitorservice.save(visitor);
		if(visitorRe==null)
		{
			return " canot add empty value ";
		}
		else
		{
			return " Visitor Added ";
		}
		
	} 
	
    @GetMapping("/seeall")
	public List<Visitor> findAllvisitor() {
		
		return visitorservice.findAll();
	}
    
    @PutMapping("/updatevisitor")
    public String updateVisitor(@RequestBody Visitor visitor)
    {
  	visitorservice.save(visitor);
  	return " Visitor data updated ";
    }
    
    @DeleteMapping("/deletevisitor/{id}")
	public String deleteVisitor(@PathVariable Integer id) {
		visitorservice.deleteVisitortBy(id);
		return "Visitor deleted ";
    }
}

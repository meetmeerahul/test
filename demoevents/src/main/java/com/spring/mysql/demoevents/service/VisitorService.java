package com.spring.mysql.demoevents.service;


import java.util.List;


import com.spring.mysql.demoevents.model.Visitor;

public interface VisitorService {
	public   Visitor save(Visitor visitor); 
	public  List<Visitor>findAll();
	public void deleteVisitortBy(Integer id);
}

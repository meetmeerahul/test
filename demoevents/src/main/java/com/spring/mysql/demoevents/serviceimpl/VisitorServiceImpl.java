package com.spring.mysql.demoevents.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.mysql.demoevents.model.Visitor;

import com.spring.mysql.demoevents.repository.VisitorRepository;
import com.spring.mysql.demoevents.service.VisitorService;

@Service 
public class VisitorServiceImpl implements VisitorService {
	@Autowired
	  
	VisitorRepository visitrepo;

	@Override
	public Visitor save(Visitor visitor) {
		return visitrepo.save(visitor);
	}

	@Override
	public List<Visitor> findAll() {
		// TODO Auto-generated method stub
		return visitrepo.findAll();
	}

	@Override
	public void deleteVisitortBy(Integer id) {
		visitrepo.deleteById(id);
		
	}


	/*@Override
	public List<Visitor> findAll() {
		
		return null;
	}*/



}

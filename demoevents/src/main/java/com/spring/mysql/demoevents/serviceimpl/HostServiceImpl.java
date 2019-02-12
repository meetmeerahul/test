package com.spring.mysql.demoevents.serviceimpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mysql.demoevents.model.Host;

import com.spring.mysql.demoevents.repository.HostRepository;

import com.spring.mysql.demoevents.service.HostService;


@Service 
public class HostServiceImpl implements HostService {
	@Autowired
	  
	HostRepository hostrepo;

	@Override
	public Host save(Host host) {
		
		return hostrepo.save(host);
	}

	@Override
	public List<Host> findAll() {
		
		return hostrepo.findAll();
	}

	@Override
	public void deleteHostBy(Integer id) {
		hostrepo.deleteById(id);
		
	}

	



}


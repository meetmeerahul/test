package com.spring.mysql.demoevents.service;


import java.util.List;

import com.spring.mysql.demoevents.model.Host;


public interface HostService {
	public   Host save(Host host); 
	public  List<Host>findAll();
	public void deleteHostBy(Integer id);
}

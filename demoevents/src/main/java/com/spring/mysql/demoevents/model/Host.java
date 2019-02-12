package com.spring.mysql.demoevents.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "host")
public class Host {
	
    @Id
    private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	private String name;
	private String empid;
	private String designation;
	private String department;
	private String mob;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	
	public Host(String name,String empid,String designation,String department,String mob, int id)
	{
		super();
		this.id=id;
		this.name=name;
		this.empid=empid;
		this.designation=designation;
		this.department=department;
		this.mob=mob;
	}
	
	 public Host()
	   {
		   super();
	   }
	
	 public String toString() {
			return "Host [id="+id+",name=" + name + ", mob=" + mob + ", empid=" + empid + ", designation=" + designation+ ", department=" + department +"]";
		}

}

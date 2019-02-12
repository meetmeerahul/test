package com.spring.mysql.demoevents.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "visitor")
public class Visitor {
    @Id
    private int id;
	private String name;
	private String mob;
	private String email;
	private  String category;
	private  String host;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	 public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
	public Visitor( String name,String mob,String email,String category,String host, int id) {
		super();
		this.id=id;
		this.name = name;
		this.mob = mob;
		this.email = email;
		this.category = category;
		this.host=host;
	}
  
public Visitor()
   {
	   super();
   }
   @Override
   public String toString() {
		return "Events [id="+ id +",name=" + name + ", mob=" + mob + ", email=" + email + ", category=" + category+ ", host=" + host +"]";
	}
}

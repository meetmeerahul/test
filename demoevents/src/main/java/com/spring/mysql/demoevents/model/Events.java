package com.spring.mysql.demoevents.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Events {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eventid;
	private String eventname;
	private String date;
	private String roomno;

	public int getEventid() {
		return eventid;
	}

	public void setEventid(int eventid) {
		this.eventid = eventid;
	}

	public String getEventname() {
		return eventname;
	}

	public void setEvent_name(String eventname) {
		this.eventname = eventname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRoomno() {
		return roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	public Events(int eventid, String eventname, String date, String roomno) { // with this default constructor must.
		super();
		this.eventid = eventid;
		this.eventname = eventname;
		this.date = date;
		this.roomno = roomno;
	}

	public Events() {
		super();

	}

	@Override
	public String toString() {
		return "Events [eventid=" + eventid + ", eventname=" + eventname + ", date=" + date + ", roomno=" + roomno
				+ "]";
	}

}
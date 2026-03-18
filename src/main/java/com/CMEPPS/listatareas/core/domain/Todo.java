package com.CMEPPS.listatareas.core.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="todos")

public class Todo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String userName;
	private String description;
	private Date targetDate;
	private String short_description;
	
	
	
	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Todo(String userName, String description, Date targetDate, boolean isDone) {
		super();
		this.userName = userName;
		this.description = description;
		this.targetDate = targetDate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTargetDate() {
		return targetDate;
	}
	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}
	public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	
	

}

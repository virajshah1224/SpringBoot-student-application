package com.example.student.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private long id;
	private String name;
	private String emailID;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(long id, String name, String emailID) {
		super();
		this.id = id;
		this.name = name;
		this.emailID = emailID;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", emailID=" + emailID + "]";
	}
}

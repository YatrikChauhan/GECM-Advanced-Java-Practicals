package com.yatrik;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="E")
@Table(name="Employee_Details")
public class User {
	@Id
	@GeneratedValue
	@Column(name="Emp_Id")
	private int id;
	@Column(name="Emp_First_Name")
	private String fname;
	@Column(name="Emp_Last_Name")
	private String lname;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
}

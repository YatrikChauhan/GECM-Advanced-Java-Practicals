package com.yatrik;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	@Id
	private int Lid;
	private String lname;
	@ManyToMany
	private List<Student> stud = new ArrayList<Student>();
	
	public List<Student> getStud() {
		return stud;
	}
	public void setStud(List<Student> stud) {
		this.stud = stud;
	}
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
}

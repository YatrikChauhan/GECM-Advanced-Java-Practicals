package com.yatrik;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class JavaBean {
	private String uname;
	private Integer age;
	private Date dob;
	private int result;
	
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getUname() {
		return uname;
	}
	public Integer getAge() {
		return age;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}

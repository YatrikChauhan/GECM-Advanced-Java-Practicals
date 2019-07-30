package com.yatrik;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class user {
double amount;
String name;
String uname;
int no;

public int getNo() {
	return no;
}

public void setNo(int no) {
	this.no = no;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

}

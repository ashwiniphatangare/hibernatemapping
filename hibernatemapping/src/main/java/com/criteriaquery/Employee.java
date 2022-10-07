package com.criteriaquery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue
  int eid;
 public Employee(String ename, double esal, String ecity, String edesg) {
		super();
	
		this.ename = ename;
		this.esal = esal;
		this.ecity = ecity;
		this.edesg = edesg;
	}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
String ename;
 double esal;
 public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getEsal() {
	return esal;
}
public void setEsal(double esal) {
	this.esal = esal;
}
public String getEcity() {
	return ecity;
}
public void setEcity(String ecity) {
	this.ecity = ecity;
}
public String getEdesg() {
	return edesg;
}
public void setEdesg(String edesg) {
	this.edesg = edesg;
}
String ecity;
 String edesg;
}

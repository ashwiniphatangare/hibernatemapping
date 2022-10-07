package com.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class emp {
	@Id
	private int eid;
	
	String empname;
	@ManyToMany
	private dept d;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public dept getD() {
		return d;
	}
	public void setD(dept d) {
		this.d = d;
	}
}

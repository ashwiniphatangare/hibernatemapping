package com.manytomany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;



@Entity
public class dept {
	@Id
	private int did;
	
	String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public emp getE() {
		return e;
	}
	public void setE(emp e) {
		this.e = e;
	}
	@ManyToMany
	private emp e;
}

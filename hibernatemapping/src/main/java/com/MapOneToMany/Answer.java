package com.MapOneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answer {
@Id
private int aid;
private String solution;

@ManyToOne
private Question que;
public int getAid() {
	return aid;
}

public void setAid(int aid) {
	this.aid = aid;
}

public String getSolution() {
	return solution;
}

public void setSolution(String solution) {
	this.solution = solution;
}

public Question getQue() {
	return que;
}

public void setQue(Question que) {
	this.que = que;
}




}

package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Answer {
@Id
	private long ansId;
	private String ansName;
	
	private Question que_id;
	@OneToOne(mappedBy="answer")
	public long getAnsId() {
		return ansId;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setAnsId(long ansId) {
		this.ansId = ansId;
	}

	public String getAnsName() {
		return ansName;
	}

	public void setAnsName(String ansName) {
		this.ansName = ansName;
	}

	public Question getQue_id() {
		return que_id;
	}

	public void setQue_id(Question que_id) {
		this.que_id = que_id;
	}

	public Answer(long ansId, String ansName, Question que_id) {
		super();
		this.ansId = ansId;
		this.ansName = ansName;
		this.que_id = que_id;
	}

	
	
	
}

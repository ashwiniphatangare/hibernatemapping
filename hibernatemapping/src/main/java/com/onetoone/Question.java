package com.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question {
@Id
	private int questionId;
private String questionName;
@OneToOne
@JoinColumn(name="ans_id")
private Answer answer;
public Question() {
	super();
	// TODO Auto-generated constructor stub
}
public Question(int questionId, String questionName, Answer answer) {
	super();
	this.questionId = questionId;
	this.questionName = questionName;
	this.answer = answer;
}
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestionName() {
	return questionName;
}
public void setQuestionName(String questionName) {
	this.questionName = questionName;
}
public Answer getAnswer() {
	return answer;
}
public void setAnswer(Answer answer) {
	this.answer = answer;
}
	
	
}

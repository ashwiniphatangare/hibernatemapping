package com.MapOneToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="QuestionName")
public class Question {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int qid;
@Column(name="questionname",length=100,unique=true,nullable=false)

private String qname;

@OneToMany(mappedBy="que")

private List<Answer> ans;

public int getQid() {
	return qid;
}

public void setQid(int qid) {
	this.qid = qid;
}

public String getQname() {
	return qname;
}

public void setQname(String qname) {
	this.qname = qname;
}

public List<Answer> getAns() {
	return ans;
}

public void setAns(List<Answer> ans) {
	this.ans = ans;
}

}

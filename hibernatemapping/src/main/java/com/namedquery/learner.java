package com.namedquery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
@NamedQueries({@NamedQuery(name = "findLearnerbyId",query = "from learner l where l.learner_id =:Id1"),
		@NamedQuery(name = "findLearnerbyName",query = "from learner l where l.learner_name like 'A%' "),
		@NamedQuery(name = "findLearnerDesc",query = "from learner order by learner_name asc "),
		
		@NamedQuery(name = "findLearnerBasedName",query = "from learner l where l.learner_name =:name")}

)
@Entity
public class learner {
	public learner() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue
 int learner_id;
String learner_name,learner_city;
public learner(String learner_name, String learner_city) {
	super();
	this.learner_name = learner_name;
	this.learner_city = learner_city;
}
public int getLearner_id() {
	return learner_id;
}
public void setLearner_id(int learner_id) {
	this.learner_id = learner_id;
}
public String getLearner_name() {
	return learner_name;
}
public void setLearner_name(String learner_name) {
	this.learner_name = learner_name;
}
public String getLearner_city() {
	return learner_city;
}
public void setLearner_city(String learner_city) {
	this.learner_city = learner_city;
}
 
}
//private int learner_id;
//private String learner_name;
//private String learner_city;
package com.MapOneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.MapOneToMany.Answer;
import com.MapOneToMany.Question;

public class OneToMany {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = null;
		tx=ses.beginTransaction();

		Question question=new Question();
		question.setQname("inheristance");
		
		Answer answer=new Answer();
		answer.setAid(1);
		answer.setSolution("encapsulation");
		answer.setQue(question);
		
		
		Answer answer1=new Answer();
		answer1.setAid(31);
		answer1.setSolution("inheri");
		answer1.setQue(question);
		
		
		Answer answer2=new Answer();
		answer2.setAid(2);
		answer2.setSolution("poly");
		answer2.setQue(question);
		
		List<Answer> list1=new ArrayList<Answer>();
		list1.add(answer);
		list1.add(answer2);
		list1.add(answer1);
		
		question.setAns(list1);
		ses.save(question);
		ses.save(answer);
		ses.save(answer1);
		ses.save(answer2);
		tx.commit();
		ses.close();
		
		
	}

}

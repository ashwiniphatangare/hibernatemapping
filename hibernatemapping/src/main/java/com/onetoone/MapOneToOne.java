package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.getCurrentSession();
		Transaction tx = null;
		
			Answer ans=new Answer();
			ans.setAnsId(1);
			ans.setAnsName("hgvjhvh");
			
			Question que=new Question();
			que.setAnswer(ans);
			que.setQuestionId(1);
			que.setQuestionName("jhk");
			
			ans.setQue_id(que);
			ses=factory.openSession();
			tx=ses.beginTransaction();
			ses.save(que);
			tx.commit();
			
		
	}

}

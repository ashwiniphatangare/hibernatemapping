package com.namedquery;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class MainNamedQuery {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = null;
		tx=ses.beginTransaction();
//		Query query=ses.getNamedQuery("findLearnerBasedName");
//	//	query.setInteger("Id1", 1);
//		query.setString("name", "Ash");
//	//	Query query=ses.getNamedQuery("findLearnerDesc");
//
//		List<learner> li=query.list();
//		for (int i = 0; i < li.size(); i++) {
//			//System.out.println("id: "+li.get(i).getLearner_id());
//		System.out.println("city: "+li.get(i).getLearner_city());
//			//
//		System.out.println("name: "+li.get(i).getLearner_name());
//
//		}
////		learner l=new learner("ASh","sangam");
////		learner l1=new learner("radhay","akole");
////		ses.persist(l);
////ses.persist(l1);
//		
//		
//		Query query=ses.createQuery("select count(learner_id) from learner");
//		System.out.println("count "+query.list().get(0));
		
		
		//for dlt
//		Query query=ses.createQuery("delete from learner where learner_id=:learner_id");	
//		query.setParameter("learner_id", 2);
//		int status=query.executeUpdate();
//		System.out.println("status:"+status);
		
		//for update
		Query query=ses.createQuery("update learner set learner_name=:learner_name where learner_id=:learner_id");	
		
		query.setParameter("learner_id", 1);
		query.setParameter("learner_name", "shiv");
		int status=query.executeUpdate();
		System.out.println("status:"+status);
		tx.commit();
		ses.close();
		
		

	}

}

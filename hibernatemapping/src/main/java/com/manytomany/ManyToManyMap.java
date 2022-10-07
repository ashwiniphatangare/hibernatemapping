package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyMap {

	public static <e> void main(String[] args) {		
		Item1 item1=new Item1();
		item1.setDescription("samsung");
		item1.setPrice(300);
		
		Item1 item2=new Item1();
		item2.setDescription("nokia");
		item2.setPrice(400);
		
		Cart1 cart1=new Cart1();
		cart1.setTotal(700);
		Set<Item1> items=new HashSet<Item1>();
		items.add(item1);
		items.add(item2);
		cart1.setItems(items);
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = null;
		tx=ses.beginTransaction();
		ses.save(cart1);
		System.out.println("before commiting transation...");
		tx.commit();
		ses.close();
		System.out.println("cart_id"+cart1.getId());
				System.out.println("item1_id"+item1.getId());
						System.out.println("item2_id"+item2.getId());
		
	}

}

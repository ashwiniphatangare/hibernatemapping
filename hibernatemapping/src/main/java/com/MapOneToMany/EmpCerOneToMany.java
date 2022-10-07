package com.MapOneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpCerOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = null;
		tx=ses.beginTransaction();
		
		Employee employee=new Employee();
		employee.setId(1);
		employee.setEname("Gajanan");
	
		
		
Certificate certificate=new Certificate();
certificate.setId(1);
certificate.setCname("java");
certificate.setEmployee(employee);

Certificate certificate1=new Certificate();
certificate1.setId(2);
certificate1.setCname("cpp");
certificate1.setEmployee(employee);

Certificate certificate2=new Certificate();
certificate2.setId(3);
certificate2.setCname("project exibition");
certificate2.setEmployee(employee);


List<Certificate> list1=new ArrayList<Certificate>();
list1.add(certificate);
list1.add(certificate1);
list1.add(certificate2);

employee.setCertificate(list1);

ses.save(employee);
ses.save(certificate);
ses.save(certificate1);
ses.save(certificate2);
tx.commit();
ses.close();

	}

}

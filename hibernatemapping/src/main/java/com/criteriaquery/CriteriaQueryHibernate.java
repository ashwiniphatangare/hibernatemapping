package com.criteriaquery;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.CountProjection;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.build.AllowSysOut;

import com.namedquery.learner;

public class CriteriaQueryHibernate {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session ses = factory.openSession();
		Transaction tx = null;
		tx = ses.beginTransaction();
		
		
		// insert data
		Employee e=new Employee("AShwini",2345,"pune","tester");
//		Employee e1=new Employee(2,"Arti",25000,"thane","Senior developer");
//		Employee e2=new Employee(3,"maya",5000,"pune","teamlead");
//		Employee e3=new Employee(4,"sejal",67000,"mumbai","developer");
//		Employee e4=new Employee(5,"sakhi",8000,"mumbai","junior dev");
//
//		ses.save(e1);
//		ses.save(e2);
//		ses.save(e3);
//		ses.save(e4);
ses.save(e);
		
		
		
		
		// fetch all data
//		Criteria cr=ses.createCriteria(Employee.class);
//        List Employee=cr.list();
//        for (Iterator iterator = Employee.iterator(); iterator.hasNext();) {
//			Employee l = (Employee) iterator.next();
//			System.out.println("employee name: "+l.getEname());
//			System.out.println("employee sal: "+l.getEsal());
//			System.out.println("employee city: "+l.getEcity());
//
//			System.out.println("edesignation: "+l.getEdesg());
//
//			
//		}


		
		

		// count the number of employee
//                long count=(Long).setProjection(Projections.rowCount()).add(Restrictions.like("ecity","m%")).uniqueResult();
//      System.out.println("number of emp:"+count);

		
		
		
		// print using for loop
//      Criteria cr=ses.createCriteria(Employee.class);
		// ses.createCriteria(Employee.class)
		// List <Employee> emp=cr.list();
//    emp=ses.createCriteria(Employee.class).add(Restrictions.like("ecity","m%")).list();
//    for(Employee emp1:emp) {
//    	System.out.println("employee name staring with m: "+emp1.getEname());
//    	
//    }

		
		
		// using min and max
//		Double minsal=(Double)ses.createCriteria(Employee.class).setProjection(Projections.min("esal")).uniqueResult();
//  	System.out.println("employee min salry  is: "+minsal);

		
		
		// using greater than gt
//		Criteria cr = ses.createCriteria(Employee.class);
//		List<Employee> emp = cr.list();
//		emp = ses.createCriteria(Employee.class).add(Restrictions.gt("esal", 8000.00)).list();
//		for (Employee emp1 : emp) {
//			System.out.println("employee Greater than salry  is: " + emp1.getEsal());
//
//		}
		
		
//		 using less than lt
//		Criteria cr = ses.createCriteria(Employee.class);
//		List<Employee> emp = cr.list();
//		emp = ses.createCriteria(Employee.class).add(Restrictions.lt("esal", 8000.00)).list();
//		for (Employee emp1 : emp) {
//			System.out.println("employee less than salry  is: " + emp1.getEsal());
//
//		}
		
		
		
		// using less than equal le
//				Criteria cr = ses.createCriteria(Employee.class);
//				List<Employee> emp = cr.list();
//				emp = ses.createCriteria(Employee.class).add(Restrictions.le("esal", 8000.00)).list();
//				for (Employee emp1 : emp) {
//					System.out.println("employee less than eqqual salry  is: " + emp1.getEsal());
//
//				}
//		
		
		
		// using greater than equal to ge
//				Criteria cr = ses.createCriteria(Employee.class);
//				List<Employee> emp = cr.list();
//				emp = ses.createCriteria(Employee.class).add(Restrictions.ge("esal", 8000.00)).list();
//				for (Employee emp1 : emp) {
//					System.out.println("employee greater than equal salry  is: " + emp1.getEsal());
//
//				}
		
//		// using not equal ne
//				Criteria cr = ses.createCriteria(Employee.class);
//				List<Employee> emp = cr.list();
//				emp = ses.createCriteria(Employee.class).add(Restrictions.ne("esal", 8000.00)).list();
//				for (Employee emp1 : emp) {
//					System.out.println("employee not equal  salry  is: " + emp1.getEsal());
//
//				}
//		
		
		
		
		// using equal eq
//		Criteria cr = ses.createCriteria(Employee.class);
//		List<Employee> emp = cr.list();
//		emp = ses.createCriteria(Employee.class).add(Restrictions.eq("esal", 8000.00)).list();
//		for (Employee emp1 : emp) {
//			System.out.println("employee equal salry  is: " + emp1.getEsal());
//
//		}
		
		
		// using between
//		Criteria cr = ses.createCriteria(Employee.class);
//		List<Employee> emp = cr.list();
//		emp = ses.createCriteria(Employee.class).add(Restrictions.between("esal", 5000.00,25000.00)).list();
//		for (Employee emp1 : emp) {
//			System.out.println("employee equal salry  is: " + emp1.getEsal());
//
//		}
		
		// using ascending order
//		Criteria cr = ses.createCriteria(Employee.class);
//		List<Employee> emp = cr.list();
//		cr.addOrder(Order.asc("esal")).list();
//		for (Employee emp1 : emp) {
//			System.out.println("employee order by ascendingsalry  is: " + emp1.getEsal());
//
//		}
//		
		
		
		// using count distinct
//		Criteria cr = ses.createCriteria(Employee.class);
//		List<Employee> emp = cr.list();
//		emp = ses.createCriteria(Employee.class).add((Criterion) Projections.countDistinct("ecity")).list();
//		for (Employee emp1 : emp) {
//			System.out.println("employee equal salry  is: " + emp1.getEsal());
//
//		}

		
		// using group by
//		Query q=ses.createQuery("select e.ename,e.ecity,count(e.ecity) from Employee e group by e.ecity");
//		List<Object[]> list=q.list();
//		for (Object[] arr : list) {
//			System.out.println(Arrays.toString(arr));
//			
//		}
		
		// using having
		Query q=ses.createQuery("select e.ecity,count(e.ecity) from Employee e group by e.ecity having count(eid)>1 and ecity='mumbai' ");//[mumbai, 2]
		Query q1=ses.createQuery("select e.ecity,count(e.ecity) from Employee e group by e.ecity having count(eid)>1  ");//output Hibernate: select employee0_.ecity as col_0_0_, count(employee0_.ecity) as col_1_0_ from Employee employee0_ group by employee0_.ecity having count(employee0_.eid)>1
//		[pune, 2]
//				[mumbai, 2]
		List<Object[]> list=q.list();
		for (Object[] arr : list) {
			System.out.println(Arrays.toString(arr));
			
		}
		tx.commit();
		ses.close();
	}



}

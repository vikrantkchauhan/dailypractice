package com.vikrant.fetcheagervslazy;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName("Vikrant chauhan");
		
		//mobile object
		Mobile mb = new Mobile();
		mb.setMid(1);
		mb.setMob("121212");
		
		Mobile mb1 = new Mobile();
		mb1.setMid(2);
		mb1.setMob("9999");
		
		List<Mobile> l1 = new ArrayList<Mobile>();
		l1.add(mb);
		l1.add(mb1);
		
		emp.setMb(l1);
		
		Transaction tx = session.beginTransaction();
		session.save(mb);
		session.save(mb1);
		session.save(emp);
		
		
		tx.commit();
		session.close();
		
		
		
		
		
	}

}

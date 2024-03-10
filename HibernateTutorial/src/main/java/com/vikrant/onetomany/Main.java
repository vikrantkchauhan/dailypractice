package com.vikrant.onetomany;

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

		

		// Creating the human object

		Human obj = new Human();
		obj.setId(1012);
		obj.setName("Vikrant");

		// Creating the mobile numbers for vikrant
		MobileNumber mob1 = new MobileNumber();
		mob1.setMid(1);
		mob1.setMobno(123);
		MobileNumber mob2 = new MobileNumber();
		mob2.setMid(2);
		mob2.setMobno(456);
		MobileNumber mob3 = new MobileNumber();
		mob3.setMid(3);
		mob3.setMobno(45778);
		MobileNumber mob4 = new MobileNumber();
		mob4.setMid(4);
		mob4.setMobno(789);
		MobileNumber mob5 = new MobileNumber();
		mob5.setMid(5);
		mob5.setMobno(9098);

		List<MobileNumber> l1 = new ArrayList<>();
		l1.add(mob1);
		l1.add(mob2);
		l1.add(mob3);
		l1.add(mob4);
		l1.add(mob5);

		obj.setMob(l1);
		
		Transaction tx = session.beginTransaction();
		session.persist(obj);
		
		session.persist(mob1);
		session.persist(mob2);
		session.persist(mob3);
		session.persist(mob4);
		session.persist(mob5);
		
		tx.commit();
		
		
		Human obj1 = (Human)session.get(Human.class, 1012);
		System.out.println(obj1);
		
		MobileNumber obj2 = (MobileNumber)session.get(MobileNumber.class, 1);
		System.out.println(obj2);
		
		session.close();

	}

}

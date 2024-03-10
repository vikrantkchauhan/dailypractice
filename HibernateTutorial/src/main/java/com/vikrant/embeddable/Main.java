package com.vikrant.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

			System.out.println("Starting");
		Configuration cfg = new Configuration();

		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Student stu = new Student();
		stu.setName("Vikrant");
		stu.setGender("Male");

		// Creating address
		Address addr = new Address();
		addr.setCity("Noorpur");
		addr.setStreet("two");

		stu.setAddr(addr);

		session.persist(stu);

		tx.commit();
		session.close();

	}

}

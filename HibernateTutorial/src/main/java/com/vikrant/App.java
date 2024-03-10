package com.vikrant;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		// 1.Setting the configuration file info

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// 2. Creating the session factory ref it is a interface
		// like the connection in jdbc , it is threadsafe object only one instance
		// in the project
		// creating object with the help of the cfg reg
		
		SessionFactory factory = cfg.buildSessionFactory();

		// Checking whether the instance is created or not
		System.out.println(factory);
		
		//Checking wether the factory is closed or not
		System.out.println(factory.isClosed());
		
		//Creating the object
		Employee emp = new Employee();
		emp.setEmp_id(1001);
		emp.setName("Vikrant Chauhan");
		emp.setCity("Gurgaon");
		
		//Creating the session
		
		Session session = factory.openSession();
		
		//Creating the transaction
		Transaction tx = session.beginTransaction();
		
		//saving the object using the save method
		
		session.save(emp);
		
		//Committing the transaction
		tx.commit();
		
		//Closing the session
		session.close();
		
		
		
		
		
		
		
		

	}
}

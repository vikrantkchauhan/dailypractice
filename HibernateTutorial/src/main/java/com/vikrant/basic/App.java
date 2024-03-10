package com.vikrant.basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		// Calling method to save the data
		savingData();
	}

	public static void savingData() throws IOException {
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

		// Checking wether the factory is closed or not
		System.out.println(factory.isClosed());

		// Creating the Employee object
		Employee emp = new Employee();
		emp.setEmp_id(1001);
		emp.setName("Vikrant kumar Chauhan");
		emp.setCity("Gurgaon");

		// creating object of address class
		Address add = new Address();
		add.setAdd_id(1001);
		add.setCity("Noorpur");
		add.setCountry("India");
		add.setPincode(1212121);
		add.setCreated(new Date());

		// Reading the image data
		FileInputStream fis = new FileInputStream("src/main/java/a.jpg");
		byte[] image = new byte[fis.available()];
		fis.read(image);
		add.setImage(image);

		// Creating the session
		Session session = factory.openSession();

		// Creating the transaction
		Transaction tx = session.beginTransaction();

		// saving the object using the save method
		//session.save(emp);
		session.save(add);
		session.persist(emp);

		// retrieving the data using the get
		//Here in this case only one time the select querry fires, it will diplay or return the data from the cache in case of same request
		//using get if the data for that id is not present then it will return null
		//better to use when we are not sure that the data is present or not
		Address add1 = (Address) session.get(Address.class, 1);
		Address add2 = (Address) session.get(Address.class, 1);
		Address add3 = (Address) session.get(Address.class, 1);
		
		System.out.println(add1.getCity());
		System.out.println(add2.getCity());
		
		//Retrieving using the load
		//will only get the object of connection from pool
		Address add5 = (Address)session.load(Address.class,44); //will throw object not found exception
		Address add6 = (Address)session.load(Address.class,1);
		Address add7 = (Address)session.load(Address.class,1);
		
		System.out.println(add5);
		System.out.println(add6);
		System.out.println(add7);
		//fires select querry here
		//so lazy instantialization
		System.out.println(add5.getCity());

		// Committing the transaction
		tx.commit();

		// Closing the session
		session.close();
	}
}

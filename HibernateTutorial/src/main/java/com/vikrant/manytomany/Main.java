package com.vikrant.manytomany;

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
		
		Transaction tx = session.beginTransaction();
		
		//Creating employee object1
		Employee e = new Employee();
		e.setEid(101);
		e.setEname("Vikrant Chauhan");
		
		//Creating employee object2
		Employee e1 = new Employee();
		e1.setEid(102);
		e1.setEname("Prashant Chauhan");
		
		//Creating project object1
		
		Project p = new Project();
		p.setPid(1001);
		p.setPname("LexisNexis");
		
		//creating project object2
		Project p2 = new Project ();
		p2.setPid(1002);
		p2.setPname("HSBC");
		
		//creating list of Employee to be mapped with project
		//adding two employees to the list 
		List<Employee> emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e);
		
		//creating list of project
		//adding two projects
		List<Project> pr = new ArrayList<>();
		pr.add(p2);
		pr.add(p);
		
		//setting two project for single employee e
		e.setProject(pr);
		
		//setting singleproject to two employees
		p2.setEmployee(emp);
		
		session.persist(e);
		session.persist(e1);
		session.persist(p);
		session.persist(p2);
		
		
		
		tx.commit();
		session.close();
	}

}

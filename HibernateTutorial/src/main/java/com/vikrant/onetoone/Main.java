package com.vikrant.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class Main {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		
		
		// creating question
		Questions ques = new Questions();
		ques.setQuesid(101);
		ques.setQuesdesc("What is java");
		
		//creating answer
		Answers ans = new Answers();
		ans.setAns_id(201);
		ans.setAnsdesc("Java is a object oriented programming language");
		
		//setting question primary key in answer
		ans.setQues(ques);
		
		//setting the primary key of answer a foreign key in the question tabl
		ques.setAns(ans); 
		
		Transaction tx = session.beginTransaction();
		
		session.persist(ques);
		session.persist(ans);
		
		tx.commit();
		
		//Retrieving the data
		
		Questions objget =(Questions)session.get(Questions.class, 101);
		System.out.println("Question id is:"+objget.getQuesid());
		System.out.println("Question desc is:"+objget.getQuesdesc());
		System.out.println("Question answer is"+objget.getAns().getAnsdesc());
		
		System.err.println("Completed");
		session.close();

	}

}

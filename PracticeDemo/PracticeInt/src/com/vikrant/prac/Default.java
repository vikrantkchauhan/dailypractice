package com.vikrant.prac;


interface a{
	
	static void displaysalary() {
		System.out.println("salary from interface displayed");
	}
	void displayname();
	default void displayage() {
		System.out.println("sddsds");
	}
	
}

class Employeea implements a{

	@Override
	public void displayname() {
		System.out.println("EMployee name");
		
	}
	
}

class Student implements a{

	@Override
	public void displayname() {
		System.out.println("Student name");
		
	}
	
	@Override
	 public  void displayage() {
		System.out.println("student age");
	}
	
	
	
	
}
public class Default {
	
	public static void main(String[] args) {
		Student obj = new Student();
		obj.displayname();
		obj.displayage();
		a.displaysalary();
	}

}

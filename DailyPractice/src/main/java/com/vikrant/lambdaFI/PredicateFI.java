package com.vikrant.lambdaFI;

import java.util.function.Predicate;

/**
 * @author Vikrant Kumar Chauhan date:Mar 10, 2024 time:11:19:37 PM
 *         package_name:DailyPractice Thanks, Vikrant
 */
class Employee{
	
	public int age;
	public String name;
	public Employee(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
}

public class PredicateFI {

	public static void main(String[] args) {
		
		Predicate<Integer> obj = (i) -> {
			return (i > 10);
		};
		boolean res = obj.test(12);
		System.out.println(res);
		
		//Predicate test on custom method
		Employee emp = new Employee(42,"Vikrant");
		
		Predicate<Employee>  obj1= (e)->{
			return ( e.age>32 && e.name.length()>8);
		};
		
		//calling
		boolean res1 =obj1.test(emp);
		System.out.println(res1);
		
		
		Predicate<String> obj3  = (s)->{
			return (s.length()>10);
		};
		
		boolean res3 = obj3.test("Vikrant kumar chauhan");
		System.out.println(res3);
	}

}

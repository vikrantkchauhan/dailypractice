package com.vikrant.prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee{
	
	private int id;
	private String name;
	private int salary;
	
	public Employee(){
		
	}
	
	public Employee(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
		
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary= salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Practice{
	
	public static List<Employee> createEmp() {
		
		Employee emp = new Employee(101,"Vikrant Kumar Chauhan", 100);
		Employee emp1 = new Employee(102,"Rohit rajput", 200);
		Employee emp2 = new Employee(103,"Ratin rajput", 300);
		Employee emp3 = new Employee(104,"Prashant rajput",400);
		Employee emp4 = new Employee(105,"Amit Bose",500);
		Employee emp5 = new Employee(106,"Awinash Kaushal",600);
		Employee emp6 = new Employee(107,"Nikhil Mhatre",700);
		
		//Creating a object type array
		//Object[] obj = new Object[] {emp,emp1,emp2,emp3,emp4,emp5};
		//Creating a list of amployee
		
		List<Employee> list = new ArrayList<>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		
		return list;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Employee having rajput in surname");

		Practice.createEmp().stream()
		.filter(e->e.getName().contains("rajput"))
		.forEach(System.out::println);
		
		System.out.println("Employee having salary greater then 500");
	
		Practice.createEmp().stream()
		.filter(e->e.getSalary()>500)
		.forEach(p->System.out.println(p));
		
		System.out.println("Updating employee salary having rajput surname ");
		
		Practice.createEmp().stream()
		.filter(e->e.getName().contains("rajput"))
		.map(e->e.getSalary()+100)
		.forEach(System.out::println);
		
		System.out.println("Only printing first two employees fron the l"
				+ "ist having salary greater then 200");
		
		Practice.createEmp().stream()
		.filter(e->e.getSalary()>200)
		.limit(2)
		.forEach(e->System.out.println(e));
		
		System.out.println("Displaying the employee with sorted order");
		Practice.createEmp().stream()
		.sorted((o1, o2) -> o1.getSalary())
		.forEach(e->System.out.println(e));
		
		System.out.println("Displaying the sesong highest salary enployee info");
		Optional<Employee> emp = Practice.createEmp().stream()
		 .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		 .skip(1)
		 .findFirst();
		
		System.out.println(emp.get());
		
		System.out.println("secong lowest salary employee infof");
		Optional<Employee>  op = Practice.createEmp().stream()
				.sorted(Comparator.comparingInt(Employee::getSalary))
				.skip(1)
				.findFirst();
		System.out.println(op);
		
		System.out.println("Displaying the max salary");
		
		Optional<Employee> op1 = Practice.createEmp().stream()
				.max((o1, o2) ->o1.getSalary() );
		System.out.println(op1);
		
		
		System.out.println("Second highest salary");
		
		Optional<Employee> emper = Practice.createEmp().stream()
		.sorted(Comparator.comparingInt(Employee::getSalary).reversed())
		.skip(2)
		.findFirst();
		
		System.out.println(emper.get());
		
		
	}
	

	
}

package dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Stream API interview questions
//1. Print the sum of all the salaries of the employee list

class Student {

	int id;
	String name;
	int salary;

	Student(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class Demo2 {

	static List<Student> std = new ArrayList<>();

	static void addEle() {
		std.add(new Student(101, "Vikrant", 50));
		std.add(new Student(102, "Prashant", 100));
		std.add(new Student(103, "Jatin", 200));
	}

	public static void main(String[] args) {
		
		//1. Stream to print the sum of the salaries of all the employees
		System.out.println("Applying sum method");
        Optional<Integer> sumofsalary = std.stream().map(e->{return e.salary;}).reduce((e, e1)-> (e+e1));
        System.out.println(sumofsalary.get());
	}

}
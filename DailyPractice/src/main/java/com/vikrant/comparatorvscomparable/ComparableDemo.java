package com.vikrant.comparatorvscomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Vikrant Kumar Chauhan date:Mar 18, 2024 time:6:38:51 PM
 *         package_name:DailyPractice Thanks, Vikrant
 */

class Employee implements Comparable<Employee> {

	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee o) {

		if (this.id>o.id) return 1;
		else if(this.id<o.id)return -1;
		return this.name.compareTo(o.name);
		
	}
}

public class ComparableDemo {

	public static void main(String[] args) {
		List<Employee> list1 = new ArrayList<>();
		list1.add(new Employee(101, "Vikrant"));
		list1.add(new Employee(101, "Prashant"));
		list1.add(new Employee(103, "vvatin"));
		list1.add(new Employee(101, "Vzsikrant"));
		list1.add(new Employee(101, "aPrashant"));
		list1.add(new Employee(103, "Jasdatin"));
		list1.add(new Employee(101, "tyVikrant"));
		list1.add(new Employee(101, "aPrashant"));
		list1.add(new Employee(103, "tJatin"));

		System.out.println("Before Sorting:" + list1);

		Collections.sort(list1);

		System.out.println("After sorting:" + list1);
	}

}

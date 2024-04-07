package com.vikrant.comparatorvscomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Vikrant Kumar Chauhan date:Mar 18, 2024 time:7:27:54 PM
 *         package_name:DailyPractice Thanks, Vikrant
 */

class EmpInfo {

	private int id;
	private String name;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public EmpInfo(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "EmpInfo [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}

//Using the custom implementation os the class for comparator interface 
//taked the custom type object reference
class SortByIdThenName implements Comparator<EmpInfo> {

	@Override
	public int compare(EmpInfo o1, EmpInfo o2) {
		if (o1.getId() == o2.getId()) {
			return o1.getName().compareTo(o2.getName());
		} else {
			return o1.getId() - o2.getId();
		}
	}

}

public class ComparatorDemo {

	public static void main(String[] args) {
		List<EmpInfo> list1 = new ArrayList<>();
		list1.add(new EmpInfo(101, "Vikrant", "Noorpur"));
		list1.add(new EmpInfo(101, "Prashant", "Chandpur"));
		list1.add(new EmpInfo(103, "vvatin", "Delhi"));
		list1.add(new EmpInfo(101, "Vzsikrant", "Noida"));
		list1.add(new EmpInfo(101, "aPrashant", "Gurgaon"));
		list1.add(new EmpInfo(103, "Jasdatin", "Jaipur"));
		list1.add(new EmpInfo(101, "tyVikrant", "haridwar"));
		list1.add(new EmpInfo(101, "aPrashant", "Roorke"));
		list1.add(new EmpInfo(103, "tJatin", "Pune"));

		System.out.println("Before Sorting:" + list1);

		// using custom implementation of the interface
		Collections.sort(list1, new SortByIdThenName());

		System.out.println("After sorting using custom class impl:" + list1);

		// anonymous inner class
		Collections.sort(list1, new Comparator<EmpInfo>() {

			@Override
			public int compare(EmpInfo o1, EmpInfo o2) {
				return o1.getCity().compareTo(o2.getCity());
			}

		});

		System.out.println("After sorting on city wise using inner class impl:" + list1);

		// using the lambda sorting on basis of id then name
		Collections.sort(list1, (EmpInfo o1, EmpInfo o2)->{
			if(o1.getId()==o2.getId()) {
				return o1.getName().compareTo(o2.getName());
			}return o1.getId()-o2.getId();
		} );
		
		System.out.println("Sorting using lambda"+list1);

	}
}

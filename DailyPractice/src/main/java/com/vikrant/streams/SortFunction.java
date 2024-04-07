package com.vikrant.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author Vikrant Kumar Chauhan date:Mar 19, 2024 time:10:25:46 AM
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

public class SortFunction {

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
		
		Optional<EmpInfo> th =list1.stream().sorted((o1,o2)->{
			if(o1.getId()>o2.getId()) {
				return o1.getName().compareTo(o2.getName());
			}else {
				return o1.getId()-o2.getId();
			}
		}).skip(1).findFirst();
		
		//list1.stream().
		
		System.out.println(th.get());
		
		System.out.println("After sorting:"+list1);

	}
}

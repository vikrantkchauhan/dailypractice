package com.vikrant.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vikrant Kumar Chauhan
 *  date:Mar 11, 2024
 *  time:3:06:19 PM
 *  package_name:DailyPractice
 *  Thanks,
 *  Vikrant
 */

final class demo1{
	
	public int id =10;
	 void display() {
		System.out.println(id);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
public  class Demo {
	
	public static void main(String[] args) {
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("abc", 100);
		
		m.put("abcaa", 100);

		int x = m.get("abcaa");
		
		System.out.println(m);
		System.out.println(x);
		demo1 obj = new demo1();
		obj.display();
		obj.setId(12);
		obj.display();
		
	}

}

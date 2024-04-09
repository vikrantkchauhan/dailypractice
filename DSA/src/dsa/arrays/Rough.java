package dsa.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class Employee{
	
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}
public class Rough {

	
	public static void main(String[] args) {
		
		Map<Integer, Employee> mp = new HashMap<>();
		mp.put(101, new Employee(1,"A"));
		mp.put(102, new Employee(2,"B"));
		mp.put(103, new Employee(3,"C"));
		mp.put(104, new Employee(4,"D"));
		mp.put(105, new Employee(6,"E"));
		mp.put(106, new Employee(6,"a"));
		
		
		System.out.println(mp.entrySet());
		System.out.println(mp.keySet());
		System.out.println(mp.values());
		
		for(Map.Entry<Integer, Employee>  m: mp.entrySet()) {
				System.out.println(m.getKey());
				System.out.println(m.getValue());
				
		}
		
		List<Integer> l = new ArrayList<>();
		l.addAll(mp.keySet());
		Collections.sort(l, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
			
		});
		
		System.out.println(l);
		
		List<Employee>  ll = new ArrayList<>();
		ll.addAll(mp.values());
		
		Collections.sort(ll, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				if(o2.id>o1.id) {
					return 1;
				}else if(o2.id<o1.id) {
					return -1;
				}else {
					return o2.name.compareTo(o1.name);
				}
			}
			
		});
		
		System.out.println(ll);
		
		System.out.println("hello");
		
		
	}
	
	
}

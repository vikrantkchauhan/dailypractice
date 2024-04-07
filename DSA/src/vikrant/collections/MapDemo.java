package vikrant.collections;

import java.util.HashMap;
import java.util.Map;

class Employee{
	int id;
	String name;
	
	Employee(int id, String name){
		this.id =id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
}
public class MapDemo {
	
	static Map<Integer, Employee>  mp = new HashMap<>();
	
	static void insertEle() {
		mp.put(101,new Employee(201,"Vikrant"));
		mp.put(102,new Employee(202,"Prashant"));
		mp.put(103, new Employee(103,"Jatin"));
		mp.put(104, new Employee(104,"Jyoti"));
	}
	
	static void displayEle(Map<Integer,Employee> mp) {
		System.out.println("All the keys of the map");
		System.out.println(mp.keySet());
		System.out.println("All the values of the map");
		System.out.println(mp.values());
		System.out.println("Display using the enrty set");
		for(Map.Entry<Integer, Employee> emp : mp.entrySet()) {
			System.out.println("Key is:"+emp.getKey()+"------"+"Values is, Employee id is"+emp.getValue().id+"----Employee name is"+emp.getValue().name);
		}
	}
	public static void main(String[] args) {
		insertEle();
		displayEle(mp);
	}
	
	

}

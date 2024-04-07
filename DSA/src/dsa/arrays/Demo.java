package dsa.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Non-Terminal Operations
filter()
map()
flatMap()
distinct()
limit()
peek()
sorted()
skip()



Terminal Operations
anyMatch()
allMatch()
noneMatch()
collect()
count()
findAny()
findFirst()
forEach()
min()
max()
reduce()
toArray()
toList()*/

class Employee {

	int id;
	String name;

	Employee(int id, String name) {

		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}

public class Demo {

	static List<Employee> l = new ArrayList<>();

	static void addEle() {

		l.add(new Employee(101, "Vikrant"));
		l.add(new Employee(102, "Prashant"));
		l.add(new Employee(103, "Jatin"));
		l.add(new Employee(109, "Harsh"));
		l.add(new Employee(104, "Monu"));
		l.add(new Employee(105, "Kallu"));
		l.add(new Employee(106, "Jyoti"));
		l.add(new Employee(107, "Lavi"));
		l.add(new Employee(108, "Akanshu"));
	}

	static List<Employee> l2 = new ArrayList<>();

	static void addEle1() {

		l2.add(new Employee(101, "Vikrant"));
		l2.add(new Employee(102, "Prashant"));
		l2.add(new Employee(103, "Jatin"));
		l2.add(new Employee(109, "Harsh"));
		l2.add(new Employee(104, "Monu"));
		l2.add(new Employee(105, "Kallu"));
		l2.add(new Employee(106, "Jyoti"));
		l2.add(new Employee(107, "Lavi"));
		l2.add(new Employee(108, "Akanshu"));
	}

	static List<List<Employee>> l1 = new ArrayList<>();

	static void listOfList() {
		l1.add(l);
		l1.add(l2);

	}

	public static void main(String[] args) {
		System.out.println("Adding the element");
		addEle();
		// stream for sidplaying the data from list
		System.out.println("Displaying the contect of the list");
		l.stream().forEach(e -> System.out.println(e));

		// filtering the element of the list of
		// the basic of id>105 and storing that to the list

		List<Employee> fl = l.stream().filter(e -> e.id > 105).collect(Collectors.toList());
		System.out.println("Filtered list is:" + fl);

		// Mapping the list data based on id> 105 and chauhan to name

		l.stream().filter(e -> e.id > 105).map(e -> {
			return e.name.concat("  Chauhan");
		}).forEach(e -> System.out.println(e));

		// FlatMap
		// Adding the elements to list of list of employee

		System.out.println("Creating list of list");
		addEle1();
		listOfList();

		l1.stream().flatMap(value -> {
			return Stream.of(value);
		}).
		forEach(e -> System.out.println(e));
		
		
	

	}

}
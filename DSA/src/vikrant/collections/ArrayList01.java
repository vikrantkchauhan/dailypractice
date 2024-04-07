package vikrant.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

class Student {
	public String name;
	public String address;
	public int id;

	Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", id=" + id + "]";
	}

}

public class ArrayList01 {

	static List<Student> list = new ArrayList<>();

	static void addEle() {
		list.add(new Student(101, "Vikrant", "Azampur"));
		list.add(new Student(102, "Prashant", "Kryzstan"));
		list.add(new Student(103, "Unnati", "Gurgaon"));
		list.add(0, new Student(100,"Awinash","Bihar"));
	}

	static void iterateForEach(List<Student> list) {
		for (Student std : list) {
			System.out.println(std);
		}
	}

	static void iterateIterator(List<Student> list) {
		Iterator<Student> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

	static void iterateForLoop(List<Student> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
	}

	static void listIterator(List<Student> list) {
		ListIterator<Student> litr = list.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());

		}
	}

	static Student retrievIndex(List<Student> list, int index) {
		
		Student std =(Student)list.get(index);
		return std;
	}
	
	static void updateEle(List<Student> list, Student std, int index) {
		System.out.println("Before updating the index element"+list);
		list.add(index, std);
		System.out.println("After updating the index element"+list);
		
	}
	
	static void containsEle(List<Student> list, int id ) {
		
	Optional<Student> opt = list.stream().filter(std1-> std1.id==id).findFirst();
	 System.out.println("Status is:"+opt.get());
	}
	public static void main(String[] args) {
		addEle();
		System.out.println("Using for each");
		iterateForEach(list);
		System.out.println("From iterator");
		iterateIterator(list);
		System.out.println("From for loop");
		iterateForLoop(list);
		System.out.println("From list iterator");
		listIterator(list);
		System.out.println("Retrieve element based on index");
		System.out.println(retrievIndex(list, 1).toString());
		System.out.println("Updating the element");
		updateEle(list, new Student(999,"Bitu","Adwa"), 0);
		System.out.println("Checking for element");
		containsEle(list, 101);
		
	}

}

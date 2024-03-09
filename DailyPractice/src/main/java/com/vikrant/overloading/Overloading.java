/**
 * Created for learning purpose.
 */
package com.vikrant.overloading;

/**
 * @author ${Vikrant Kumar Chauhan}
 *
 *         ${{date:Mar 9, 2024};{time:9:21:25 PM};
 *         {package_name:DailyPractice;{$Thanks, Vikrant}
 */
public class Overloading {

	
	public Overloading() {}
	public Overloading(String type) {System.out.println("Overloaded constructor");}
	public void display() {
		System.out.println("Simple display method");
	}

	public void display(String name) {
		System.out.println("Hi" + name);
	}

	public void display(String name, String gender) {
		System.out.println("Hi name is :" + name + " Genger is :" + gender);
	}

	public void display(Integer ran) {
		System.out.println("Test :" + ran);

	}
	
	
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.display("Vikrant");
		
	}
}

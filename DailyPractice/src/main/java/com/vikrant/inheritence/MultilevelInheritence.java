/**
 * Created for learning purpose.
 */
package com.vikrant.inheritence;

/**
 * @author ${Vikrant Kumar Chauhan}
 *
 *         ${{date:Mar 9, 2024};{time:9:11:32 PM};
 *         {package_name:DailyPractice;{$Thanks, Vikrant}
 */
public class MultilevelInheritence {

	public static void main(String[] args) {
		
		Car obj = new Car();
		System.out.println("Vehicle info");
		obj.commercial("Personal");
		obj.type();
		System.out.println("Thanks");
		
	}
}

class Vehicle {

	public void commercial(String type) {
		System.out.println("It is a " + type + "vehile.");
	}

}

class Bike extends Vehicle {

	public void type() {
		System.out.println("Is is a two wheeler");
	}

}

class Car extends Vehicle {

	public void type() {
		System.out.println("It is a four wheeler");
	}
}

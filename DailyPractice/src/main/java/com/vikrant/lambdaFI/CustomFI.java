/**
 * Created for learning purpose.
 */
package com.vikrant.lambdaFI;

/**
 * @author ${Vikrant Kumar Chauhan}
 *
 *         ${{date:Mar 10, 2024};{time:10:18:01 PM};
 *         {package_name:DailyPractice;{$Thanks, Vikrant}
 */

@FunctionalInterface
interface calculator {

	public void addition(int a, int b);
}

@FunctionalInterface
interface calculator1 {

	public int sustraction(int a, int b);
}

@FunctionalInterface
interface cal {
	public int mul(int a, int b);
}

public class CustomFI {

	public static void main(String[] args) {

		calculator obj = (a, b) -> {
			System.out.println(a + b);
		};

		obj.addition(10, 1212);

		calculator1 obj1 = (a, b) -> {
			return (a - b);
		};

		System.out.println(obj1.sustraction(20, 11));

		cal obj2 = (a, b) -> {
			System.out.println(a * b);
			return (a * b);
		};

		obj2.mul(10, 12);

		// Thread by lambda
		Thread t1 = new Thread(() -> {
			Thread.currentThread().setName("Vikrant Thread");
			System.out.println(Thread.currentThread().getName());
		});
		
		t1.start();
		System.out.println(Thread.currentThread().getName());
		

	}

}

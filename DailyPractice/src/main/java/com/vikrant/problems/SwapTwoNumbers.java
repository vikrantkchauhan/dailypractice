package com.vikrant.problems;

/**
 * @author Vikrant Kumar Chauhan
 *  date:Mar 10, 2024
 *  time:10:49:50 PM
 *  package_name:DailyPractice
 *  Thanks,
 *  Vikrant
 */
public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		int a=1;
		int b =2;
		System.out.println("Before swap");
		display(a,b);
		
		System.out.println("Post swap");
		swap(a,b);
		
		System.out.println("Post inmemory");
		swapinspace(a, b);
		
		
		
		
		
		
	}
	
	static void swap(int a, int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		display(a,b);
		
	}
	
	static void swapinspace(int a , int b) {
		a = a+b;
		b = a-b;
		a=a-b;
		display(a,b);
	}
	
	static void display(int a, int b) {
		System.out.println("A is:"+a);
		System.out.println("B is:"+b);
		
	}

}

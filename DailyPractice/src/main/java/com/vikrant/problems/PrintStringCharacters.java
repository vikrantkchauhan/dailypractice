package com.vikrant.problems;

/**
 * @author Vikrant Kumar Chauhan
 *  date:Mar 17, 2024
 *  time:1:33:03 PM
 *  package_name:DailyPractice
 *  Thanks,
 *  Vikrant
 */
public class PrintStringCharacters {
	
	public static void main(String[] args) {
		
		String str = "vikrantsdsdsjdsjgdsjgddjsgdjsd";
		
		System.out.println("Length of string: "+str.length());
		
		int k=0;
		int  l = str.length()/3;
		int  j = str.length()/3;
		for(int i=0;i<str.length()/3;i++ ) {
			
			System.out.print(str.charAt(i)+" : ");
			
			System.out.print(str.charAt(j)+" : ");
			
			System.out.println(str.charAt(l));
			
			l++;
			j++;
			k++;
		}
		System.out.println("Loop runs for "+k+" times.");
	}

}

package dsa.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class EvenAndOddSegregation {
	
	static int[] arr = {1,6,7,8,5,3,4,2};
	
	static void segregate(int[] arr) {
		
		Set<Integer>  even = new TreeSet<>();
		Set<Integer>  odd  = new TreeSet<>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even.add(arr[i]);
			}else {
				odd.add(arr[i]);
			}
		}
		System.out.println("Even is"+even);
		System.out.println("Odd is:"+odd);
		
		even.addAll(odd);
		System.out.println(even);
	}
	
	public static void main(String[] args) {
		segregate(arr);
	}
	
	
		


}

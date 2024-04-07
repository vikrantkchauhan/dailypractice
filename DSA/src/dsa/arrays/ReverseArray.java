package dsa.arrays;

import java.util.Arrays;

public class ReverseArray {
	
	static int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
	
	static void reverseArray(int[] arr, int start, int end) {
		
	
	
		while(start<end) {
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	
	
	}
	
	public static void main(String[] args) {
		System.out.println("Original array"+Arrays.toString(arr));
		reverseArray(arr, 0, arr.length-1);
		System.out.println("Reversed array"+Arrays.toString(arr));
	}

}

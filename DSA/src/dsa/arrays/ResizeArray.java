package dsa.arrays;

import java.util.Arrays;

public class ResizeArray {
	
	static int[] arr = new int[]{1,2,3,4,5,6,7};
	static int[] temp ;
	
	 void resizeArray(int [] arr, int cap) {
		
		temp = new int[cap];
		for(int i=0;i<arr.length;i++) {
		temp[i]= arr[i];
		}
		System.err.println("Before refrencing to temp"+Arrays.toString(arr));
		arr= temp;
		System.out.println("After refrencing to temp"+Arrays.toString(arr));
		
		
	}
	 
	 public static void main(String[] args) {
		
		 ResizeArray obj = new ResizeArray();
		 obj.resizeArray(arr, 30);
		 
	}

}

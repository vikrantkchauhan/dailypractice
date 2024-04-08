package dsa.arrays;

import java.util.Arrays;

public class Rough {

	static int[] arr = { 1,3,5,4,7,8,2,7 };

	// After sorting:[0, 1, 3, 5, 7, 8, 9, 66]
	// After rearrange:[66, 0, 9, 1, 8, 3, 7, 5]

	static void a(int[] arr) {
		
		int odd=0;
	
		
		for(int even=0;even<arr.length;even++) {
			if(arr[odd]%2==0) {
				int temp = arr[odd];
				arr[odd]=arr[even];
				arr[even]=temp;
				odd++;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		a(arr);
	}

}

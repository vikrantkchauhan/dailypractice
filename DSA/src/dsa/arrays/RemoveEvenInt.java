package dsa.arrays;

import java.util.Arrays;

public class RemoveEvenInt {

	static int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	static int[] resultarr;

	public static void removeEven(int[] arr) {

		// Counting the odd elements from the input array
		int oddele = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddele++;
			}
		}
			

			resultarr = new int[oddele];
		//Inserting the odd elements into the new result array
			int index = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % 2 != 0) {
					resultarr[index] = arr[j];
					index++;
				}
			}
		}

	

	public static void main(String[] args) {
		System.out.println("Original array");
		System.out.println(Arrays.toString(arr));
		removeEven(arr);
		System.out.println("Array after removing even elements");
		System.out.println(Arrays.toString(resultarr));
	}

}

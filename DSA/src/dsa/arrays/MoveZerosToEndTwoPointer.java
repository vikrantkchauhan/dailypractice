package dsa.arrays;

import java.util.Arrays;

public class MoveZerosToEndTwoPointer {

	static int[] arr = { 0, 2, 0, 0, 4, 0, 0, 0, 1 };

	static void moveZeros(int[] arr) {

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;

			}
			if (arr[j] != 0) {
				j++;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Before moving" + Arrays.toString(arr));
		moveZeros(arr);
		System.out.println("After moving" + Arrays.toString(arr));

	}

}

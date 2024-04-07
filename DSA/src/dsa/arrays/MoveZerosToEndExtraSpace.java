package dsa.arrays;

import java.util.Arrays;

public class MoveZerosToEndExtraSpace {

	static int[] arr = { 1, 0, 12, 0, 56, 0, 78, 0 };
	static int[] res;

	static void movezerostoend(int[] arr) {

		res = new int[arr.length];
		int end = arr.length - 1;
		int start = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 0) {
				res[end] = arr[i];
				end--;
			} else {
				res[start] = arr[i];
				start++;
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Before shifting:" + Arrays.toString(arr));
		movezerostoend(arr);
		System.out.println("After shifting:" + Arrays.toString(res));
	}

}

/**
 * Created for learning purpose.
 */
package com.vikrant.problems;

import java.util.Arrays;

/**
 * @author ${Vikrant Kumar Chauhan}
 *
 *         ${{date:Mar 10, 2024};{time:10:45:44 PM};
 *         {package_name:DailyPractice;{$Thanks, Vikrant}
 */
public class ReverseArray {

	// single for loop
	// extra memory of same size
	public static int[] revArray(int[] arr) {

		int[] revarr = new int[arr.length];
		int k = 0;
		for (int i = arr.length - 1; i >= 0; --i) {
			revarr[k] = arr[i];
			k++;
		}
		return revarr;
	}

	// in space
	// single for loop
	// not possible issue after mid length
	public static int[] revArrayInMem(int[] arr) {
		// {1,2,3,4,5,6,7,8}
		int k = 0;
		for (int i = arr.length - 1; i >= 0; --i) {
			arr[k] = arr[i];
			k++;
		}
		return arr;

	}

	public static void main(String[] args) {
		// Driver class
		int[] res = revArray(new int[] { 1, 2, 3, 4, 5, 6, 7 });

		System.out.println("Using the extra space:" + Arrays.toString(res));

		// using in space impl

		int[] res1 = revArrayInMem(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });
		System.out.println("Using in memory:" + Arrays.toString(res1));

	}

}

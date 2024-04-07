package dsa.arrays;

import java.util.Arrays;

public class RearrangeInMaximumMinimum {
	
	static int[] arr = {1,2,3,4,5,6,7,8,9};
	
	static void rearrange(int[] arr) {
		
		int start = 0;
		int end = arr.length-1;
		int res[] = new int[arr.length];
		for(int i=0; i<arr.length;i++) {
			
			if(i%2==0) {
				res[i]=arr[end];
				end--;
			}else {
				res[i]=arr[start];
				start++;
			}
		}
		
		System.out.println("After operation:"+Arrays.toString(res));
	}
	
	public static void main(String[] args) {
		rearrange(arr);
	}
}

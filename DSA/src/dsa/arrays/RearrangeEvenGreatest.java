package dsa.arrays;

import java.util.Arrays;


public class RearrangeEvenGreatest {
	
	static int[] arr = {1,3,8,9,5,66,7,0};
	
	static void rearrange(int[] arr) {
		
		Arrays.sort(arr);
		System.out.println("After sorting:"+Arrays.toString(arr));
		
		int end= arr.length-1;
		int start =0;
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
		
		System.out.println("After rearrange:"+Arrays.toString(res));
	}
	
	public static void main(String[] args) {
		rearrange(arr);
	}
}

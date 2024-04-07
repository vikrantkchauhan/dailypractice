package dsa.arrays;

public class SecondMaximumEle {
	
	static int[] arr = {1,2,3,4,5,6,7,8,67,89};
	
	static void secondMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		int secondmax = Integer.MIN_VALUE;
		for(int i=0; i< arr.length;i++) {
			if (arr[i]>max) {
				secondmax = max;
				max= arr[i];
			}else if(arr[i]>secondmax && arr[i]!=max) {
				secondmax= arr[i];
			}
		}
		System.out.println("Second max is:"+secondmax);
	}
	public static void main(String[] args) {
		secondMax(arr);
	}

}

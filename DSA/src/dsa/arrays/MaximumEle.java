package dsa.arrays;

public class MaximumEle {

	static int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	
	static void maximimEle(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Maximim element is:"+max);
		
	}
	public static void main(String[] args) {
		maximimEle(arr);
	}

}

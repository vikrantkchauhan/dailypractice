package dsa.arrays;

public class SecondMinimumValue {
	
	static int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
	
	static void secondminval(int[] arr) {
		int min = Integer.MAX_VALUE;
		int secondmin = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]< min) {
				secondmin = min;
				min= arr[i];
			}else if(arr[i]<secondmin && arr[i]!=min) {
				secondmin= arr[i];
				
			}
		}
		
		System.out.println("Second min is"+secondmin);
		
	}
	
	public static void main(String[] args) {
		secondminval(arr);
	}
}

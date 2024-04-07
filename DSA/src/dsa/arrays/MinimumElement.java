package dsa.arrays;

public class MinimumElement {
	
	static int[] arr = new int[] {1,2,3,4,5,6,7,8,9,-89};
	
	static void minEle(int[] arr) {
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minium value is:"+min);
	}
	
	public static void main(String[] args) {
		minEle(arr);
	}

}

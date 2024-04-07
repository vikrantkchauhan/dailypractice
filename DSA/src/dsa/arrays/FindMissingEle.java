package dsa.arrays;

public class FindMissingEle {
	
	static int[] arr = {1,2,4,5,6};
	
	static void findMissing(int[] arr) {
		
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		
		int originalsum = arr.length *(arr.length+1)/2;
		System.out.println(originalsum);
		System.out.println(sum);
		int missingele = originalsum - sum;
		System.out.println("Missing ele is:"+missingele);
		
	}
	
	public static void main(String[] args) {
		findMissing(arr);
	}

}

package dsa.arrays;

public class FirstThreeGreatestElement {
	
  static int[] arr = {8,2,7,9,6,10};
  
  static void threeGreatest(int[] arr) {
	  
	  int first=Integer.MIN_VALUE;
	  int second = Integer.MIN_VALUE;
	  int third = Integer.MIN_VALUE;
	  
	  for(int i=0;i<arr.length;i++) {
		  if(arr[i]>first) {
			  third = second;
			  second= first;
			  first = arr[i];
		  }
		  
		  
	  }
	  
	  System.out.println("First greatest ele:"+first);
	  System.out.println("Second greatest ele:"+second);
	  System.out.println("Third greatest ele:"+third);
	  
  }
  
  public static void main(String[] args) {
	threeGreatest(arr);
}

}

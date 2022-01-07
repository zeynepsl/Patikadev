package coderbyte.week4;

import java.util.Arrays;

public class Medium {
	public static int DistinctList(int[] arr) {
		// 0 -2 -2 5 5 5 --> output:3
		// 100 0 1 4     -->        0
		
	    Arrays.sort(arr);
	    int counter = 0;

	    for (int i = 1; i < arr.length; i++) {
	      if (arr[i - 1] == arr[i]) {
	        counter++;
	      }
	    }
	    return counter;
	  }

	  public static void main (String[] args) { 
	    //Scanner s = new Scanner(System.in);
		 // int[] intArr = new int[] {0,-2,-2,5,5,5};
		  int[] intArr = new int[] {100, 0, 1, 4};
	    System.out.print(DistinctList(intArr)); 
	  }
}

package coderbyte.week8;


public class Easy {
	public static String TwoSum(int[] arr) {
	    // code goes here  
		// 7, 1, 3, 3
	    int firstNum = arr[0];
	    
	    String result = "-1";
	    
	    for(int i = 1; i < arr.length; i++){
	      for(int j = i+1 ; j < arr.length; j++){
	        int sum = arr[i] + arr[j];
	        if(sum == firstNum) result += arr[i] + "," + arr[j] + " ";
	      }    
	    }

	    return result;
	  }

	  public static void main (String[] args) {  
	    // keep this function call here    
		int[] arr = new int[] {100,90,1};
	    System.out.print(TwoSum(arr)); 
	  }
}

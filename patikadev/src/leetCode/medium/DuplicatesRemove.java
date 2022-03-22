package leetCode.medium;

import java.util.Arrays;

public class DuplicatesRemove {
	    public static char[] removeDuplicates(int[] nums) {
	        char[] arr = (Arrays.toString(nums)).toCharArray();
	        int start = 0;
	        
	        for(int i = 0; i < arr.length; i++){
	            int control = arr[start];
	            
	            for(int j = start+1; j < arr.length; j++){
	                if(control == arr[j]){
	                    arr[j] = '-';
	                    start++;
	                }
	                else{
	                	start++;
	                    break;
	                }
	            }       
	        }
	        return arr;
	        
	    }
	    public static void main(String[] args) {
	    	int[] arr = {1,1,1,2,2,3};
			System.out.println(removeDuplicates(arr));
		}
	
}

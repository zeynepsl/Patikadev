package coderbyte.week3;

import java.util.Scanner;

public class Medium {
	public static String RunLength(String str) {
	    // code goes here  
	    //aabbcde
	    //2a 2b 1c 1d 1e
	    //abcd
	    String current = "";
	    int count = 1;
	    char[] charArr = str.toCharArray();
	    for(int i=1; i< charArr.length; i++){
	      if(charArr[i] == charArr[i-1]){
	        ++count;
	      }
	      else{
	        current = "" + Character.toString(charArr[i-1]) + count  + current ;
	        count = 1;
	      }
	    }
	    String returnStr = "" + Character.toString(charArr[charArr.length-1]) + count  + current;
	    String reverseStr = "";
	    for(int i=(returnStr.length()-1); i>=0; i--){
	      reverseStr = reverseStr + returnStr.charAt(i);
	    }
	    return reverseStr;
	
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(RunLength(s.nextLine())); 
	  }
}

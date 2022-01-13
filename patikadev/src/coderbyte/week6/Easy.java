package coderbyte.week6;

import java.util.Scanner;

public class Easy {
	
	public static String CheckNums(int num1, int num2) {
	    // code goes here  
	    if(num2 == num1){
	      return "-1";
	    }

	    if(num2 > num1){
	      return "true";
	    }
	    else{
	      return "false";
	    }
	    
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(CheckNums(s.nextInt(), s.nextInt())); 
	  }
}

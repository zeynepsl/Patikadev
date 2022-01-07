package coderbyte.week3;

import java.util.Scanner;

public class Medium3 {
	
	  public static String RunLength(String str) {
	    // code goes here
	    String result = "";
	    int count = 1;
	    char c = str.charAt(0);
	    for(int i=1; i<str.length();i++){
	      if(str.charAt(i)==c){
	        count++;
	      }
	      else{
	    	  result += count + "" +c;
	        c = str.charAt(i); 
	        count = 1;
	      }
	    }

	    result += count + "" +c;

	    return result;
	  }

	  public static void main (String[] args) {
	    // keep this function call here
	    Scanner s = new Scanner(System.in);
	    System.out.print(RunLength(s.nextLine()));
	   
	 }
}

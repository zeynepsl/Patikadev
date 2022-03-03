package coderbyte.week7;

import java.util.Scanner;

public class Easy {
	//bir stringtrki buyuk harfleri kucuk harfe,
	//kucuk harfleri de buyuk harfe cevir
	public static String SwapCase(String str) {
	    StringBuilder sb = new StringBuilder();//String de tanýmlayarak yapýlabilir

	    for(int i = 0; i < str.length(); i++){
	      char ch = str.charAt(i);

	      if(Character.isUpperCase(ch)){
	        ch = Character.toLowerCase(ch);
	      }
	      else if(Character.isLowerCase(ch)){
	        ch = Character.toUpperCase(ch);
	      }
	      sb.append(ch);
	    }
	    return sb.toString();
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(SwapCase("hello-LOL")); 
	  }

}

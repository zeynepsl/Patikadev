package coderbyte.week6;

import java.util.Scanner;

public class Medium {
	
	public static boolean PalindromeTwo(String str) {
	    StringBuilder sb = new StringBuilder();

	    for(char c : str.toCharArray()){
	      if(Character.isLetterOrDigit(c)){
	        sb.append(Character.isLowerCase(c) ? c : Character.toLowerCase(c));
	      }
	    }	    
	    //sb nin i�inde sadece harfler ve varsa say�lar var art�k
	    
	    String currentStr = sb.toString();
	    String reverseStr = sb.reverse().toString();
	    
	    if(currentStr.equals(reverseStr)){
	      return true;
	    }
	    
	    
	    
	    return false;
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(PalindromeTwo(s.nextLine())); 
	  }
}

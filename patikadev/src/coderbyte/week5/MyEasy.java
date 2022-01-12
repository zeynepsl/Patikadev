package coderbyte.week5;

import java.util.Scanner;

public class MyEasy {
	//ünsüzleri say
	public static int ConsonantCount(String str) {
	    String vowels = "aeiouAEIOU";
	    int consCount = 0;
	    for(int i = 0; i < str.length(); i++){
	      char currentChar = str.charAt(i);
	      if(vowels.indexOf(currentChar) == -1 && currentChar != ' '){
	    	  consCount++;
	      }
	    }

	    return consCount;
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(ConsonantCount(s.nextLine())); 
	  }
}

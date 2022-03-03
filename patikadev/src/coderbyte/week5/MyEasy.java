package coderbyte.week5;

import java.util.Scanner;

public class MyEasy {
	// ünsüzleri say
	public static int ConsonantCount(String str) {
	    int consCount = 0;
	    String vowels = "AEIOUaeiou";
	    for(int i = 0; i < str.length(); i++){
	      char ch = str.charAt(i);
	      if(Character.isAlphabetic(ch)) {
	    	  if(vowels.indexOf(ch) == -1)
	    		  consCount++;
	      }
	      
	    }

	return consCount;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(ConsonantCount("zynp*-,11"));// 4
	}
}

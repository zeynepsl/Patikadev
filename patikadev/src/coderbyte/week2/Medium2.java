package coderbyte.week2;

import java.util.Scanner;

public class Medium2 {
	public static String FormattedDivision(int num1, int num2) {
		//virgulden sonra 4 hane olsun
	    // code goes here
	    double division = num1 * 1.00 / num2;
	    return String.format("%,.4f", division);
	  }

	  public static void main (String[] args) {
	    // keep this function call here
	    Scanner s = new Scanner(System.in);
	    System.out.print(FormattedDivision(4,6)); 
	  }

}

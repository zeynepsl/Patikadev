package coderbyte.week2;

import java.util.Scanner;

public class FormatDivision {
	public static String FormattedDivision(int num1, int num2) {
	    // code goes here
	    double division = (double) num1 / num2;
	    return String.format("%,.4f", division);//virgulden sonra 4 hane olsun
	  }

	  public static void main (String[] args) {
	    // keep this function call here
	    Scanner s = new Scanner(System.in);
	    System.out.print(FormattedDivision(4,6)); 
	  }

}

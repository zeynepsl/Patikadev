package coderbyte.week1;

import java.util.Scanner;

public class Easy {
	public static int FirstFactorial(int num) {
	    int factorial = 1;
	    for(int i = 1; i <= num; i++) {
	      factorial *= i;
	    }
	    return factorial;
	  }

	  public static void main (String[] args) {
	    // keep this function call here
	    Scanner s = new Scanner(System.in);
	    int number = s.nextInt();
	    System.out.print(FirstFactorial(number)); 
	  }
}

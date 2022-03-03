package coderbyte.week1;

import java.util.Scanner;

public class Factorial {
	public static int FirstFactorial(int num) {
	    int factorial = 1;
	    for(int i = 1; i <= num; i++) {
	      factorial *= i;
	    }
	    return factorial;
	  }
	
	public static int recursiveFact(int num) {
		if((num) == 1) return 1;
		return num * recursiveFact(num-1);
	}

	  public static void main (String[] args) {
	    // keep this function call here
	    Scanner s = new Scanner(System.in);
	    int number = s.nextInt();
	    System.out.println(FirstFactorial(number)); 
	    System.out.println(recursiveFact(number));
	  }
}

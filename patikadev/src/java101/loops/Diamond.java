package java101.loops;

import java.util.Scanner;

public class Diamond {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("number not right");
			return;
		}
		
		//n=9, ust=5, alt=4
		int ust = n/2 + 1;
		int alt = n - ust;
		int sinir = n - 2;
		
		for(int i = 1; i <= ust; i++) {
			for(int j = 1; j <= (ust - i); j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= (2*i - 1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		for(int i = 1; i <= alt; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			
			for(int j = 1; j <= sinir; j++) {
				System.out.print("*");
			}
			sinir -= 2;
			System.out.println();
		}
		
	}
	/*
	 
11:

     *
    ***
   *****
  *******
 *********
***********
 *********
  *******
   *****
    ***
     *
 
*/
}

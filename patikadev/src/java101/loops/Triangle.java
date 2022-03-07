package java101.loops;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		triangleFromStar(n);
	}
	
	public static void triangleFromStar(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(" ");
			}
			
			for(int k = (i*2 - 1); k > 0; k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	/*
input: 6
output:
	 
	 
     *
    ***
   *****
  *******
 *********
***********

*/
}

package java101.loops;

import java.util.Scanner;

public class ReverseTriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		//int yildizSayisi = num + (num - 1);
		for(int i = num; i > 0; i--) {
			
			for(int j = i; j < num; j++) {
				System.out.print(" ");
			}
			
			for(int j = (2*i -1); j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*

5
*********
 *******
  *****
   ***
    *


*/
}

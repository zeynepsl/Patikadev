package java101.loops;

import java.util.Scanner;

public class FindEvenNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int i = 0;
		while(i <= num) {
			 System.out.println(i + " ");
			 i+=2;
		}
		
		/*for(int i = 0; i <= num; i+=2) {
			 System.out.println(i + " ");
		}*/
	}
}

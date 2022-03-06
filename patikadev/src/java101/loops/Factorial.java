package java101.loops;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("sayiyi girin: ");
		int num = scanner.nextInt();
		int fact = fact(num);
		
		System.out.println(fact);
	}

	public static int fact(int num) {
		int fact = 1;
		
		while(num > 1) {
			fact = fact * num;
			num--;
		}
		return fact;
	}
}

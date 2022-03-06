package java101.loops;

import java.util.Scanner;

public class Exponenet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, us, res;
		
		System.out.print("ilk sayiyi girin: ");
		num = scanner.nextInt();
		
		System.out.print("us sayiyi girin: ");
		us = scanner.nextInt();
		
		res = calculateExponent(num, us);
		
		System.out.println(num + " uzeri " + us + " sonucu: " + res);
	}

	public static int calculateExponent(int num, int us) {
		int total = 1;
		if(us == 0) {
			return 1;
		}
		
		for(int i = 0; i < us; i++) {
			total *= num;
		}
		return total;
	}
}

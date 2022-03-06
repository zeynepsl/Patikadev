package java101.loops;

import java.util.Scanner;

public class Exponenet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num, us, total = 1;
		System.out.print("ilk sayiyi girin: ");
		num = scanner.nextInt();
		
		System.out.print("us sayiyi girin: ");
		us = scanner.nextInt();
		
		if(us == 0) {
			System.out.println(num + " uzeri " + us + " sonucu: " + total);
			return;
		}
		
		for(int i = 0; i < us; i++) {
			total *= num;
		}
		
		System.out.println(num + " uzeri " + us + " sonucu: " + total);
	}
}

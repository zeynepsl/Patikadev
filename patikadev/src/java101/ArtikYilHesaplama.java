package java101;

import java.util.Scanner;

public class ArtikYilHesaplama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			System.out.println("artik yil");
		}
		else {
			System.out.println("artik yil degil");
		}
	}
}

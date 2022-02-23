package java101;

import java.util.Scanner;

public class ArtikYilHesaplama {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int yil = scanner.nextInt();
		
		if((yil % 4 == 0) || (yil % 400 == 0)) {
			System.out.println("artik yil");
		}
		else {
			System.out.println("artik yil degil");
		}
	}
}

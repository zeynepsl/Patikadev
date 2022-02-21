package java101;

import java.util.Scanner;

public class DaireAlanCevreHesaplama {
	public static void main(String[] args) {
		double pi = 3.14, r, alan, cevre;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("yaricap degerini girin: ");
		r = scanner.nextDouble();
		
		alan = pi * r * r;
		cevre = 2 * pi * r;
		
		System.out.println("Alan: " + alan + "\nCevre: " + cevre);
	}
}

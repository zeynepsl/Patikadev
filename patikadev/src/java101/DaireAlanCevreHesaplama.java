package java101;

import java.util.Scanner;

public class DaireAlanCevreHesaplama {
	public static void main(String[] args) {
		double pi = 3.14, yaricap, alan, cevre;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("yaricap degerini girin: ");
		yaricap = scanner.nextDouble();
		
		alan = pi * yaricap * yaricap;
		cevre = 2 * pi * yaricap;
		
		System.out.println("Alan: " + alan + "\nCevre: " + cevre);
	}
}

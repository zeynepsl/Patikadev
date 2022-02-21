package java101;

import java.util.Scanner;

public class HipotenusAlanHesaplama {

	public static void main(String[] args) {
		double kenar1, kenar2, kenar3;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. kenarı girin: ");
		kenar1 = scanner.nextDouble();
		
		System.out.print("2. kenarı girin: ");
		kenar2 = scanner.nextDouble();
		
		System.out.print("3. kenarı girin: ");
		kenar3 = scanner.nextDouble();
		
		hipotenusHesapla(kenar1, kenar2);
		
		alanHesapla(kenar1, kenar2, kenar3);
		
	}
	
	public static void hipotenusHesapla(double kenar1, double kenar2) {
		double kenar3, alan;
		kenar3 = Math.sqrt(kenar1*kenar1 + kenar2*kenar2);	
		alan = (kenar1 * kenar2) / 2;
		
		System.out.println("Hipotenus: " + kenar3 + "\nAlan: " + alan);
	}
	
	public static void alanHesapla(double kenar1, double kenar2, double kenar3) {
		double u, alan;
		u = (kenar1 + kenar2 + kenar3) / 2;
		alan = Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
		System.out.println("Alan: " + alan + "\nCevre: " + 2*u);
	}
}

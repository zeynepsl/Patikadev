package java101;

import java.util.Scanner;

public class KitleIndeksiHesapla {
	public static void main(String[] args) {
		//Kilo (kg) / Boy(m) * Boy(m)
		double kilo, boy, indeks;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("kilonuzu girin: ");
		kilo = scanner.nextDouble();
		
		System.out.println("boyunuzu girin: ");
		boy = scanner.nextDouble();
		
		indeks = kilo / (boy * boy);
		System.out.println("vucut kitle indeksi: " + indeks);
	}
}

package java101.conditions;

import java.util.Scanner;

public class KDVTutariHesaplama {
	/*
	 * KDV Tutarý Hesaplayan Program Java ile kullanýcýdan alýnan para deðerinin
	 * KDV'li fiyatýný ve KDV tutarýný hesaplayýp ekrana bastýran programý yazýn.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double kdv = 0.18, fiyat, kdvliFiyat, kdvTutari;

		System.out.println("KDV'siz Fiyatý girin: ");
		fiyat = scanner.nextDouble();

		kdv = fiyat > 1000 ? 0.8 : 0.18;

		kdvTutari = kdv * fiyat;
		kdvliFiyat = kdvTutari + fiyat;

		System.out.println("Girilen " + fiyat + " degerinin kdvli fiyatý: " + kdvliFiyat + "\nkdv tutarý: " + kdvTutari);

	}
}

package java101.conditions;

import java.util.Scanner;

public class KDVTutariHesaplama {
	/*
	 * KDV Tutar� Hesaplayan Program Java ile kullan�c�dan al�nan para de�erinin
	 * KDV'li fiyat�n� ve KDV tutar�n� hesaplay�p ekrana bast�ran program� yaz�n.
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double kdv = 0.18, fiyat, kdvliFiyat, kdvTutari;

		System.out.println("KDV'siz Fiyat� girin: ");
		fiyat = scanner.nextDouble();

		kdv = fiyat > 1000 ? 0.8 : 0.18;

		kdvTutari = kdv * fiyat;
		kdvliFiyat = kdvTutari + fiyat;

		System.out.println("Girilen " + fiyat + " degerinin kdvli fiyat�: " + kdvliFiyat + "\nkdv tutar�: " + kdvTutari);

	}
}

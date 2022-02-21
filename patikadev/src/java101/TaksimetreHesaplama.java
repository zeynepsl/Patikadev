package java101;

import java.util.Scanner;

public class TaksimetreHesaplama {
	/*
	 * Taksimetre Program� Java ile gidilen mesafeye (KM) g�re taksimetre tutar�n�
	 * ekrana yazd�ran program� yaz�n.
	 * 
	 * Taksimetre KM ba��na 2.20 TL tutmaktad�r. Minimum �denecek tutar 20 TL'dir.
	 * 20 TL alt�nda ki �cretlerde yine 20 TL al�nacakt�r. Taksimetre a��l�� �creti
	 * 10 TL'dir.
	 */
	public static void main(String[] args) {
		double perKm = 2.20, total = 20, startPrice = 10, kilometre;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Ka� kilometre gidildigini girin: ");
		kilometre = scanner.nextDouble();

		total = (kilometre * perKm) + startPrice;
		total = total < 20 ? 20 : total;

		System.out.println(kilometre + " kilometrede odenecek tutar: " + total);
	}
}

package java101;

import java.util.Scanner;

public class TaksimetreHesaplama {
	/*
	 * Taksimetre Programý Java ile gidilen mesafeye (KM) göre taksimetre tutarýný
	 * ekrana yazdýran programý yazýn.
	 * 
	 * Taksimetre KM baþýna 2.20 TL tutmaktadýr. Minimum ödenecek tutar 20 TL'dir.
	 * 20 TL altýnda ki ücretlerde yine 20 TL alýnacaktýr. Taksimetre açýlýþ ücreti
	 * 10 TL'dir.
	 */
	public static void main(String[] args) {
		double perKm = 2.20, total = 20, startPrice = 10, kilometre;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç kilometre gidildigini girin: ");
		kilometre = scanner.nextDouble();

		total = (kilometre * perKm) + startPrice;
		total = total < 20 ? 20 : total;

		System.out.println(kilometre + " kilometrede odenecek tutar: " + total);
	}
}

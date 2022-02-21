package java101;

import java.util.Scanner;

public class NotOrtalamasiHesapla {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double matNotu, fizikNotu, kimyaNotu, turkceNotu, tarihNotu, muzikNotu;
		
		//Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik
		System.out.print("Matematik notunu giriniz: ");
		matNotu = s.nextDouble();
		
		System.out.print("Fizik notunu giriniz: ");
		fizikNotu = s.nextDouble();
		
		System.out.print("Kimya notunu giriniz: ");
		kimyaNotu = s.nextDouble();
		
		System.out.print("Türkçe notunu giriniz: ");
		turkceNotu = s.nextDouble();
		
		System.out.print("Tarih notunu giriniz: ");
		tarihNotu = s.nextDouble();
		
		System.out.print("Müzik notunu giriniz: ");
		muzikNotu = s.nextDouble();
		
		double toplam = matNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu;
		double ort = toplam / 6;
		
		//60'dan büyük ise ekrana "Sýnýfý Geçti" , küçük ise "Sýnýfta Kaldý" yazsýn.
		String sonuc = ort > 60 ? "Sýnýfý geçti" : "Sýnýfta kaldý";
		
		System.out.println(sonuc);
	}
}

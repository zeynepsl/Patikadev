package java101;

import java.util.Scanner;

public class NotOrtalamasiHesapla {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double matNotu, fizikNotu, kimyaNotu, turkceNotu, tarihNotu, muzikNotu;
		
		//Matematik, Fizik, Kimya, T�rk�e, Tarih, M�zik
		System.out.print("Matematik notunu giriniz: ");
		matNotu = s.nextDouble();
		
		System.out.print("Fizik notunu giriniz: ");
		fizikNotu = s.nextDouble();
		
		System.out.print("Kimya notunu giriniz: ");
		kimyaNotu = s.nextDouble();
		
		System.out.print("T�rk�e notunu giriniz: ");
		turkceNotu = s.nextDouble();
		
		System.out.print("Tarih notunu giriniz: ");
		tarihNotu = s.nextDouble();
		
		System.out.print("M�zik notunu giriniz: ");
		muzikNotu = s.nextDouble();
		
		double toplam = matNotu + fizikNotu + kimyaNotu + turkceNotu + tarihNotu + muzikNotu;
		double ort = toplam / 6;
		
		//60'dan b�y�k ise ekrana "S�n�f� Ge�ti" , k���k ise "S�n�fta Kald�" yazs�n.
		String sonuc = ort > 60 ? "S�n�f� ge�ti" : "S�n�fta kald�";
		
		System.out.println(sonuc);
	}
}

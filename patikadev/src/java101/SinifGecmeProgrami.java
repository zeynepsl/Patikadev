package java101;

import java.util.Scanner;

public class SinifGecmeProgrami {
	/*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eðer girilen ders notlarý 0 veya 100 arasýnda deðil ise ortalamaya katýlmasýn.*/
	public static void main(String[] args) {
		double mat, fizik, turkce, kimya, muzik, gecmeNotu = 55, ort = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Mat notunu girin: ");
		mat = scanner.nextDouble();
		
		System.out.print("Fizik notunu girin: ");
		fizik = scanner.nextDouble();
		
		System.out.print("Turkce notunu girin: ");
		turkce = scanner.nextDouble();
		
		System.out.print("Kimya notunu girin: ");
		kimya = scanner.nextDouble();
		
		System.out.print("Muzik notunu girin: ");
		muzik = scanner.nextDouble();
		
		if(mat > 0 && mat < 100 && fizik > 0 && fizik < 100 && turkce > 0 && turkce < 100 && kimya > 0 && kimya < 100 && muzik > 0 && muzik <100) {
			ort = (mat + fizik + turkce + kimya + muzik) / 5;
		}
		else {
			System.out.println("girilen notlar uzerinden ortalama hesaplanamadi");
		}
		
		if(ort >= 55) {
			System.out.println("Gectiniz");
		}
	
		
	}
}

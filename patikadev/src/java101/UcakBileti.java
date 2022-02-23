package java101;

import java.util.Scanner;

/*Java ile mesafeye ve þartlara göre uçak bileti fiyatý hesaplayan programý yapýn. 
 * Kullanýcýdan Mesafe (KM), yaþý ve yolculuk tipi (Tek Yön, Gidiþ-Dönüþ) bilgilerini alýn. M
 * esafe baþýna ücret 0,10 TL / km olarak alýn. 
 * Ýlk olarak uçuþun toplam fiyatýný hesaplayýn ve sonrasýnda ki koþullara göre müþteriye aþaðýdaki indirimleri uygulayýn ;

Kullanýcýdan alýnan deðerler geçerli (mesafe ve yaþ deðerleri pozitif sayý, yolculuk tipi ise 1 veya 2) olmalýdýr. 
Aksi takdirde kullanýcýya "Hatalý Veri Girdiniz !" þeklinde bir uyarý verilmelidir.
Kiþi 12 yaþýndan küçükse bilet fiyatý üzerinden %50 indirim uygulanýr.
Kiþi 12-24 yaþlarý arasýnda ise bilet fiyatý üzerinden %10 indirim uygulanýr.
Kiþi 65 yaþýndan büyük ise bilet fiyatý üzerinden %30 indirim uygulanýr.
Kiþi "Yolculuk Tipini" gidiþ dönüþ seçmiþ ise bilet fiyatý üzerinden %20 indirim uygulanýr.*/
public class UcakBileti {
	public static void main(String[] args) {
		double km, herKmUcreti = 0.1, toplamUcret = 0;
		int yas, yolculukTipi;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("km: ");
		km = scanner.nextDouble();
		
		System.out.print("yas: ");
		yas = scanner.nextInt();
		
		System.out.print("Yolculuk tipi: 1-->\"tek yon\" 2-->\"gidis donus\"");
		yolculukTipi = scanner.nextInt();
		
		if(km > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {
			toplamUcret = km * herKmUcreti;
			if(yas < 12) {
				toplamUcret = toplamUcret - toplamUcret * 0.5;
			}
			else if(yas >= 12 && yas <= 24) {
				toplamUcret = toplamUcret - toplamUcret * 0.1;
			}
			else if(yas >= 65) {
				toplamUcret = toplamUcret - toplamUcret * 0.3;
			}
			
			if(yolculukTipi == 2) {
				toplamUcret = (toplamUcret - toplamUcret * 0.2) * 2;
			}
		}
		
		System.out.println("toplam tutar: " + toplamUcret);
		
		
	}
}

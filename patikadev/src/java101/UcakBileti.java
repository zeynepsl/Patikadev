package java101;

import java.util.Scanner;

/*Java ile mesafeye ve �artlara g�re u�ak bileti fiyat� hesaplayan program� yap�n. 
 * Kullan�c�dan Mesafe (KM), ya�� ve yolculuk tipi (Tek Y�n, Gidi�-D�n��) bilgilerini al�n. M
 * esafe ba��na �cret 0,10 TL / km olarak al�n. 
 * �lk olarak u�u�un toplam fiyat�n� hesaplay�n ve sonras�nda ki ko�ullara g�re m��teriye a�a��daki indirimleri uygulay�n ;

Kullan�c�dan al�nan de�erler ge�erli (mesafe ve ya� de�erleri pozitif say�, yolculuk tipi ise 1 veya 2) olmal�d�r. 
Aksi takdirde kullan�c�ya "Hatal� Veri Girdiniz !" �eklinde bir uyar� verilmelidir.
Ki�i 12 ya��ndan k���kse bilet fiyat� �zerinden %50 indirim uygulan�r.
Ki�i 12-24 ya�lar� aras�nda ise bilet fiyat� �zerinden %10 indirim uygulan�r.
Ki�i 65 ya��ndan b�y�k ise bilet fiyat� �zerinden %30 indirim uygulan�r.
Ki�i "Yolculuk Tipini" gidi� d�n�� se�mi� ise bilet fiyat� �zerinden %20 indirim uygulan�r.*/
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

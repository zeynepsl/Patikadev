package java101;

import java.util.Scanner;

public class LoginPratik {
	/*
	 * �dev E�er �ifre yanl�� ise kullan�c�ya �ifresini s�f�rlay�p s�f�rlamayaca��n�
	 * sorun, e�er kullan�c� s�f�rlamak isterse yeni girdi�i �ifrenin hatal� girdi�i
	 * ve unuttu�u �ifre ile ayn� olmamas� gerekti�ini kontrol edip , �ifreler ayn�
	 * ise ekrana "�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz." sorun yoksa
	 * "�ifre olu�turuldu" yazan program� yaz�n�z.
	 */
	public static void main(String[] args) {
		String mevcutSifre = "merhaba", girilenSifre;
		Scanner scanner = new Scanner(System.in);

		girilenSifre = scanner.nextLine();

		if (girilenSifre.equals(mevcutSifre)) {
			System.out.println("Basarili giris");
		} else {
			System.out.println("Basarisiz giris");
			sifreYenile(mevcutSifre, girilenSifre, scanner);
		}

	}

	public static void sifreYenile(String mevcutSifre, String girilenSifre, Scanner scanner) {
		String yeniSifre;
		int choice;
		System.out.print("�ifrenizi s�f�rlamak istiyor musunuz? 1-->Evet 2-->Hay�r");
		choice = scanner.nextInt();

		if (choice == 1) {
			System.out.print("Yeni sifrenizi girin: ");
			yeniSifre = scanner.next();
			
			if (!yeniSifre.equals(girilenSifre) && !yeniSifre.equals(mevcutSifre)) {
				mevcutSifre = yeniSifre;
				System.out.println("�ifre olu�turuldu");
				
			} 
			else {
				System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz.");
			}
		
		}
	
	}
}

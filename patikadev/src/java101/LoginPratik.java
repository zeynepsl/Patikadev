package java101;

import java.util.Scanner;

public class LoginPratik {
	/*
	 * Ödev Eðer þifre yanlýþ ise kullanýcýya þifresini sýfýrlayýp sýfýrlamayacaðýný
	 * sorun, eðer kullanýcý sýfýrlamak isterse yeni girdiði þifrenin hatalý girdiði
	 * ve unuttuðu þifre ile ayný olmamasý gerektiðini kontrol edip , þifreler ayný
	 * ise ekrana "Þifre oluþturulamadý, lütfen baþka þifre giriniz." sorun yoksa
	 * "Þifre oluþturuldu" yazan programý yazýnýz.
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
		System.out.print("Þifrenizi sýfýrlamak istiyor musunuz? 1-->Evet 2-->Hayýr");
		choice = scanner.nextInt();

		if (choice == 1) {
			System.out.print("Yeni sifrenizi girin: ");
			yeniSifre = scanner.next();
			
			if (!yeniSifre.equals(girilenSifre) && !yeniSifre.equals(mevcutSifre)) {
				mevcutSifre = yeniSifre;
				System.out.println("Þifre oluþturuldu");
				
			} 
			else {
				System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
			}
		
		}
	
	}
}

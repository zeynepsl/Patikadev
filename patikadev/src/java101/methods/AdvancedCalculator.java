package java101.methods;

import java.util.Scanner;

public class AdvancedCalculator {
	public static void main(String[] args) {
		int choice;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println(
					"seciminiz: \n" + "1- Toplama Ýþlemi\r\n" + "2- Çýkarma Ýþlemi\r\n" + "3- Çarpma Ýþlemi\r\n"
							+ "4- Bölme iþlemi\r\n" + "5- Üslü Sayý Hesaplama\r\n" + "6- Faktoriyel Hesaplama\r\n"
							+ "7- Mod Alma\r\n" + "8- Dikdörtgen Alan ve Çevre Hesabý\\r\\n" + "9- Çýkýþ");
			choice = scanner.nextInt();
			if (choice == 1) {
				System.out.println("sonuc: " + toplama(scanner));
			} 
			else if (choice == 2) {
				System.out.println("sonuc: " + cikarma(scanner));
			} 
			else if (choice == 3) {
				System.out.println("sonuc: " + carpma(scanner));
			} 
			else if (choice == 4) {
				System.out.println("sonuc: " + bolme(scanner));
			} 
			else if (choice == 5) {
				System.out.println("sonuc: " + usluSayiHesapla(scanner));
			} 
			else if (choice == 6) {
				System.out.println("sonuc: " + faktoriyel(scanner));
			} 
			else if (choice == 7) {
				System.out.println("sonuc: " + modAlma(scanner));
			} 
			else if (choice == 8) {
				System.out.println("1.kenari giriniz: ");
				int kenar1 = scanner.nextInt();
				
				System.out.println("2.kenari giriniz: ");
				int kenar2 = scanner.nextInt();
				
				System.out.println("sonuc: " + dikdortgenAlan(scanner, kenar1, kenar2));
				System.out.println("sonuc: " + dikdortgeCevre(scanner, kenar1, kenar2));
			} 
			else if (choice == 9) {
				System.out.println("cikis yapiliyor");
				break;
			}
			else {
				System.out.println("hatali giris");
				break;
			}
			
			//bu kosullari switch ile yapip, choice'in 9 olmasini(cikis) if ile kontrol edebiliriz
		}

	}
	
	public static double toplama(Scanner scanner) {
		double toplam = 0;
		System.out.println("toplamak istediginiz sayilari giriniz: ");
		while (true) {
			System.out.print("sayiyi girin: (cikis: -1) ");
			double n = scanner.nextDouble();
			if(n == -1) 
				break;
			toplam += n;
		}
		return Math.round(toplam);
	}
	
	public static double cikarma(Scanner scanner) {
		double fark = 0;
		System.out.println("cikarmak istediginiz sayilari giriniz: ");
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		fark = n1 - n2;
		return fark;
	}
	
	public static double carpma(Scanner scanner) {
		double sonuc = 1;
		System.out.println("carpmak istediginiz sayilari giriniz: ");
		while (true) {
			System.out.print("sayiyi girin: (cikis: -1) ");
			double n = scanner.nextDouble();
			if(n == -1) 
				break;
			sonuc *= n;
		}
		return Math.round(sonuc);
	}
	
	public static double bolme(Scanner scanner) {
		double sonuc = 0;
		System.out.println("bolmek istediginiz sayilari giriniz: ");
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		if(n2 == 0) {
			System.out.println("bolen 0 olamaz");
			return 0;
		}
		sonuc = n1 / n2;
		return sonuc;
	}
	
	public static double usluSayiHesapla(Scanner scanner) {
		double sonuc = 1;
		System.out.println("taban sayiyi giriniz: ");
		double taban = scanner.nextDouble();
		
		System.out.println("us sayiyi giriniz: ");
		double us = scanner.nextDouble();
		
		for(int i = 0; i < us; i++)
			sonuc *= taban;
	
		return sonuc;
	}
	
	public static int faktoriyel(Scanner scanner) {
		int sonuc = 1;
		System.out.println("faktoriyeli alinacak sayiyi giriniz: ");
		int n = scanner.nextInt();
		
		while (n > 1) {
			sonuc *= n;
			n--;
		}
		return sonuc;
	}
	
	public static double modAlma(Scanner scanner) {
		double sonuc = 0;
		System.out.println("modu alinacak sayiyi giriniz: ");
		double n = scanner.nextDouble();
		
		System.out.println("mod sayisini giriniz: ");
		double mod = scanner.nextDouble();
		
		sonuc = n % mod;
		return sonuc;
	}
	
	public static int dikdortgenAlan(Scanner scanner, int kenar1, int kenar2) {
		int alan;
		alan = kenar1 * kenar2;
		return alan;
	}
	
	public static int dikdortgeCevre(Scanner scanner, int kenar1, int kenar2) {
		int cevre;
	    cevre = kenar1*2 + kenar2*2;
		return cevre;
	}
}

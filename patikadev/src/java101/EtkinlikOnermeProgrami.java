package java101;

import java.util.Scanner;

/*Koþullar :

Sýcaklýk 5'dan küçük ise "Kayak" yapmayý öner.
Sýcaklýk 5 ve 15 arasýnda ise "Sinema" etkinliðini öner.
Sýcaklýk 10 ve 25 arasýnda ise "Piknik" etkinliðini öner.
Sýcaklýk 25'ten büyük ise "Yüzme" etkinliðini öner.
Ödev
Ayný örnek üzerinden if koþullarý baþka hangi þekilde oluþturulabilirdi farklý çözüm yollarý bulunuz.*/
public class EtkinlikOnermeProgrami {
	public static void main(String[] args) {
		int sicaklik;
		Scanner scanner = new Scanner(System.in);
		sicaklik = scanner.nextInt();
		
		if(sicaklik < 5) {
			System.out.println("Kayak");
		}
		else if(sicaklik >= 5 && sicaklik < 25) {
			if(sicaklik <= 15) {
				System.out.println("Sinema");
			}
			if(sicaklik >= 10) {
				System.out.println("Piknik");
			}
		}
		else {
			System.out.println("yuzme");
		}
	}
}

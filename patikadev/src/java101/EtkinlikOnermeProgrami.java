package java101;

import java.util.Scanner;

/*Ko�ullar :

S�cakl�k 5'dan k���k ise "Kayak" yapmay� �ner.
S�cakl�k 5 ve 15 aras�nda ise "Sinema" etkinli�ini �ner.
S�cakl�k 10 ve 25 aras�nda ise "Piknik" etkinli�ini �ner.
S�cakl�k 25'ten b�y�k ise "Y�zme" etkinli�ini �ner.
�dev
Ayn� �rnek �zerinden if ko�ullar� ba�ka hangi �ekilde olu�turulabilirdi farkl� ��z�m yollar� bulunuz.*/
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

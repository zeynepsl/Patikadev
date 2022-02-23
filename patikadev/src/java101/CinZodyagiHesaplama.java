package java101;

import java.util.Scanner;

public class CinZodyagiHesaplama {
	public static void main(String[] args) {
		int dogumYili, kalan;
		String cinZodyagi = "";
		Scanner scanner = new Scanner(System.in);
		dogumYili = scanner.nextInt();

		kalan = dogumYili % 12;

		switch (kalan) {
		case 0:
			cinZodyagi = "Maymun";
			break;
			
		case 1:
			cinZodyagi = "Horoz";
			break;
			
		case 2:
			cinZodyagi = "Kopek";
			break;
			
		case 3:
			cinZodyagi = "Domuz";
			break;
			
		case 4:
			cinZodyagi = "Fare";
			break;
			
		case 5:
			cinZodyagi = "Okuz";
			break;
			
		case 6:
			cinZodyagi = "Kaplan";
			break;
		
		case 7:
			cinZodyagi = "Tavsan";
			break;
		
		case 8:
			cinZodyagi = "Ejderha";
			break;
			
		case 9:
			cinZodyagi = "Yilan";
			break;
			
		case 10:
			cinZodyagi = "At";
			break;
		
		case 11:
			cinZodyagi = "Koyun";
			break;

		default:
			System.out.println("hatali giris");
			break;
		}
		
		System.out.println(cinZodyagi);
	}
}

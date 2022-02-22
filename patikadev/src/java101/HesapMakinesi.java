package java101;

import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args) {
		double a, b, result;
		int choice;
		Scanner scanner = new Scanner(System.in);

		System.out.print("1.say�y� girin: ");
		a = scanner.nextDouble();

		System.out.print("2.say�y� girin: ");
		b = scanner.nextDouble();

		System.out.print("1--> toplama\n2-->��karma\n3-->Bolme\n4-->Carpma");
		choice = scanner.nextInt();
		

		switch (choice) {
		case 1:
			result = a + b;
			break;
		case 2:
			result = a - b;
			break;
		case 3:
			if(b == 0) {
				result = 0;
				break;
			}
			else {
				result = a / b;
				break;
			}
			
		case 4:
			result = a * b;
			break;
		default:
			result = 0;
			break;
		}
		
		String str = result == 0 ? "Yanlis sayilar girildi" : "Hesaplama tamamland�";
		System.out.println(str + ". sonuc: " + result);
	}
}

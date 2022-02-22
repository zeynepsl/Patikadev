package java101;

import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args) {
		double a, b, result;
		int choice;
		Scanner scanner = new Scanner(System.in);

		System.out.print("1.sayýyý girin: ");
		a = scanner.nextDouble();

		System.out.print("2.sayýyý girin: ");
		b = scanner.nextDouble();

		System.out.print("1--> toplama\n2-->Çýkarma\n3-->Bolme\n4-->Carpma");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			result = a + b;
			break;
		case 2:
			result = a - b;
			break;
		case 3:
			result = a / b;
			break;
		case 4:
			result = a *b;
			break;
		default:
			result = 0;
			break;
		}
		
		System.out.println("Sonuc: " + result);
	}
}

package java101;

import java.util.Scanner;

public class ManavKasaProgrami {

	public static void main(String[] args) {
		double armutKg = 2.14, elmaKg = 3.67, domatesKg = 1.11, muzKg = 0.95, patl�canKg = 5;
		double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, tutar;
		Scanner scanner = new Scanner(System.in);
		armutKilo = scanner.nextDouble();
		elmaKilo = scanner.nextDouble();
		domatesKilo = scanner.nextDouble();
		muzKilo = scanner.nextDouble();
		patlicanKilo = scanner.nextDouble();
		
		tutar = armutKilo * armutKg + elmaKilo * elmaKg + domatesKilo * domatesKg + muzKilo * muzKg + patlicanKilo * patl�canKg;
		System.out.println("Tutar: " + tutar);
	}
}

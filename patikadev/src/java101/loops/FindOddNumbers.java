package java101.loops;

import java.util.Scanner;

public class FindOddNumbers {
	/*
	 * Java d�ng�ler ile negatif bir de�er girilene kadar kullan�c�dan giri�leri
	 * kabul eden ve girilen de�erlerden tek say�lar� toplay�p ekrana basan program�
	 * yaz�yoruz.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int total = 0;

		do {
			System.out.println("sayiyi girin: ");
			num = scanner.nextInt();
			if (num % 2 == 1) {
				total += num;
			}
		} while (num > 0);

		/*
		 * while(num != -1) { if(num % 2 != 0) { total += num; }
		 * System.out.println("sayiyi girin: "); num = scanner.nextInt(); }
		 */

		System.out.println("toplam: " + total);
	}
	// Her zorlu�un bir m�kafat� vard�r. :)))
}

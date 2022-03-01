package java101.loops;

import java.util.Scanner;

public class FindOddNumbers {
	/*
	 * Java döngüler ile negatif bir deðer girilene kadar kullanýcýdan giriþleri
	 * kabul eden ve girilen deðerlerden tek sayýlarý toplayýp ekrana basan programý
	 * yazýyoruz.
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
	// Her zorluðun bir mükafatý vardýr. :)))
}

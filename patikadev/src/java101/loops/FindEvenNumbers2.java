package java101.loops;

import java.util.Scanner;

public class FindEvenNumbers2 {
	/*Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul eden ve 
	 * girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p ekrana basan program� yaz�yoruz.*/
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("sayiyi girin: ");
		int num = scanner.nextInt();
		int total = 0;
		
		
		//????? :| :)) :|
		while(num % 2 == 1) {		
			
			if(num % 4 == 0) {
				total += num;
			}
			
			System.out.println("sayiyi girin: ");
			num = scanner.nextInt();
		}
		
		System.out.println("toplam:" + total);
	}
}

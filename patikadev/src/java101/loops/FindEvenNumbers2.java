package java101.loops;

import java.util.Scanner;

public class FindEvenNumbers2 {
	/*Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul eden ve 
	 * girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp ekrana basan programý yazýyoruz.*/
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

package java101.loops;

import java.util.Scanner;

public class FindMinMaxNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kac sayi gireceksiniz: ");
		int n = scanner.nextInt();
		if(n < 0) {
			System.out.println("hatali giris");
			return;
		}
		
		int enBuyuk = Integer.MIN_VALUE, enKucuk = Integer.MAX_VALUE;
		
		for(int i = 0; i < n; i++) {
			System.out.print((i+1) + ". sayiyi girin: ");
			int num = scanner.nextInt();
			
			if(num > enBuyuk) {
				enBuyuk = num;
			}
			else if(num < enKucuk) {
				enKucuk = num;
			}
		}
		
		System.out.println("en buyuk: " + enBuyuk + " en kucuk: " + enKucuk);
		
		/*
		 
kac sayi gireceksiniz: 
4
1. sayiyi girin: 16
2. sayiyi girin: -22
3. sayiyi girin: -15
4. sayiyi girin: 100
en buyuk: 100 en kucuk: -22

*/
	}
}

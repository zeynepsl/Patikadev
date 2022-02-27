package java101;

import java.util.Scanner;

public class Donguler {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*//dongulerle 2 sayýnýn ortasýndaki sayýyý bulabiliriz
		//100, 200 --> 150 yi bulmak gibi
		
		int left = 100, right = 200;
		while(++left < --right);//dongu parantezi açmayacaksan boyle de yazabilirsin
		
		//Tam olarak ne zaman biteceði kestirilemeyen durumlarda --> while
		//hem rigth hem de left ayný birim mesafeyle birbirlerine yaklaþacaklar
		System.out.println(left);*/
		
		
		
		/*int sum = 0;
		for (int i = 0, j = 0; i &lt; 5 || j &lt; 5; ++i, j = i + 1) {
		   sum += i;
		}
		System.out.println(sum);*/
		//&lt; --> küçüktür iþareti(<)
		//10
		
		/*for(boolean run = true; run;) {
			System.out.println("sayi girin: ");
			int sayi = scanner.nextInt();
			if(sayi < 0) {
				run = false;
			}
		}*/
		
		//amaaaa bu yukaridaki islemi daha kisa yazabiliriz:
		
		int sayi = 0;
		do {
			System.out.println("sayi girin: ");
			sayi = scanner.nextInt();
		} while (sayi > 0);
		
		//sonunu bildigin durmda --> for
		//          bilmediðinde --> while
	}
}

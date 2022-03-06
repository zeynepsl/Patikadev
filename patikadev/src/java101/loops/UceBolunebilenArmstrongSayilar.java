package java101.loops;

public class UceBolunebilenArmstrongSayilar {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			boolean res = ArmstrongNumbers.sayiArmstrongMu(i);
			if (res)System.out.println(i + " armstrong bir sayidir");
			// else System.out.println(i + " armstrong bir sayi degildir");
		}
		/*
		 * output: 
		 * 153 armstrong bir sayidir 
		 * 370 armstrong bir sayidir 
		 * 371 armstrong bir sayidir 
		 * 407 armstrong bir sayidir
		 */
	}
}

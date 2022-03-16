package java101.loops;

import java.util.Scanner;

public class EbobEkok {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int enKucuk = 0, enBuyuk = 0, i = 0, ebobSonuc = 0;
		
		if(num1 > num2) {
			enBuyuk = num1;
			enKucuk = num2;
		}
		else {
			enBuyuk = num2;
			enKucuk = num1;
		}
		
		//tersten:
		i = enKucuk;
		while(i > 0) {
			if(num1 % i == 0 && num2 % i == 0) {
				ebobSonuc = i;
				System.out.println("ebob: " + ebobSonuc);
				break;
			}
			i--;
		}
		
		//bastan:
		i = 1;
		while(i <= enKucuk) {
			if(num1 % i == 0 && num2 % i == 0) {
				ebobSonuc = i;
			}
			i++;
		}
		System.out.println("bastan giderek: " + ebobSonuc);
		
		
		//ekok 1. yontem:
		int ekok = enBuyuk;
		i = 1;
		while(true) {
			ekok = enBuyuk * i;
			if(ekok % num1 == 0 && ekok % num2 == 0) {
				System.out.println("ekok: " + ekok);
				break;
			}
			i++;
		}
		
		//ekok 2. yontem:
		for(i = enKucuk; i < (num1*num2); i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println("ekok: " + i);
				break;
			}
		}
		
		//ekok 3. yontem:
		ekok = (num1*num2) / ebobSonuc;
		System.out.println("ekok: " + ekok);
		
	}
}

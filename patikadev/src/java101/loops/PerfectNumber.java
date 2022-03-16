package java101.loops;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num == 1) {
			System.out.println(num + " mukemmel deðildir");
			return;
		}
		int bolenToplami = 1;
		
		//asagidaki bu cozum buyuk sayilarda TLE (zaman asimi hatasi) aliyor
		/*for(int i = 1; i < Math.sqrt(num); i++) {
			if(num % i == 0) {
				bolenToplami += i;
		}
		}*/
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				bolenToplami += i + num/i;
			}
		}
		
		if(bolenToplami == num) {
			System.out.println(num + " mukemmeldir");
		}
		else {
			System.out.println(num + " mukemmel deðildir");
		}
		
	}
}

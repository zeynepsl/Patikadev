package java101.loops;

import java.util.Scanner;

public class TwoPower {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i;
		
		System.out.print("sayiyi girin: ");
		int num = scanner.nextInt();
		
		System.out.println("girilen sayýya kadar olan 2'nin kuvvetleri:");
		for(i = 1; i <= num; i*=2) {
			System.out.print(i + " ");
		}
		
		System.out.println("\ngirilen sayýya kadar olan 4'un kuvvetleri:");
		for(i = 4; i <= num; i*=4) {
			System.out.print(i + " ");
		}
		
		System.out.println("\ngirilen sayýya kadar olan 5'in kuvvetleri:");
		for(i = 5; i <= num; i*=5) {
			System.out.print(i + " ");
		}
		
		
	}
}

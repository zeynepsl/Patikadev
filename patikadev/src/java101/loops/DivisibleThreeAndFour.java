package java101.loops;

import java.util.Scanner;

public class DivisibleThreeAndFour {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num < 12) {
			System.out.println("girdiginiz sayi ne 3'e ne de 4'e bolunemez");
			return;
		}
		
		for(int i = 12; i <= num; i+=12) {
			System.out.print(i + " ");
		}
	}
}

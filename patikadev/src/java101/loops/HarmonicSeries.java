package java101.loops;

import java.util.Scanner;

public class HarmonicSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double res = 0;
		int num;
		
		System.out.println("sayiyi girin: ");
		num = scanner.nextInt();
		
		while(num > 0) {
			res += (1.0/num);
			num--;
		}
		
		
		System.out.println(String.format("%.3f", res));
	}
}

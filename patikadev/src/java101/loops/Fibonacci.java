package java101.loops;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		int birinci = 0, ikinci = 1, ucuncu = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.println(ucuncu);
			ucuncu = birinci + ikinci;
			birinci = ikinci;
			ikinci = ucuncu;
			
		}
		
	}
	/*
9 elemanli fibonacci:

0
1
2
3
5
8
13
21
34

*/
}

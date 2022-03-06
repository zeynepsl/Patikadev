package java101.loops;

import java.util.Scanner;

public class Combination {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, r, nFact, rFact, nDistr, res = 0;
		System.out.println("n sayisini girin: ");
		n = scanner.nextInt();
		
		System.out.println("r sayisini girin: ");
		r = scanner.nextInt();

		res = 0;
		
		nFact = Factorial.fact(n);
		rFact = Factorial.fact(r);
		nDistr = Factorial.fact(n-r);
		
		res = nFact / (rFact * nDistr);
		
		System.out.println(res);
	}
}

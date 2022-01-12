package coderbyte.week5;

import java.util.Scanner;

public class MyMedium {
	public static boolean checkIfPrime(int inputNumber) {
		//Math.sqrt(inputNumber); bu da kosul olarak kullanilabilir
		for(int i = 2; i < (inputNumber / 2); i++) {
			if(inputNumber % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(checkIfPrime(scanner.nextInt()));
	}
}

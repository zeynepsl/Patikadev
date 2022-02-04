package coderbyte.week9;

import java.util.Scanner;

public class Medium {
	public static boolean EvenPairs(String str) {
		// code goes here
		boolean result = false;

		for (int i = 2; i < str.length(); i++) {

			// aabbbbb46 ise:
			if (Character.isDigit(str.charAt(i)) && Character.isDigit(str.charAt(i - 1))) {
				if ((str.charAt(i) % 2 == 0) && (str.charAt(i - 1) % 2 == 0)) {
					result = true;
				}
			}

			// aaa412 ise
			if (Character.isDigit(str.charAt(i - 2)) && Character.isDigit(str.charAt(i - 1))
					&& Character.isDigit(str.charAt(i))) {
				if ((str.charAt(i - 2) % 2 == 0) && (str.charAt(i) % 2 == 0)) {
					result = true;
				}
			}

		}

		return result;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(EvenPairs(s.nextLine()));
	}
}

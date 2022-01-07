package coderbyte.week4;

import java.util.Scanner;

public class MyEasy {

	public static boolean ABCheck(String str) {
		//laura sobs --> true
		//a ve b arasında 3 karakter varsa true döndür
		
		int count = 0;
		int index = 0;
		int tempIndex = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'A') {
				index = i + 1;
				for (int j = 0; j < 3; j++) {
					if (index < str.length()) {

						if (str.charAt(index) != 'a' && str.charAt(index) != 'b') {
							++count;
							++index;
						}

					}
				}

			}
			tempIndex = index;
		}

		if ((index + 1) < str.length()) {
			if (str.charAt(index + 1) == 'b' && count == 3) {
				return true;
			}
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(ABCheck(s.nextLine()));
	}

}

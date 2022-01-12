package coderbyte.week5;

import java.util.Scanner;

public class Easy {
	public static int consonantCount(String str) {
		String s = str.toLowerCase();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char currentCh = str.charAt(i);
			if(currentCh != 'a' && currentCh != 'i' && currentCh != 'e' && 
					currentCh != 'o' && currentCh != 'u') {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(consonantCount(scanner.nextLine()));
	}
}

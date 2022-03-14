package coderbyte.week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LetterCount {
	public static String letterCount(String str) {
		String[] ayrilmisStr = str.split(" ");
		String res = "";
		for(String herStr : ayrilmisStr) {
			int count = findCount(herStr);
			if(count > 1) {
				res = herStr;
				break;
			}
		}
		return res;
	}

	public static int findCount(String str) {
		int count = 1;//her harf zaten 1 kere var :)
		
		//bu dongu aaaaabbb vs.. icin 6 dondurur fakat bu soruda bu sorun degil, 
		//en cok tekrar eden harfi bulmak istiyoruz sonucta, detaylara bu soruda gerek yok
		for(int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			for(int j = i+1; j < str.length(); j++) {
				if(current == str.charAt(j)) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(letterCount("aabbb apple"));
		//System.out.println(findCount("hello"));
	}
}

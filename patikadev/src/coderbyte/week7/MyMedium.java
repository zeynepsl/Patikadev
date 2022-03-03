package coderbyte.week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MyMedium {
	public static String letterCount(String str) {
		HashMap<Integer, String> lettersAndCounts = new HashMap<Integer, String>();
		//         key   value
		
		//Hello apple pie
		String[] letters = str.split(" ");
		for(String s : letters){
			int max = findCount(s);
			lettersAndCounts.put(max, s);
		}
		
		List<Integer> counts = new ArrayList<Integer>();
		for(int i : lettersAndCounts.keySet()) {
			counts.add(i);
		}
		
		Collections.sort(counts);
		//int maxKey = findMax(counts);
		int key = 0;
		for(int i = 1; i < counts.size(); i++) {
			if(counts.get(i-1) == counts.get(i)) {
				key = i-1;
				break;
			}
		}
		//int lastIndex = counts.size()-1;
		String value = lettersAndCounts.get(counts.get(key));
		return value;
	}
	
	//her bir stringin içinde en çok geçen harfin kaç kere geçtiðini bulur:
	//merhaba --> 2
	public static int findCount(String str) {
		List<Integer> counts = new ArrayList<Integer>();
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			for(int j = i+1; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					count++;
			}
			counts.add(count);
			count = 1;
		}
		
		int max = counts.get(0);
		for(int i = 1; i < counts.size(); i++) {
			if(counts.get(i) > max)
				max = counts.get(i);
		}
		return max;
	}
	
	public static int findMax(List<Integer> list) {
		int max = list.get(0);
		for(int i = 1; i < list.size(); i++) {
			if(list.get(i) > max)
				max = list.get(i);
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(letterCount("Hello apple"));
	}
}

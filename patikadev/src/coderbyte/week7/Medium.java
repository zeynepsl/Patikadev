package coderbyte.week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Medium {
	//ayný harfden içinde en cok bulunan string i döndür
	 public static String LetterCount(String str) {
		    HashMap<Character, Integer> repeatedLetters;
		    ArrayList<Integer> greatestList = new ArrayList<>();

		    String[] words = str.split(" ");

		    for(String word : words){
		       repeatedLetters = new HashMap<>();
		       for(int i = 0 ; i < word.length(); i++){
		         Integer count = repeatedLetters.get(word.charAt(i));
		         if(count == null) count = 0;
		         repeatedLetters.put(word.charAt(i), count + 1);
		       }

		       int great = 0;
		       for(Character c : repeatedLetters.keySet()){

		         if(great < repeatedLetters.get(c)) great = repeatedLetters.get(c);
		       }

		      greatestList.add(great);
		    }

		    int maxAt = 0;
		    for(int i = 0; i < greatestList.size(); i++) {
		      maxAt = greatestList.get(i) > greatestList.get(maxAt) ? i : maxAt;
		    }

		    if(greatestList.get(maxAt) > 1) return words[maxAt];


		    return "-1";
		}



		  public static void main (String[] args) {
		    // keep this function call here
		    Scanner s = new Scanner(System.in);
		    System.out.print(LetterCount(s.nextLine())); 
		  }
		   
}

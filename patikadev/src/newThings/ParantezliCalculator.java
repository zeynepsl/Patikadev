package newThings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParantezliCalculator {
	/*
	 •	public static int[] copyOfRange(int[] original_array, int from_index, int to_index) 
-	original_array : Kopyalanacak dizi
-	from_index : Kopyalanacak aralýðýn baþlangýç dizini
-	to_end : Kopyalanacak aralýðýn bitiþ dizini
•	ilk index dahil, son index dahil deðil
•	copyOfRange(T[] kpyalanacakDizi, int baþlangýçIndexi, int bitiþÝndexi) 
•	String[] nodesRest = Arrays.copyOfRange(strArr, 2, numNodes);// Y Z

	 */
	public static int calculate(String str) {
		List<Integer> parantezIndexleri = new ArrayList<Integer>();
		String res = "";
		List<Integer> results = new ArrayList<Integer>();
		List<Character> operators = new ArrayList<Character>();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				parantezIndexleri.add(i);
				//if((i+1) < str.length()) res += str.charAt(i+1);
			}
			if(str.charAt(i) == ')') {
				parantezIndexleri.add(i);
				if((i+1) < str.length()) operators.add(str.charAt(i+1));
				//results.add(basicCalculator(res));
			}
		}
		
		for(int i = 1; i < (parantezIndexleri.size()/2); i++) {
			int start = parantezIndexleri.get(i-1);
			int end = parantezIndexleri.get(i);
			//String[] strArr = Arrays.copyOf(str, start+1, end);
			String parantezIcýndekiStr = str.substring(start+1, end);
			results.add(basicCalculator(parantezIcýndekiStr));
		}
		
		
		//String[] strArr = {};//parantezlerin içidejki her bir string ifadesini bu array e atýcaz, her bir string ifadesini kendi içinde hesaplýycaz en son da hepsini hesaplýycaz

		
		
	}

	public static int basicCalculator(String str) {
		// "2-1 + 2"
		// 1+2-4-1 hesaplayabilir bu program
		int i;
		List<Integer> numList = new ArrayList<Integer>();
		List<Character> operatorList = new ArrayList<Character>();
		// bosluk --> \\s
		String newStr = str.replaceAll("\\s", "");
		for (i = 0; i < newStr.length(); i += 2) {
			int num = Character.getNumericValue(newStr.charAt(i));// 1 ise 1 i atar
			numList.add(num);
		}

		for (i = 1; i < newStr.length(); i += 2) {
			char operator = newStr.charAt(i);
			operatorList.add(operator);
		}

		int k = 1, result = numList.get(0);
		for (i = 0; i < operatorList.size(); i++) {
			char operator = operatorList.get(i);
			if (operator == '+') {
				result = result + numList.get(k);
			}

			if (operator == '-') {
				result = result - numList.get(k);
			}

			k++;
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(calculate("1+2+3-1+2-4"));
	}
}

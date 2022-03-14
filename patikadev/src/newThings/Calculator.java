package newThings;

import java.util.ArrayList;
import java.util.List;



public class Calculator {
	public static int calculate(String str) {
		//"2-1 + 2"
		//1+2-4-1 hesaplayabilir bu program
		int i;
		List<Integer> numList = new ArrayList<Integer>();
		List<Character> operatorList = new ArrayList<Character>();
		// bosluk --> \\s
		String newStr = str.replaceAll("\\s", "");
		for (i = 0; i < newStr.length(); i += 2) {
			// int num = str.charAt(i); //ascii deðerini atar
			int num = Character.getNumericValue(newStr.charAt(i));// 1 ise 1 i atar
			numList.add(num);
		}
		
		for(i = 1; i < newStr.length(); i+=2) {
			char operator = newStr.charAt(i);
			operatorList.add(operator);
		}
		
		int k = 1, result = numList.get(0);
		for(i = 0; i < operatorList.size(); i++) {
			char operator = operatorList.get(i);
			if(operator == '+') {
				result = result + numList.get(k);
				//numList.add(j, result);//j. index e result ý ata
				//numList --> 1 2 3
			}
			
			if(operator == '-') {
				result = result - numList.get(k);
				//numList.add(k, result);
			}
			
			k++;
		}
		
		return result;
	}
	public static void main(String[] args) {
		System.out.println(calculate("1+2+3-1+2-4"));
	}
}

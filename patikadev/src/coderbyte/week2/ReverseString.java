package coderbyte.week2;

public class ReverseString {
	public static boolean reverse(String str) {
		String result = "";
		
		for(int i = str.length()-1; i >=0; i++) 
			result += str.charAt(i);
		
		return result.equals(str);
	}
}

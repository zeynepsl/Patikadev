package coderbyte.week3;

public class Easy {
	//palindrom kontrol
	
	public static boolean palindrom(String str) {
		String reverseStr = "";
		for(int i = str.length()-1 ; i >=0; i--) {
			reverseStr += str.charAt(i);
		}
		boolean result = str.equals(reverseStr);
		return result;
	}
	public static void main(String[] args) {
		System.out.println(palindrom("ece")); 
	}
}

package coderbyte.week6;

public class Medium2 {
	public static boolean palindromeTwo(String str) {
		String input = str.toLowerCase();
		String alphaStr = "";
		int i;
		
		for(i = 0; i < input.length(); i++) {
			if(Character.isAlphabetic(input.charAt(i)))
				alphaStr += input.charAt(i);
		}
		
		String reverse = "";
		for(i = alphaStr.length()-1; i >= 0 ; i--) {
			reverse += alphaStr.charAt(i);
		}
		
		return reverse.equals(alphaStr);
	}
	
	public static void main(String[] args) {
		System.out.println(palindromeTwo("Noelhg - 9gh leon??"));
	}
}

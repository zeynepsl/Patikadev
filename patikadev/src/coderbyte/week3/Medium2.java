package coderbyte.week3;


public class Medium2 {
	//aaabbcd --> 3a2b1c1d
	public static String runLength(String str) {
		String result = "";
		int count = 1;
		char value = str.charAt(0);
		for(int i = 1; i < str.length(); i++) {
			char entry = str.charAt(i);
			if(entry == value) {
				count += 1;
			}
			else {
				result += "" + count + value;
				count = 1;
				value = entry;
			}
			
		}
		result += "" + count + value;
		
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(runLength("aabc"));
		
	}
}

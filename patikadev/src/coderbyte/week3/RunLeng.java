package coderbyte.week3;

public class RunLeng {
	public static String runLength(String str) {
		//aaabbbbcccd
		int count = 1;
		String result = "";
		char oncekiCh = str.charAt(0);
		for(int i = 1; i < str.length(); i++) {
			char sonrakiCh = str.charAt(i);	
			if(sonrakiCh == oncekiCh) {
				count++;
			}
			else {
				result = result + count + oncekiCh;
				count = 1;
				oncekiCh = sonrakiCh;
			}
		}
		
		result = result + count + oncekiCh;
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(runLength("aaaabbc"));
	}
}

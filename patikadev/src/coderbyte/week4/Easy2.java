package coderbyte.week4;

public class Easy2 {
	public static boolean aBCheck(String str) {
		
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' && (i + 4) < str.length() && str.charAt(i + 4) =='b')
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(aBCheck("Laura sobs"));
	}
}

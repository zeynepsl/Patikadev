package java101.methods;

public class PalindromNumber {
	public static boolean isPalindrome(int x) {
		String temp = String.valueOf(Math.abs(x));// unsigned number
		String reverse = new StringBuilder(temp).reverse().toString();// reverseNumber

		try {
			long reverseNum = Long.parseLong(reverse);
			if (reverseNum == x)
				return true;
			return false;
		} catch (Exception e) {
			return false;
		}
	}
	
	//en iyisi: (kaynak: leetcode) :)
	public static boolean isPalindromeNum(int x) {
	    if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    }
	    return (x==rev || x==rev/10);
	}
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(-123321));
	}

}

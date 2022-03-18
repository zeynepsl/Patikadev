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
	
	//cok iyi:
	public static boolean isPalindromeNumber(int num) {
		int temp = num, reverseNumber = 0, lastNum = 0;
		
		while(temp != 0) {
			lastNum = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNum;
			temp /= 10;
		}
		
		return reverseNumber == num;
	}
	
	//cok iyi: sayinin yarisina bakiyor :)
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
		System.out.println(isPalindromeNumber(-123321));
	}

}

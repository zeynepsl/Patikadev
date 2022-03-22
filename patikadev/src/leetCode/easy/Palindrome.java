package leetCode.easy;

public class Palindrome {
	 public static boolean isPalindrome(String s) {
	        //char[] arr = s.toLowerCase().toCharArray();
	        StringBuilder res = new StringBuilder();
	        for(int i = 0; i < s.length(); i++){
	            char c = s.charAt(i);
	            if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')){
	                res.append(c);
	            }
	            else if(c >= 'A' && c <= 'Z'){
	                c = (char)(c - 'A' + 'a');
	                res.append(c);
	            }
	        }
	        
	        String str = res.toString();
	        String reverseStr = new StringBuilder(str).reverse().toString();
	        return str.equals(reverseStr);
	        
	    }
    
    public static void main(String[] args) {
	    System.out.println(isPalindrome("0P"));
	}
}

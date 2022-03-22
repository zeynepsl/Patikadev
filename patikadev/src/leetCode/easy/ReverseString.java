package leetCode.easy;

public class ReverseString {
	public void reverseString(char[] s) {
		
		String num = "0jjj";
        num.replaceAll("0", "");
        
        long number = Long.parseLong(num);
        
        if((num.charAt(num.length()-1)) == '-'){
            number *= -1;
        }
		
        int n = s.length;
        int endPointer = 0;
        for(int i = 0; i < (n / 2); i++){
            //swap(s, i, n-1-i);
            endPointer = n-1-i;
            char temp = s[i];
            s[i] = s[endPointer];
            s[endPointer] = temp;
        }
    }
	
	public void reverse(char[] str) {
	    int i = 0, j = str.length - 1;
	    while (i < j) {
	        swap(str, i, j);
	        i++;
	        j--;
	    }
	}*/
    
    /*public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }*/
}

package leetCode.medium;

public class ReverseInt {
	 public int reverse(int x) {
	        String s = new StringBuilder(String.valueOf(Math.abs(x))).reverse().toString();
	        //long num = Long.parseLong(s);
	        
	        try{
	            return (x < 0) ? Integer.parseInt(s) * -1 : Integer.parseInt(s);
	        }
	        catch(Exception e){
	            return 0;
	        }
	        
	        
	        /*
	          public int reverse(int x) {
	        long res = 0;
	        while (x != 0) {
	            res = res * 10 + x % 10;
	            x = x / 10;
	        }
	        
	        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
	            return 0;
	        } else {
	            return (int)res;
	        }
	    }
	        */
	        
	        /*if(num < Integer.MAX_VALUE || num > Integer.MIN_VALUE){
	            n = (int) num;
	            if(x < 0){
	                n *= -1;
	            }
	        }
	        
	        return n;*/
	        
	    }
}

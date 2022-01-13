package newThings;

public class GFG {
	
	/* public static int countWays(int n)
	    {
	        int[] res = new int[n + 1];
	        res[0] = 1;
	        res[1] = 1;
	        res[2] = 2;
	 
	        for (int i = 3; i <= n; i++)
	            res[i] = res[i - 1] + res[i - 2] + res[i - 3];
	 
	        return res[n];
	    }
	 
	    // Driver function
	    public static void main(String argc[])
	    {
	        int n = 4;
	        System.out.println(countWays(n));
	    }*/
	    
	    
	    
	    static int countWays(int n)
	    {
	         
	        // Declaring three variables
	        // and holding the ways
	        // for first three stairs
	        int a = 1, b = 2, c = 4;
	                                  
	        // Fourth variable                        
	        int d = 0;
	        if (n == 0 || n == 1 || n == 2)
	            return n;
	        if (n == 3)
	            return c;
	     
	        for(int i = 4; i <= n; i++)
	        {
	            // Starting from 4 as
	            // already counted for 3 stairs
	            d = c + b + a;
	            a = b;
	            b = c;
	            c = d;
	        }
	        return d;
	    }
	     
	    // Driver code
	    public static void main(String[] args)
	    {
	        int n = 3;
	         
	        System.out.println(countWays(n));
	    }
}

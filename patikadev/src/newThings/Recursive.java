package newThings;

public class Recursive {
	//Aþaðýdaki kod, toplama ve özyinelemeyi birleþtirerek iki sayýnýn katýný üretir:
	// Toplama iþlemini kullanarak 'n'yi 'k' ile çarpalým:
		private static int nTimesK(int n, int k) {
		    System.out.println("n: " + n);
		    
		    //tekrar eden algoritma:
		    //Bir durumu yapan algoritma(bunu bir sürü kez yazmýyorum bir kere yazýyorum):
		    //henüz sonda deðiliz
		    //KEEP GOING
		    // Recursive Case
		    
		    if(n > 1) { 
		        return k + nTimesK(n - 1, k);
		    }
		    
		  //algoritmamýzý tekrar etmeyi durdurduðumuzda:
		    //temel durum sonda olduðumuz anlamýna gelir
		    //WHERE ARE THE END
		    // Base Case n = 1
		    else { 
		        return k;
		    }
		}
		
		
		// f(f(f(a))) --- a = 20
	    // f(a) = 5 + a
	    // f(20) = 5 + 20 = 25
	    
	    // f(f(f(20))) --- f(f(25))
	    
	    // f(25) = 5 + 25 = 30
	    
	    // f(f(f(20))) --- f(f(25)) ---- f(30)
	    
	    // f(30) = 5 + 30 = 35
	    
	    // f(f(f(20))) --- f(f(25)) ---- f(30) --- 35
	    
	    
	    // 5+4+3+2+1+0; 7+6+5+4+3+2+1+0; 1; 2+1+0
	    
	    // 3 + 2 + 1
	    public static int summation(int n) {
	        // Base Case: WE ARE AT THE END
	        if (n <= 0) {
	            return 0; // additive identity property
	            //sona geldiðimzde 1 ile toplayacaðýz
	        } 
	        
	        // Recursive Case: KEEP GOING
	        //temel durumda deðilsek bunu yapmak zorundayýz
	        else {
	            // 3 + Summation(2)
	            // 3 + 2 + Summation(1)
	            // 3 + 2 + 1 + Summation(0)
	            // 3 + 2 + 1 + 0 = 6
	            return n + summation(n-1);
	        }
	        //temel durum, gerçekleþtirilen özyinelemeli iþleme baðlýdýr
	    }
		public static void main(String[] args) {
		    int result = nTimesK(4, 4);
		    System.out.println("Result: " + result);
		    System.out.println(summation(3));
		}
		/*
		n: 4
		n: 3
		n: 2
		n: 1
		Result: 16*/
	

}

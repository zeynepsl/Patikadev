package java101.methods;

public class RecursiveTutorial {
	
	        static int basamaklarToplami(int sayi){
	            if (sayi == 0){
	                return 0;
	            }else
	               return sayi % 10 + basamaklarToplami(sayi / 10);
	        }
	        public static void main(String[] args){
	      		  System.out.println("Basamak toplami: "+basamaklarToplami(45612));
	        }
	    
	        static int as(int i) {
	            if (i < 2) return 1;
	            else return (i * as(i - 1));
	        }
	        
	        //4 --> 3,2,1,
	        static void recursiveMethod(int num) {
	            num--;
	            if (num == 0)
	                return;
	            System.out.print(num + ",");
	            recursiveMethod(num);
	        }
}

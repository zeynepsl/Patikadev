package coderbyte.week8;

public class MyMedium {
	//incorrect 4 case
	//Burada 2 tane for dongsu kullandýgým ýcýn 5 ve 3 un ortak katlarýný 2 defa saymýs oldum
	//bu da yanlýs
	public static int ThreeFiveMultiples(int num) {
	    // code goes here  
	    int sum = 0;
	    
	    for(int i = 3; i < num; i+=3){
	       sum += i;
	    }

	    for(int i = 5; i < num; i+=5){
	       sum += i;
	    }
	    

	    return sum;
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    System.out.print(ThreeFiveMultiples(17)); 
	  }
	  //3 6 9 12 15 --> 45
	  //5 10 15 --> 30
	  //sum--> 75
	  
	  
	  //correct --> 60

}

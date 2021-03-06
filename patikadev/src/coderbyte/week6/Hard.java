package coderbyte.week6;

import java.util.Scanner;

public class Hard {
	//num--> merdiven basamak say?s?
	//1 veya 2 ad?m atarak merdiven ??k?labiliyor
	//basamk say?s? verilen merdivene ait ka? farkl? ad?m kombinasyonlar?yla ??k?l?r
	//bu kombinasyonlar?n toplam?n? bulun
	
	public static int StepWalking(int num) {
		
	    if(num >= 1 && num <= 1000){
	      int[] res = new int[num+1];
	      res[0]=1;
	      res[1]=1;    
	      for(int i = 2; i <= num; i++){
	        res[i] = res[i-1] + res[i-2];//Her i indeksi i?in, i. pozisyonun bilgisayar de?eri dp[i] = dp[i-1] + dp[i-2] ?eklindedir.
	      }
	      return res[num];//dp[n] de?erini, n'inci ad?ma ula?ma yollar?n?n say?s? olarak yazd?r?n.
	    } 
	    return 1;
	  }

	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(StepWalking(s.nextInt())); 
	  }
}

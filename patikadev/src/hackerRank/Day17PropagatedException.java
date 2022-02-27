package hackerRank;

import java.util.Scanner;

public class Day17PropagatedException {
	/*
	 * Bir istisna, onu atan metod taraf�ndan yakalanmazsa, program�n kontrol�
	 * �a��ran metoda geri aktar�l�r ( yay�l�r ) (yani: istisnay� atan metodun ad�
	 * ne olursa olsun). 
	 * Bu, program�n�z� istisnalar� y�ksek d�zeyde ele alacak
	 * �ekilde tasarlad�ysan�z iyi olabilir, ancak istisnan�n yay�ld��� �a�r�
	 * y�ntemlerinde istisnay� yakalamak i�in hi�bir zaman kod yazmazsan�z k�t�
	 * olabilir. 
	 * A�a��daki �rnek y�ntem, bir catch blo�unun onu yakalad��� ve bir
	 * mesaj yazd�rd��� , �a��rma y�ntemine ( main ) yay�lan Exception t�r�nde bir
	 * istisna atar :
	 * 
	 */
	
	void example() throws Exception {
		throw new Exception("Bu istisna her zaman at�lacak.");
	}

	public static void main(String[] args) {
		Day17PropagatedException p = new Day17PropagatedException();
		try {
			p.example();
		} catch (Exception e) {
			System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
			// Exception: Bu istisna her zaman at�lacak.
		}
		
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p1 = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p1);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
		
	}

}

class Calculator{
    public int power(int n, int p)throws Exception{
        if(n < 0 || p < 0){
            throw new Exception("n and p should be non-negative");
        }
        else{
            int res = 1;
            for(int i = 1; i <= p; i++){
                res = res * n;
                }
            return res;
        }
        
    }
}

package hackerRank;

import java.util.Scanner;

public class Day17PropagatedException {
	/*
	 * Bir istisna, onu atan metod tarafýndan yakalanmazsa, programýn kontrolü
	 * çaðýran metoda geri aktarýlýr ( yayýlýr ) (yani: istisnayý atan metodun adý
	 * ne olursa olsun). 
	 * Bu, programýnýzý istisnalarý yüksek düzeyde ele alacak
	 * þekilde tasarladýysanýz iyi olabilir, ancak istisnanýn yayýldýðý çaðrý
	 * yöntemlerinde istisnayý yakalamak için hiçbir zaman kod yazmazsanýz kötü
	 * olabilir. 
	 * Aþaðýdaki örnek yöntem, bir catch bloðunun onu yakaladýðý ve bir
	 * mesaj yazdýrdýðý , çaðýrma yöntemine ( main ) yayýlan Exception türünde bir
	 * istisna atar :
	 * 
	 */
	
	void example() throws Exception {
		throw new Exception("Bu istisna her zaman atýlacak.");
	}

	public static void main(String[] args) {
		Day17PropagatedException p = new Day17PropagatedException();
		try {
			p.example();
		} catch (Exception e) {
			System.err.println(e.getClass().getSimpleName() + ": " + e.getMessage());
			// Exception: Bu istisna her zaman atýlacak.
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

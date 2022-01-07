package coderbyte.week2;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Medium {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.out.println("merhaba");
		Scanner s = new Scanner(System.in);
		//String sonuc = FormattedDivision(s.nextInt(), s.nextInt());
		//System.out.println(sonuc);
		
		int a = s.nextInt();
		int b = s.nextInt();
		
		int yourScale = 10;
	}

	@SuppressWarnings("deprecation")
	public static String FormattedDivision(int num1, int num2) {
		double sonuc = (double) num1 / num2;
		DecimalFormat df = new DecimalFormat("000,000,000.0000");
		df.format(sonuc);
		
		int yourScale = 10;
        System.out.println(BigDecimal.valueOf(0.42344534534553453453-0.42324534524553453453).
        		setScale(yourScale, BigDecimal.ROUND_HALF_UP));
  
		
		//(double)Math.round(sonuc * 100000d) / 100000d;
		return df.format(sonuc);
	}
}

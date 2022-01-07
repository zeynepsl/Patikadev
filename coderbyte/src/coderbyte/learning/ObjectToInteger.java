package coderbyte.learning;


public class ObjectToInteger {
	public static void main(String[] args) {
		
		/*
		SENARYO 1:
		Ne tür bir nesneye sahip olduðundan emin ol
		nesnen Object ise, basit yol:
		 */
		Object myObj = new Object();	
		int x = (Integer)myObj;		
		
		//----------
		String s = "1";
		Object yourObject = Integer.valueOf( s );
		//----------
		
		/*
		SENARYO 2: 
		Java'da herhangi bir sayýsal nesne; Integer, Long, BigInteger vb;
		intValue adýnda bir yöntemi olan Number interface ini implemente eder
		Sayýsal yönü olan diðer özel türler de Number ý implemente etmelidir
		(örneðin: Age implements Number). Böylece:
		*/	
		int y = ((Number)myObj).intValue();
		
		/*
		SENARYO 3: 
		sayýsal metni ayrýþtýrma:
		Komut satýrýndan (veya metin alanýndan vb.) kullanýcý girdisini kabul ettiðinizde(String olarak): 
		*/
		String input = "aaa";
		int z = Integer.parseInt(input);

		//input baþka bir türe sahipse: input.toString() : 
		int a = Integer.parseInt(input.toString());
		

	}
}

package coderbyte.learning;


public class ObjectToInteger {
	public static void main(String[] args) {
		
		/*
		SENARYO 1:
		Ne t�r bir nesneye sahip oldu�undan emin ol
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
		Java'da herhangi bir say�sal nesne; Integer, Long, BigInteger vb;
		intValue ad�nda bir y�ntemi olan Number interface ini implemente eder
		Say�sal y�n� olan di�er �zel t�rler de Number � implemente etmelidir
		(�rne�in: Age implements Number). B�ylece:
		*/	
		int y = ((Number)myObj).intValue();
		
		/*
		SENARYO 3: 
		say�sal metni ayr��t�rma:
		Komut sat�r�ndan (veya metin alan�ndan vb.) kullan�c� girdisini kabul etti�inizde(String olarak): 
		*/
		String input = "aaa";
		int z = Integer.parseInt(input);

		//input ba�ka bir t�re sahipse: input.toString() : 
		int a = Integer.parseInt(input.toString());
		

	}
}

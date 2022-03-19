package hackerRank.java;

import java.util.Scanner;

public class WhatIsNextLine {
	public static void main(String[] args) {
		/*input: 
		 42 
		 3.1415 
		 Welcome to HackerRank's Java tutorials!
		 */
		Scanner s = new Scanner(System.in);
		int intV = s.nextInt();
		double doubleV = s.nextDouble();
		String strV = s.nextLine();//Su anda nextLine(), double degiskenin oldu�u sat�rda, 
		//double'dan sonra geri kalan� okuyor, e geri kalanda da bir sey yok :) sonuc 24. satir gibi cikiyor
		//sonraki satira konumlanabilmek icin, " s.nextLine() " diyecegiz (ki sonraki satira gecelim)
        //s.nextLine() deyip de konumlandigimiz o sonraki satirin geri kalaninin hepsini okumak icin de: " strV = s.nextLine() " diyecegiz
		
		System.out.println("String: " + strV);
		System.out.println("Double: " + doubleV);
		System.out.println("Int: " + intV);
		/*output: 
		 String: 
		 Double: 3.1415 
		 Int: 42
		 */

		/*Java.util.Scanner s�n�f�n�n nextLine() metodu;
Bu metot, ge�erli sat�r�n geri kalan�n� yazd�r�r(bir sat�r ay�r�c� s�n�rlay�c� bulana kadar)
ve Konum, bir sonraki sat�r�n ba�lang�c�na ayarlan�r. 
Bir sat�r ay�r�c� s�n�rlay�c� bulana kadar ge�erli konumdan tarama yapar. Y�ntem, String i ge�erli konumdan sat�r�n sonuna kadar d�nd�r�r.

yani String'i okuyabilmek icin 15. satira s.nextLine() eklemeliyiz (ki double degiskeninin oldu�u sat�rdan ��kal�m asagi ki satira inelim 
 
		 */
	}
}

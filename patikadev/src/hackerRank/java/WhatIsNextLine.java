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
		String strV = s.nextLine();//Su anda nextLine(), double degiskenin olduðu satýrda, 
		//double'dan sonra geri kalaný okuyor, e geri kalanda da bir sey yok :) sonuc 24. satir gibi cikiyor
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

		/*Java.util.Scanner sýnýfýnýn nextLine() metodu;
Bu metot, geçerli satýrýn geri kalanýný yazdýrýr(bir satýr ayýrýcý sýnýrlayýcý bulana kadar)
ve Konum, bir sonraki satýrýn baþlangýcýna ayarlanýr. 
Bir satýr ayýrýcý sýnýrlayýcý bulana kadar geçerli konumdan tarama yapar. Yöntem, String i geçerli konumdan satýrýn sonuna kadar döndürür.

yani String'i okuyabilmek icin 15. satira s.nextLine() eklemeliyiz (ki double degiskeninin olduðu satýrdan çýkalým asagi ki satira inelim 
 
		 */
	}
}

package newThings;

import java.util.HashMap;

public class LearnHashMap {
	public static void main(String[] args) {
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    System.out.println(capitalCities);
	
	    capitalCities.get("England");//Bir ��eye Eri�im (anahtarla)
	    
	    capitalCities.remove("England");//bir ��eyi kald�r (anahtarla)

	    capitalCities.clear();//T�m ��eleri kald�rmak i�in
	    
	    capitalCities.size();//boyutu dondurur
	    
	    /*HashMap �zerinden D�ng�
	    Bir for-each d�ng�s� ile HashMap ��eleri aras�nda dola��n.
	    Not: Yaln�zca anahtarlar� istiyorsan�z keySet() y�ntemini kullan�n 
	         yaln�zca value de�erleri istiyorsan�z values y�ntemi kullan�n:*/

	    // Print keys
	    for (String i : capitalCities.keySet()) {
	      System.out.println(i);
	    }

	    // Print values
	    for (String i : capitalCities.values()) {
	      System.out.println(i);
 	    }
	    
	 // Print keys and values
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
	    
	    /*Java Sar�c� S�n�flar�
	     * Wrapper s�n�flar�, ilkel veri t�rlerini (int , boolean, vb.) nesne olarak kullanman�n bir yolunu sa�lar .*/
	    
	    /*Di�er �e�itler
	    HashMap'teki anahtarlar ve de�erler asl�nda nesnelerdir. Yukar�daki �rneklerde "String" t�r�nden nesneler kulland�k. 
	    Java'daki bir String'in bir nesne oldu�unu (ilkel bir t�r de�il) unutmay�n.
	     int gibi di�er t�rleri kullanmak i�in e�de�er bir sarmalay�c� s�n�f� belirtmelisiniz : Integer. 
	     Di�er ilkel t�rler i�in �unu kullan�n: 
	     int i�in: Integer
	     boolean i�in: Boolean,
	     char i�in: Character, 
	     double i�in: Double vb:

	    �rnek
	    Anahtarlar� ve de�erleri depolayacak ki�iler ad�nda bir HashMapnesne olu�turun :String Integer*/


	        // Create a HashMap object called people
	        HashMap<String, Integer> people = new HashMap<String, Integer>();

	        // Add keys and values (Name, Age)
	        people.put("John", 32);
	        people.put("Steve", 30);
	        people.put("Angie", 33);

	        for (String i : people.keySet()) {
	          System.out.println("key: " + i + " value: " + people.get(i));
	        }
	      }
	    }

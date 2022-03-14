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
	
	    capitalCities.get("England");//Bir Öðeye Eriþim (anahtarla)
	    
	    capitalCities.remove("England");//bir öðeyi kaldýr (anahtarla)

	    capitalCities.clear();//Tüm öðeleri kaldýrmak için
	    
	    capitalCities.size();//boyutu dondurur
	    
	    /*HashMap Üzerinden Döngü
	    Bir for-each döngüsü ile HashMap öðeleri arasýnda dolaþýn.
	    Not: Yalnýzca anahtarlarý istiyorsanýz keySet() yöntemini kullanýn 
	         yalnýzca value deðerleri istiyorsanýz values yöntemi kullanýn:*/

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
	    
	    /*Java Sarýcý Sýnýflarý
	     * Wrapper sýnýflarý, ilkel veri türlerini (int , boolean, vb.) nesne olarak kullanmanýn bir yolunu saðlar .*/
	    
	    /*Diðer çeþitler
	    HashMap'teki anahtarlar ve deðerler aslýnda nesnelerdir. Yukarýdaki örneklerde "String" türünden nesneler kullandýk. 
	    Java'daki bir String'in bir nesne olduðunu (ilkel bir tür deðil) unutmayýn.
	     int gibi diðer türleri kullanmak için eþdeðer bir sarmalayýcý sýnýfý belirtmelisiniz : Integer. 
	     Diðer ilkel türler için þunu kullanýn: 
	     int için: Integer
	     boolean için: Boolean,
	     char için: Character, 
	     double için: Double vb:

	    Örnek
	    Anahtarlarý ve deðerleri depolayacak kiþiler adýnda bir HashMapnesne oluþturun :String Integer*/


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

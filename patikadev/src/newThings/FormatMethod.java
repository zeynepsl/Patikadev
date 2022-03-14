package newThings;

public class FormatMethod {
	// MAin driver method
    public static void main(String args[])
    {
        // Custom input string to be formatted
        String str = "GeeksforGeeks";
  

     // Ýki stringin birleþtirilmesi
        String s = String.format("My Company name is %s", str);//My Company name is GeeksforGeeks
  
     // Çýktý 8 ondalýk basamaða kadar verilir
        String str2 = String.format("My answer is %.8f", 47.65734);//My answer is 47,65734000
        

     // Burada cevabýn %15.8f olmasý gerekiyor" ve
             // "47.65734000" 15 boþluk var
        String str3 = String.format("My answer is %15.8f",47.65734);//My answer is     47,65734000
  
        // Print and display strings
        System.out.println(s);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(String.format("%,.4f", 47.65734));//47,6573
        /**/
        
     // Custom input string to be formatted
        String str12 = "GFG";
        String str13 = "GeeksforGeeks";
  

     // %1$ ilk argümaný temsil ediyor
             // %2$ ikinci argümaný
        String str4 = String.format(
            "My Company name" + " is: %1$s, %1$s and %2$s", str12, str13);//My Company name is: GFG, GFG and GeeksforGeeks
  
        // Print and display the formatted string
        System.out.println(str4);
        
        
     // Custom integer number
        int num = 7044;
  

     // output: 3 sýfýr("000") + "7044",
             // toplam 7 basamak
        String str5 = String.format("%07d", num);//0007044
        //baþa oyle bir sýfýr ekle ki toplam rakam sayýsý  7 olsun
  
        // Print and display the formatted string
        System.out.println(str5);
    }
}

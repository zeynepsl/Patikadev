package newThings;

public class LearnStringBuilder {
	public static void main(String[] args) {
		
		// create a StringBuilder object
		// using StringBuilder() constructor
		StringBuilder newStr = new StringBuilder();

		//example: before--> "hello" after--> "helloGFG"
		newStr.append("GFG");

		// print string
		System.out.println("String = " + newStr.toString());//String = GFG

		// create a StringBuilder object
		// using StringBuilder(CharSequence) constructor
		StringBuilder str1 = new StringBuilder("AAAABBBCCCC");

		// print string
		System.out.println("String1 = " + str1.toString());//String1 = AAAABBBCCCC

		// create a StringBuilder object
		// using StringBuilder(capacity) constructor
		StringBuilder str2 = new StringBuilder(10);

		// print string
		System.out.println("String2 capacity = " + str2.capacity());//String2 capacity = 10

		// create a StringBuilder object
		// using StringBuilder(String) constructor
		StringBuilder str3 = new StringBuilder(str1.toString());//String3 = AAAABBBCCCC

		// print string
		System.out.println("String3 = " + str3.toString());
		
		//--------------------------------
		//Methods in Java StringBuilder:
		
		// create a StringBuilder object
        // with a String pass as parameter
        StringBuilder str
            = new StringBuilder("AAAABBBCCCC");
 
        // print string
        System.out.println("String = " + str.toString());//String = AAAABBBCCCC
 
        // reverse the string
        StringBuilder reverseStr = str.reverse();
 
        // print string
        System.out.println("Reverse String = " + reverseStr.toString());//Reverse String = CCCCBBBAAAA
 
        // Append ', '(44) to the String
        str.appendCodePoint(44);
 
        // Print the modified String
        System.out.println("Modified StringBuilder = " + str);//Modified StringBuilder = CCCCBBBAAAA,
 
        // get capacity
        int capacity = str.capacity();
 
        // print the result
        System.out.println("StringBuilder = " + str);//StringBuilder = CCCCBBBAAAA,
        System.out.println("Capacity of StringBuilder = " + capacity);//Capacity of StringBuilder = 27
	}
}

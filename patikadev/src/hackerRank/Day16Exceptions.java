package hackerRank;

import java.util.LinkedList;

public class Day16Exceptions {
	LinkedList<String> list;
    int[] intArray = new int[4];
    
    // For testing Null Pointer Exception
    Day16Exceptions(){
        this.list = null;
    }
    
    // For testing Index Out of Bounds
    Day16Exceptions(String str){
        this.list = new LinkedList<String>();
        list.add(str);
    }
    
    void exceptionDemo(int i, String str){
        
        try{
            // throws ArrayIndexOutOfBoundsException if index > intArray.length
            int myInt = intArray[i];
            
            // throws a NullPointerException if 'list' doesn't point to an actual list object
            list.indexOf(str);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println( "index sýnýrlarýn dýþýnda: " + e.getMessage() );
        }
        catch(NullPointerException e){
            System.err.println( "ah hayýr! Deðeri null olan bir nesne üzerinde iþlem yapmaya çalýþtýnýz!" );
        }
        finally{
            System.out.println("Bu, programýn yürütülmesini bitirip bitirmediðine bakýlmaksýzýn yazdýrýlýr.");
        }
        System.out.println("program yürütmeye devam edebildi!\\n");
    }
    
    public static void main(String[] args) {
        // creates a Day16Exceptions object whose 'list' instance variable points to null:
    	Day16Exceptions sNullList = new Day16Exceptions();
        // attempt to access an element of the null list, throws Exception
        sNullList.exceptionDemo(1, "x");//ah hayýr! Deðeri null olan bir nesne üzerinde iþlem yapmaya çalýþtýnýz!
        
        // creates a Day16Exceptions object whose 'list' instance variable points to a list containing 1 element ("x"):
        Day16Exceptions sNotNullList = new Day16Exceptions("x");
        // attempt to access an invalid index of 'intArray' instance variable, throws Exception
        sNotNullList.exceptionDemo(100, "x");//index sýnýrlarýn dýþýnda: Index 100 out of bounds for length 4
    }
}

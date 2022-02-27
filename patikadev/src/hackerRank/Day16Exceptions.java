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
            System.err.println( "index s�n�rlar�n d���nda: " + e.getMessage() );
        }
        catch(NullPointerException e){
            System.err.println( "ah hay�r! De�eri null olan bir nesne �zerinde i�lem yapmaya �al��t�n�z!" );
        }
        finally{
            System.out.println("Bu, program�n y�r�t�lmesini bitirip bitirmedi�ine bak�lmaks�z�n yazd�r�l�r.");
        }
        System.out.println("program y�r�tmeye devam edebildi!\\n");
    }
    
    public static void main(String[] args) {
        // creates a Day16Exceptions object whose 'list' instance variable points to null:
    	Day16Exceptions sNullList = new Day16Exceptions();
        // attempt to access an element of the null list, throws Exception
        sNullList.exceptionDemo(1, "x");//ah hay�r! De�eri null olan bir nesne �zerinde i�lem yapmaya �al��t�n�z!
        
        // creates a Day16Exceptions object whose 'list' instance variable points to a list containing 1 element ("x"):
        Day16Exceptions sNotNullList = new Day16Exceptions("x");
        // attempt to access an invalid index of 'intArray' instance variable, throws Exception
        sNotNullList.exceptionDemo(100, "x");//index s�n�rlar�n d���nda: Index 100 out of bounds for length 4
    }
}

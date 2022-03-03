package coderbyte.week5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MySudoku {
	public static String SudokuQuadrantChecker(String[] strArr) {
	    // code goes here  
	    List<ArrayList<String>> sudoku = new ArrayList<ArrayList<String>>();
	

	    Set<Integer> errorQuadrants = new HashSet<Integer>();

	    for(int i = 0; i < 9; i++){
	      String[] s = strArr[i].replace("(", "").replace(")", "").split(",");
	      ArrayList<String> str = new ArrayList<String>(Arrays.asList(s));
	      sudoku.add(str);
	    }
	    
	    for(int row = 0; row < 9; row++){
	      for(int col = 0; col < 9; col++){
	  
	        if(!sudoku.get(row).get(col).equals("x")){
	          //o satýrýn her bir sutununda þu anki karaktere eþit bir karakter var mý?
	           for(int otherRow = 0; otherRow < 9; otherRow++){
	             if(otherRow != col){
	               if(sudoku.get(row).get(col).equals(sudoku.get(row).get(otherRow))){
	            	   errorQuadrants.add(detectQuadrant(row, otherRow));
	                   errorQuadrants.add(detectQuadrant(row, col));
	               }
	             }
	           }

	           for(int otherCol = 0; otherCol < 9; otherCol++){
	             if(otherCol != row){
	               if(sudoku.get(row).get(col).equals(sudoku.get(otherCol).get(col))){
	                 errorQuadrants.add(detectQuadrant(row, col));
	                 errorQuadrants.add(detectQuadrant(otherCol, col));
	               }
	             }
	           }
	        }
	        
	      }
	    }

	    String res = "";
	    for(int i : errorQuadrants) {
	    	res += String.valueOf(i);
	    }
	    String.join(res, ",");
	    return res;
	  }

	  public static int detectQuadrant(int row, int col){
	    if(row <= 2 && col <= 2) return 1;
	    else if(row <= 2 && col <= 5) return 2;
	    else if(row <= 2 && col <= 8) return 3;

	    else if(row <= 5 && col <= 2) return 4; 
	    else if(row <= 5 && col <= 5) return 5;
	    else if(row <= 5 && col <= 8) return 6;

	    else if(row <= 8 && col <= 2) return 7;
	    else if(row <= 8 && col <= 5) return 8;
	    else return 9;
	  }
	  
	  public static void main(String[] args) {
		  
		  String[] arr = {
				  "(1,2,3,4,5,6,7,8,9)","(x,x,x,x,x,x,x,x,x)","(6,x,5,x,3,x,x,4,x )",
				  "(2,x,1,1,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)",
				  "(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,9)"};

		System.out.println(SudokuQuadrantChecker(arr));
	}
}

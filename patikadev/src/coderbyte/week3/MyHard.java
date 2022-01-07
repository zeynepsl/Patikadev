package coderbyte.week3;

import java.util.ArrayList;
import java.util.Arrays;


public class MyHard {

	public static String TransitivityRelations(String[] strArr) {
	    /*   String[][] str2d = new String[uzunluk][];
	    char[][] char2d = new char[uzunluk][];
	    boolean[][] boolean2d = new boolean[char2d.length][];*/
	 
	    ArrayList<ArrayList<String>> karakterler = new ArrayList<ArrayList<String>>();

	    for(int i=0; i< strArr.length; i++){
	      karakterler.add(new ArrayList<String>(Arrays.asList(strArr[i].split(","))));
	    }
	    
	    for(int i=0; i < karakterler.size(); i++){
	      for(int j=0; j < karakterler.size(); j++){
	        if(karakterler.get(i).get(j) == "1"){
	          for(int k =0; k < karakterler.size(); k++){
	            if(karakterler.get(j).get(k) == "1" && karakterler.get(i).get(k) != "1"){
	              return "not transitive";
	            }
	          }
	        }
	      }
	    }
	    return "transitive";
	    /*
	    for(int i=0; i<uzunluk; i++){
	      char2d[i] = strArr[i].toCharArray();//char2d[0]; --> (1,1,1)
	    }
	    for(int i=0; i<uzunluk; i++){
	      boolean2d[i] = new boolean[uzunluk];
	    }

	    for(int i=0; i<char2d.length; i++){
	      for(int j=0; j< char2d[0].length; j++){
	        if(char2d[i][j] == '1'){
	          boolean2d[i][j] = true;
	        }
	        else{
	          boolean2d[i][j] = false;
	        }
	      }
	    }*/
	  }
	public static void main(String[] args) {
		String[] strArr = new String[] {"1,1,1","0,0,1","1,0,1"};
		System.out.println(TransitivityRelations(strArr));
	}
}

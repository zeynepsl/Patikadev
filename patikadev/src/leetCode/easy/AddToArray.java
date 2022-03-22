package leetCode.easy;

import java.util.*;

public class AddToArray {
	public static List<Integer> addToArrayForm(int[] num, int k) {
        //num ý stringe ekle
        //stringten sayýya çevir
        //oluþan sayýyý k ile topla
        
        String strNum = "";
        for(int i : num)
            strNum += "" + String.valueOf(i);
        
        int intNum = Integer.valueOf(strNum);
        intNum += k;
        
        
        List<Integer> list = new ArrayList<Integer>();
       // strNum = String.valueOf(intNum);
        
        while(intNum > 0) {
        	int kalan = intNum % 10;
        	list.add(kalan);
        	intNum /= 10;
        }
        
        Collections.reverse(list);
       
        
      
        
        return list;
        /*int res = 0;
        for(int i = 0; i < num.length; i++){
            res *= 10;
            res += num[i];
        }
        res += k;
        
        List<Integer> list = new ArrayList<Integer>();
        
        while(res > 0){
            int remainder = res % 10;
            list.add(remainder);
            res /= 10;
        }
        
        Collections.reverse(list);
            
        return list;*/
    }
	public static void main(String[] args) {
		int[] arr = {9,9,9,9,9,9,9,9,9,9};
		//System.out.println(addToArrayForm(arr, 23));
		
		int sonuc = 0;
        for(int i = 0; i < arr.length; i++) {
        	sonuc *= 10;
        	sonuc += arr[i];
        }
        System.out.println(sonuc);
	}
}

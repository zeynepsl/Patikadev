package hackerRank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort1 {
	public static void insertionSort1(List<Integer> arr) {
        int numToCheck = 0, temp = 0;
        for(int i = 1; i < arr.size(); i++){
        	numToCheck = arr.get(i);
            for(int j = i-1; j >= 0; j--){
                if(arr.get(j) > numToCheck){
                    //temp = arr.get(j);
                    //arr.add(j, numToCheck);
                    arr.add(j+1, arr.get(j));
                }
                else break;
            }
        }
        System.out.print(arr);
    }
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int i = 5;
		while(i > 0) {
			list.add(i);
			i--;
		}
		insertionSort1(list);
		//System.out.println();
	}
}

package hackerRank.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumber {
	public static void closestNumbers(List<Integer> arr) {
        // Write your code here
        int minDiff = 0;
        Collections.sort(arr);

        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i) - arr.get(i-1) < minDiff)
                minDiff = arr.get(i) - arr.get(i-1);
        }
        System.out.println(arr);
        for(int i = 1; i < arr.size(); i++) {
        	int diff = arr.get(i) - arr.get(i-1);
        	if(diff == minDiff) {
        		System.out.println(arr.get(i) + " " + arr.get(i-1));
        	}
        }
        
    }
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(-7);
		arr.add(-2);
		arr.add(-3);
		arr.add(-5);
		closestNumbers(arr);
	}
}

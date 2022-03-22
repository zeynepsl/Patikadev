package leetCode.dataStructures;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.*/
	
	//23 ms, 50 mb:
	public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int count = 0;
        for(int n : nums){
        	System.out.println(n);
            if(myMap.get(n) == null)
            	myMap.put(n, 1);
            
            else
            	myMap.put(n, myMap.get(n)+1);
            System.out.println(myMap.values());
        }
        
        for(int v : myMap.values()) {
        	if(v > 1) count++;
        }
        System.out.println("count:" + count);
        	
        
        if(count > 1)
        	return true;
        
        return false;
    }
	
	//14 ms, 68 mb:
	public static boolean containsDuplicate2(int[] nums) {
		Set<Integer> distinctList = new HashSet<Integer>();
		for(int n : nums) {
			if(distinctList.contains(n))
				return true;
			distinctList.add(n);
		}
		return false;
	}
	
	//16 ms, 56 mb:
	public boolean containsDuplicate3(int[] nums) {
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
	
	//HashMap li alternatif cozum:
	public boolean containsDuplicate4(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                flag = true;
                //hm.put(nums[i],hm.get(nums[i])+1);
            }else{
                hm.put(nums[i],1);
            }
        }
        return flag;
    }
	
	public static void main(String[] args) {
		System.out.println(containsDuplicate(new int[] {1,2,2,1,1,3}));
		System.out.println(containsDuplicate2(new int[] {1,2,2,1,1,3}));

	}
}

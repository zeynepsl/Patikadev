package leetCode.easy;

public class SuperRotateArray {
	public static void reverse(int nums[], int i, int j){
        int li = i;
        int ri = j;
        
        while(li < ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            
            li++;
            ri--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length; // donus 101 ise 101 defa dondurmene gerek yok
        
        //k, mesela -1 olduðunda ve dizimizde 7 elemanlý ise
        //rotate aslýnda step 6 ya esittir
        if(k < 0){ 
            k += nums.length;
        }
        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    
}

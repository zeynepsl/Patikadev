package leetCode.easy;

public class RotateArray {
	public static void rotate(int[] nums, int k) {
        int[] res = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int control = i + k;
            if(control <  nums.length){
                res[control] = nums[i];
            }
            else if (control >= nums.length){
                res[control - nums.length] = nums[i];
            }
        }
        for(int i : res) {
        	System.out.println(i);
        }
    }
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4,5,6,7};
		rotate(arr, 3);
	}
}

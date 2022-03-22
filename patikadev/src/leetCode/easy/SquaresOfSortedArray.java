package leetCode.easy;

public class SquaresOfSortedArray {
	public static int[] sortedSquares(int[] nums) {
		int low = 0;
		int high = nums.length-1;
		int[] ans = new int[nums.length];
		
		for(int i = nums.length-1; i >= 0; i--) {
			int v1 = nums[low];
			int v2 = nums[high];
			int sq1 = v1*v1;
			int sq2 = v2*v2;
			if(sq1 >= sq2) {
				ans[i] = sq1;
				low++;
			}
			else {
				ans[i] = sq2;
				high--;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {-4, -1, 0, 3, 10};
		System.out.println(sortedSquares(arr));
	}
}

/*acemi cozum:
 * public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int a = nums[i] * nums[i];
            squares[i] = a;
        }
        Arrays.sort(squares);
        return squares;
    }*/

package leetCode.easy;

public class SearchInsert {
	 public int searchInsert(int[] nums, int target) {
	        int start = 0;
	        int end = nums.length-1;
	        int mid = 0;
	        
	        while(start <= end){
	            mid =(start+end)/2;
	            if(nums[mid] == target){
	                return mid;
	            }
	            if(nums[mid] > target){
	                end = mid -1;
	            }
	            else{
	                start = mid +1;
	            }
	        }
	        return start;
	        //start > end oldu�unda, bu, hedefin dizide olmad��� anlam�na gelir,
	        // hedefin i�inde olmas� gereken indeksi d�nd�rmeliyiz.
	    // Hedefin {nums[end], hedef, nums[start]} i�inde olmas� gerekti�ini bildi�imiz i�in,
	    // indeks de�eri ba�lang�ca e�ittir.
	    }
}

/*public int searchInsert(int[] A, int target) {
        
        if(A.length == 0)return 0;
        
        int left = 0, right = A.length - 1;
        int mid = 0;
        
        while(left <= right){
            
            if(target<A[left])return left;
            if(target>A[right])return right+1;
            
            mid = (left+right)/2;
            
            if(A[mid]==target)return mid;
            else if(target < A[mid]){
                right = mid-1;
            }else{
                left = mid +1;
            }
            
        }
        return -1;
        
        
    }*/
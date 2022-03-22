package leetCode.programmingSkills;

public class CountOdd {
	/*1523. Count Odd Numbers in an Interval Range
Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).*/
	
	//858 ms:
    public int countOdds(int low, int high) {
        if(low % 2 == 0)
            low+=1;
        
        int count = 0;
        for(int i = low; i <= high; i+=2){
            count++;
        }
        return count;
    }
	
    
    //0 ms:
	int countOdds1(int low, int high) {
		// low: 5 high: 10
		int res = (high - low) / 2;
		if (low % 2 != 0 || high % 2 != 0)
			res++;
		return res;
	}
	/*public static int countOdds(int low, int high) {
		if(low%2 == 0)
			low += 1;
		if(high%2 == 0)
			high -= 1;
		return (high - low)/2 + 1;
	}*/
	

	//0 ms:
	public int countOdds2(int low, int high) {
		return (high + 1) / 2 - low / 2;
	}
	/*
	 * the count of odd numbers between 1 and low - 1 is ** low / 2 **   the count of odd
	 * numbers between 1 and high is ** (high + 1 ) / 2 **
	 */
}

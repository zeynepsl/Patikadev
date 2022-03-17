package algorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triangle {
	//https://github.com/zeynepsl/Patikadev/blob/master/patikadev/src/algorithms/Triangle.java
	
    public static int minimumTotal(List<List<Integer>> triangle) {
        int total = triangle.get(0).get(0);
        int firstIndex = 0, lastIndex = 1;
        
        for(List<Integer> list : triangle) {
        	if(list.size() == 1) {
        		continue;
        	}
        	
        	if(list.get(firstIndex) > list.get(lastIndex) && !isPrime(list.get(firstIndex))) {
        		total += list.get(firstIndex);
        	}
        	else {
        		total += list.get(lastIndex);
        		firstIndex = lastIndex;
        		lastIndex += 1;
        	}
        }
        
        return total;
    }
    
    public static boolean isPrime(int num) {
    	if(num == 1) {
    		return false;
    	}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;//num is not prime
			}
		}
		return true;//num is prime
	}
	
	public static void main(String[] args) {
		List<List<Integer>> arrList = new ArrayList<List<Integer>>();
	
		arrList.add(Arrays.asList(215));
		arrList.add(Arrays.asList(193,124));
		arrList.add(Arrays.asList(117,237,442));
		arrList.add(Arrays.asList(218,935,347,235));
		arrList.add(Arrays.asList(320,804,522,417,345));
		arrList.add(Arrays.asList(229,601,723,835,133,124));
		arrList.add(Arrays.asList(248,202,277,433,207,263,257));
		arrList.add(Arrays.asList(359,464,504,528,516,716,871,182));
		arrList.add(Arrays.asList(461,441,426,656,863,560,380,171,923));
		arrList.add(Arrays.asList(381,348,573,533,447,632,387,176,975,449));
		arrList.add(Arrays.asList(223,711,445,645,245,543,931,532,937,541,444));
		arrList.add(Arrays.asList(330,131,333,928,377,733,017,778,839,168,197,197));
		arrList.add(Arrays.asList(131,171,522,137,217,224,291,413,528,520,227,229,928));
		arrList.add(Arrays.asList(223,626,034,683,839,053,627,310,713,999,629,817,410,121));
		arrList.add(Arrays.asList(924,622,911,233,325,139,721,218,253,223,107,233,230,124,233));
		//output --> 7726
		
		/*arrList.add(Arrays.asList(1));
		arrList.add(Arrays.asList(8,4));
		arrList.add(Arrays.asList(2,6,9));
		arrList.add(Arrays.asList(8,5,9,3));*/
		//output --> 24
		
		System.out.println(minimumTotal(arrList));
		
	}
}

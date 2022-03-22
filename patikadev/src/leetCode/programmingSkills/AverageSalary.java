package leetCode.programmingSkills;

import java.util.Arrays;

public class AverageSalary {
	//3 ms: 
	public double average(int[] salary) {
	        int min = Arrays.stream(salary).min().getAsInt();
	        int max = Arrays.stream(salary).max().getAsInt();
	        double total = 0;
	        
	        for(int i = 0; i < salary.length; i++){
	            if(salary[i] == min || salary[i] == max)
	                continue;
	            total += salary[i];
	        }
	        return total/(salary.length - 2);
	 }
	
	//en iyisi: 0ms:
	public static double average2(int[] salary) {
        double sum = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int s : salary) {
            if(s < min) 
                min = s;
            if(s > max)
                max = s;
            sum += s;
            System.out.println("min: " + min + " - max: " + max + " - sum: " + sum);
        }
        return (sum - min - max) / (salary.length - 2);
    }
	
	public static void main(String[] args) {
		System.out.println(average2(new int[]{4,2,3,8}));
	}
	 
}

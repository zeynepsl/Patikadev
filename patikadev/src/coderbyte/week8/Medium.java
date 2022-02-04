package coderbyte.week8;

public class Medium {
	static int ThreeFiveMultiples(int num) {
        int sum = 0;
        
		for (int temp = 0; temp < num; temp++) {
			if (temp % 3 == 0)      sum += temp;
			else if (temp % 5 == 0) sum += temp;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(ThreeFiveMultiples(10));
	}


}

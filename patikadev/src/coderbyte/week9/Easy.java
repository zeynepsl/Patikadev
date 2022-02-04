package coderbyte.week9;

public class Easy {
	//powerset
	//verilen bir kümenin alt kume sayýsýný bulun--> 2^(kumeELemanSayisi)
	public static int powerSet(int[] arr) {
		int result = (int)Math.pow(2, arr.length);
		return result;
	}
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,3,4};
		System.out.println(powerSet(arr));
	}

}

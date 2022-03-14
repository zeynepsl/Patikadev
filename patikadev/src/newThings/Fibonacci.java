package newThings;

public class Fibonacci {
	public static int calculate(int[] arr) {
		int result = arr[0];
		for(int i = 1; i < arr.length; i++) {
			result = result + arr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr = new int[] { 1,2,3,4};
		System.out.println(calculate(arr));
	}
}

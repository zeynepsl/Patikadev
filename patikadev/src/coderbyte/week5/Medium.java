 package coderbyte.week5;

public class Medium {
	public static boolean primeNum(int num) {
		for(int i = 2; i < (num/2); i++) {
			if(num % i == 0)
				return false;//say� asal de�ildir
		}
		return true;//say� asald�r
	}
	public static void main(String[] args) {
		System.out.println(primeNum(10));
	}
}

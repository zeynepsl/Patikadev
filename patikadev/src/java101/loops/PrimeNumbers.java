package java101.loops;

public class PrimeNumbers {
	public static void main(String[] args) {
		for(int i = 1; i < 101; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(int num) {
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;//sayi asal degildir
			}
		}
		
		return true;
	}
}

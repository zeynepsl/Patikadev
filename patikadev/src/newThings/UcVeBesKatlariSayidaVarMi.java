package newThings;

public class UcVeBesKatlariSayidaVarMi {
	public static int katlariBul(int sayi) {
		int result = 0;
		for(int i = 3; i < sayi; i+=3) {
			result += i;
		}
		for(int i = 5; i < sayi; i+=5) {
			result += i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(katlariBul(10));
	}
}

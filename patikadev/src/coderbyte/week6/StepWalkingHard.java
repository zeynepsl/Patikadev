package coderbyte.week6;

public class StepWalkingHard {
	//n basamakli bir merdiveni 1 veya 2 adım atacak sekilde toplamda kac farkli sekilde cikabilirsiniz?
	public static int stepWalking(int n) {
		if(n == 1) return 1;
		if(n == 2) return 2;
		return stepWalking(n-1) + stepWalking(n-2);
	}
	public static void main(String[] args) {
		System.out.println(stepWalking(10));
	}
}

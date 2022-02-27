package hackerRank;

public class Day14ScopeTutorial {
	boolean b = true; // b1 tüm sınıfın kapsamına sahiptir
	int x = 88; // x1 tüm sınıfın kapsamına sahiptir
	
	Day14ScopeTutorial(){
	        double d = 9.0;
	        example(d);
	        classVariable();
	    }

	void example(double x) { //x2 parametresi bu yöntemin kapsamına sahiptir
		System.out.println("----- example(double x):\n" + "Initial value of Local Variable `x`: " + x + "\n");//Yerel Değişkenin başlangıç ​​değeri-->88

		x = 4.4; //yerel değişken x2'nin değerini yeniden ata

		System.out.println("New value of Local Variable `x`: " + x + "\n");//4.4

		for (int b = 0; b < 4; b++) { // b2 has scope of this loop
			int i = b + 4; // int i kapsamı başlatıldı
			System.out.println("For Loop 1 in example(double x):\n" + "Local Variable `b` (local to loop): " + b + "\n"
					+ "Local Variable `i` (local to loop): " + i + "\n" + "Local Variable `x` (method parameter): " + x
					+ "\n");
		} // end the scope of int b2; end scope of int i

		for (int b = 0; b < 4; b++) {
			x = b;
			System.out.println("For Loop 2 in example(double x):\n" + "Local Variable `b` (local to loop): " + b + "\n"
					+ "Local Variable `x` (method parameter): " + x + "\n");
		} // end of the scope of this version of int b

		System.out.println("Local Variable `x` after Loop 2: " + x + "\n");//3.0

	} // double x2 nin scope bitisi

	void classVariable() {
		System.out.println(
				"----- classVariable():\n" + "Instance Variable `b`: " + b + "\n" + "Instance Variable `x`: " + x);
	}

	public static void main(String[] args) {
		Day14ScopeTutorial s = new Day14ScopeTutorial();
	}
	// end of boolean b's scope; end of int x's scope
}

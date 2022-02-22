package java101;

public class Main {

	public static void main(String[] args) {
		/*byte a = 120;
		short b = 1000;
		int c = 100000;
		int integ = 109;
		long d = 10000000;

		float number1 = 3.14F;
		float number2 = 3.14f;

		double number3 = 3.14;
		char letter = 'u';
		boolean logic1 = true;
		boolean logic2 = false;
		String words = "Hello World";
		
		int str = (c == integ) ? (c*2)+10 : c/2;*/
		
		int gun = 7;
        switch (gun) {
            case 6:
                System.out.println("Bugün cumartesi");
                System.out.println("program bitti");
                
            case 7:
                System.out.println("Bugün pazar");
                
            default:
                System.out.println("Bugün hafta içi");
        }
        
        /*gun == 6 iken
         * Bugün cumartesi
program bitti
Bugün pazar
Bugün hafta içi

gun == 7 iken
Bugün pazar
Bugün hafta içi
*/

	}

}

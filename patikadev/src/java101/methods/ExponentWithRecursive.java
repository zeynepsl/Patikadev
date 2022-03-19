package java101.methods;

public class ExponentWithRecursive {
	public static double exponent(double base, int exp) {
		if(exp < 0){
            base = 1.0 / base;
            exp = Math.abs(exp);
        }
		if(exp == 1) return base;
		System.out.println("base: " + base + " - exp: " + exp);
		return exponent(base, exp-1) * base;
	}
	public static void main(String[] args) {
		System.out.println(exponent(2, -2));//0.25
		
		/*b
base: 2 - exp: 3
base: 2 - exp: 2
8

*/
	}
	
}

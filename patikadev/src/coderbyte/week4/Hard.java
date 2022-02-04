package coderbyte.week4;

import java.util.Scanner;

public class Hard {
	public static int Calculator(String str) {
		//Algoritma, yöntemleri ters sýrada çaðýrýr 
		//(parseExpression -> parseTerms -> parseFactor -> parseExpression (alt ifadeler için))

		Object obje = new Object() {
			int pos = -1, ch;

			void nextChar() {
				ch = (++pos < str.length()) ? str.charAt(pos) : -1;
			}

			boolean eat(int charToEat) {
				while (ch == ' ')
					nextChar();
				if (ch == charToEat) {
					nextChar();
					return true;
				}
				return false;
			}

			double parse() {
				nextChar();
				double x = parseExpression();
				if (pos < str.length())
					throw new RuntimeException("Unexpected: " + (char) ch);
				return x;
			}

			// toplama, çýkarma.
			double parseExpression() {
				double x = parseTerm();
				for (;;) {
					if (eat('+'))
						x += parseTerm();
					else if (eat('-'))
						x -= parseTerm();
					else
						return x;
				}
			}

			// çarpma, bölme
			double parseTerm() {
				double x = parseFactor();
				for (;;) {
					if (eat('*'))
						x *= parseFactor();
					else if (eat('/'))
						x /= parseFactor();
					else
						return x;
				}
			}

			// operatör iþareti | deðiþken deðerlendirme | iþlev çaðrýsý | parantez (alt
			// ifadeler);
			double parseFactor() {
				if (eat('+'))
					return parseFactor();
				if (eat('-'))
					return -parseFactor();

				double x;
				int startPos = this.pos;
				if (eat('(')) {
					x = parseExpression();
					eat(')');
				} else if ((ch >= '0' && ch <= '9') || ch == '.') {
					while ((ch >= '0' && ch <= '9') || ch == '.')
						nextChar();
					x = Double.parseDouble(str.substring(startPos, this.pos));
				} else if (ch >= 'a' && ch <= 'z') {
					while (ch >= 'a' && ch <= 'z')
						nextChar();
					String func = str.substring(startPos, this.pos);
					x = parseFactor();
					if (func.equals("sqrt"))
						x = Math.sqrt(x);
					else if (func.equals("sin"))
						x = Math.sin(Math.toRadians(x));
					else if (func.equals("cos"))
						x = Math.cos(Math.toRadians(x));
					else if (func.equals("tan"))
						x = Math.tan(Math.toRadians(x));
					else
						throw new RuntimeException("Unknown function: " + func);
				} else {
					throw new RuntimeException("Unexpected: " + (char) ch);
				}

				if (eat('^'))
					x = Math.pow(x, parseFactor());
				return x;

			}
		}.parse();
		int result = ((Number) obje).intValue();
		return result;

	}
	/*
	 * String str1 = obje.toString(); int result = Integer.parseInt(str1); return
	 * result;ScriptEngineManager manager = new ScriptEngineManager(); ScriptEngine
	 * engine = manager.getEngineByName("Javascript"); Object result =
	 * engine.eval(str); finalAnswer = result.toString();
	 * 
	 * return finalAnswer;
	 */

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		System.out.print(Calculator(s.nextLine()));
	}
	/*"(1+10)*3"
"5+3"
"50-12"

 parseFactor = 1. operatör iþareti | deðiþken deðerlendirme | iþlev çaðrýsý | parantez (alt ifadeler); 
2. üs alma; 
parseTerms = 3. çarpma, bölme; 
parseExpression = 4. toplama, çýkarma. 



Algoritma, yöntemleri ters sýrada çaðýrýr (parseExpression -> parseTerms -> parseFactor -> parseExpression (alt ifadeler için)), ancak ilk satýra giden her yöntem, yöntemi bir sonraki düzeye çaðýrýr, böylece tüm yürütme sýrasý yöntemleri aslýnda normal iþlem sýrasý.*/
}

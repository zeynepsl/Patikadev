package coderbyte.learning;

public class Parse {

    public static void main(String[] args) {
    	//static int parseInt(String s)
    	//static int parseInt(String s, int radix) radix--> sayı tabanı
    	
    	int x =Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.parseInt("444",16);
        
        System.out.println(x);//0
        System.out.println(c);//5.0
        System.out.println(b);//1092
	}
}

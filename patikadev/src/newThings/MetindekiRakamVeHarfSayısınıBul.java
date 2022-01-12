package newThings;

import java.util.Scanner;

public class MetindekiRakamVeHarfSayýsýnýBul {
	
	public static float extractNumberAndChar(String str) {
		StringBuilder rakamlar = new StringBuilder();
		StringBuilder harfler = new StringBuilder();
	    boolean foundR = false;
	    boolean foundH = false;
	    for(char c : str.toCharArray()){
	    	//karakter bir rakam ise true; aksi halde false döner:
	        if(Character.isDigit(c)){
	        	rakamlar.append(c);
	        	foundR = true;
	        } else if(foundR){
	            // If we already found a digit before and this char is not a digit, stop looping
	            break;                
	        }
	    }
	    
	    for(char c : str.toCharArray()){
	    	//karakter bir rakam ise true; aksi halde false döner:
	        if(!Character.isDigit(c)){
	        	harfler.append(c);
	        	foundH = true;
	        } else if(foundH){
	            // If we already found a digit before and this char is not a digit, stop looping
	            break;                
	        }
	    }
	    
	    int harfSayisi = harfler.toString().length();
	    int rakamSayisi = rakamlar.toString().length();
	    //burada harfSayisi ve rakamSayisi deðiþkenlerini float a çevirmezsek oran degiskeni --> 0.0 oluyor bu yüzden:
	    float oran = (float) rakamSayisi / (float) harfSayisi;
	    return oran;
	}
	
	
	public static double extractNumberAndChar2(String str) {
		int rakamSayisi = 0;
		int harfSayisi = 0;
		
		for (char c : str.toCharArray()) {
			// karakter bir rakam ise true; aksi halde false döner:
			if (Character.isDigit(c)) {
				++rakamSayisi;
			} else if(c != ' ') {
				++harfSayisi;
			}
		}
		double oran = (double) rakamSayisi / (double)  harfSayisi;
		return oran;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1 = "zeyn12";
		//System.out.println(extractNumberAndChar(str1));
		System.out.println(extractNumberAndChar2(str1));
	}

}

package java101;

import java.util.Scanner;

public class BurcBulanProgram {
	public static void main(String[] args) {
		int month, day;
		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		day = scanner.nextInt();
		String result = "hatali giris";
		
		if(month > 0 &&  month < 13) {
			if(month == 1 && day > 0 && day < 32) {
				if(day <= 21) {
					result = "oglak";
				}
				else {
					result = "kova";
				}
			}
			
			else if(month == 2 && day > 0 && day < 30) {
				if(day <= 19) {
					result = "kova";
				}
				else {
					result = "balık";
				}
			}
			
			else if(month == 3 && day > 0 && day < 32) {
				if(day <= 20) {
					result = "balık";
				}
				else {
					result = "koç";
				}
			}
			
			else if(month == 4 && day > 0 && day < 31) {
				if(day <= 20) {
					result = "koç";
				}
				else {
					result = "boğa";
				}
			}
			
			else if(month == 5 && day > 0 && day < 32) {
				if(day <= 20) {
					result = "boğa";
				}
				else {
					result = "ikizler";
				}
			}
			
			else if(month == 6) {
				if(day <= 22) {
					result = "ikizler";
				}
				else {
					result = "yengeç";
				}
			}
			
			else if(month == 7 && day > 0 && day < 32) {
				if(day <= 22) {
					result = "yengeç";
				}
				else {
					result = "aslan";
				}
			}
			
			else if(month == 8 && day > 0 && day < 32) {
				if(day <= 22) {
					result = "aslan";
				}
				else {
					result = "basak";
				}
			}
			
			else if(month == 9 & day > 0 && day < 31) {
				if(day <= 22) {
					result = "basak";
				}
				else {
					result = "terazi";
				}
			}
			
			else if(month == 10 && day > 0 && day < 32) {
				if(day <= 22) {
					result = "terazi";
				}
				else {
					result = "akrep";
				}
			}
			
			else if(month == 11 && day > 0 && day < 31) {
				if(day <= 21) {
					result = "akrep";
				}
				else {
					result = "yay";
				}
			}
			
			else if(month == 12 && day > 0 && day < 32) {
				if(day <= 21) {
					result = "yay";
				}
				else {
					result = "oğlak";
				}
			}
			
		}
	
		
		System.out.println(result);
		
		
	}
}

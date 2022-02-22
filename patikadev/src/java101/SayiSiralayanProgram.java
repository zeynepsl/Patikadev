package java101;

import java.util.ArrayList;
import java.util.List;

public class SayiSiralayanProgram {
	public static void main(String[] args) {
		int a = 3, b = 4, c = 6;
		
		if(a > b && a > c) {
			System.out.println("en buyuk a");
			if(b > c) {
				System.out.println("a > b > c");
			}
			else {
				System.out.println("a > c > b");
			}
		}
		else if(b > a && b > c) {
			System.out.println("en buyuk b");
			if(a > c) {
				System.out.println("b > a > c");
			}
			else {
				System.out.println("b > c > a");
			}
		}
		else {
			System.out.println("en buyuk c");
			if(a > b) {
				System.out.println("c > a > b");
			}
			else {
				System.out.println("c > b > a");
			}
		}
	}
}

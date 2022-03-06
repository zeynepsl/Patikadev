package java101.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;

		System.out.print("sayiyi girin: ");
		num = scanner.nextInt();
		
		String res = sayiArmstrongMu(num) ? "sayi armstrong bir sayidir" : "sayi armstrong deðildir";
		
		System.out.println(res);
	}
	
	public static List<Integer> basamakBul(int num) {
		List<Integer> nums = new ArrayList<Integer>();
		
		while (num > 0) {
			int kalan = num % 10;
			nums.add(kalan);
			num /= 10;
		}
		
		return nums;
	}
	
	public static boolean sayiArmstrongMu(int num) {
		List<Integer> nums = basamakBul(num);
		int basamakSayisi = nums.size();
		int total = 0;
		for(int i : nums) {
			 total += Exponenet.calculateExponent(i, basamakSayisi);//kendi yazdigim us alma islemi
			 //Math.pow(i, basamakSayisi)
		}
		
		if(total == num) {
			return true;
		}
		return false;
	}
	
}

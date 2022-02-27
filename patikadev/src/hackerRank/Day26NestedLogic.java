package hackerRank;

import java.util.Scanner;

public class Day26NestedLogic {
	public static void main(String[] args) {
		   Scanner s = new Scanner(System.in);
	        //Returned:
	        int day1 = s.nextInt();
	        int month1 = s.nextInt();
	        int year1 = s.nextInt();
	        
	        //due:
	        int day2 = s.nextInt();
	        int month2 = s.nextInt();
	        int year2 = s.nextInt();
	        
	        int dayDiff = day1 - day2;
	        int monthDiff = month1 - month2;
	        int yearDiff = year1 - year2;
	        
	        int hackOs = 0;
	        
	        
	        //&& yearDiff == 0
	        if(dayDiff > 0 && monthDiff == 0){
	            hackOs = 15 * (dayDiff);
	        }
	        else if(yearDiff == 0){
	            hackOs = 500 * (monthDiff);
	        }
	        else if(yearDiff > 0){
	            hackOs = 10000;
	        }
	        else{
	            hackOs = 0;
	        }
	        //5 10 2018 verdiðim
	        //1 10 2015 iade tarihi
	        System.out.println("odeneck tutar: " + hackOs);
	}
}

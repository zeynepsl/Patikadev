package hackerRank;

import java.util.Scanner;

public class Day14Scope {
	/*
	 * int n=elements.size(); int min=100; int max=1;
	 * 
	 * for(int i=0;i<n;++i) { if(elements[i]<min){min=elements[i];}
	 * if(elements[i]>max){max=elements[i];} } maximumDifference=max-min;
	 */
	
	private int[] elements;
  	public int maximumDifference;
    
  	Day14Scope(int[] elements){
        this.elements = elements;
        maximumDifference = 0;
    }

	void computeDifference(){
        for(int i = 0; i < elements.length; i++){
            for(int j = 1; j < elements.length; j++){
                int diff = elements[i] - elements[j];
                
                if(diff < 0)
                    diff *= -1;                  
                if(diff > maximumDifference)
                    maximumDifference = diff;
            }
        }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Day14Scope difference = new Day14Scope(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
	}
}

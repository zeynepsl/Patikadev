package hackerRank.java;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	//https://www.hackerrank.com/challenges/java-loops/problem
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            int c = s.nextInt();
            int start = s.nextInt();
            int step = s.nextInt();
            findList(c, start, step);
            System.out.println();
        }
    }
    
    public static void findList(int constant, int start, int step){
        int total = constant;
        
        int i = 1;
        for(int j = 0; j < step ; j++){
            total += start*i;
            System.out.print(total + " ");
            i*=2;
        }
    }
    /*
Input (stdin)

2
0 2 10
5 3 5


Expected Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

*/
}

package hackerRank;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day20BubbleSort {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(2);
		a.add(1);
		int[] arr = new int[a.size()];

        for (int i = 0; i < a.size(); i++) {
            arr[i] = a.get(i);
        }

        int numberOfSwaps = 0;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < (len-i-1); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    numberOfSwaps++;
                }
            }
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
        Scanner n = new Scanner(System.in);
        

	}
}

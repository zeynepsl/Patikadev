package hackerRank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PositivePrefix {

	public static void main(String[] args) {
		/*
		 * rasgele duzende verilen bir liste
		 * sýralandýðýnda
		 * en baþtan toplanarak kaç pozitif sayý elde edilir :| :) ---->>
		 * or: 2, -3, 0, 1
		 * sýralanýr--> 0, 1, 2, -3
		 *          --> 0, 1, 3, 0
		 * */
		List<Integer> arr = new ArrayList<Integer>();
		arr.addAll(Arrays.asList(3,-6,-10, 4));
		Collections.sort(arr);//kucukten buyuge sýralar
		Collections.reverse(arr);//buyukten kucuge sýralar

		int count = 0;

		int sum = 0;
		for (int i = 0; i < arr.size(); i++) {
			sum = arr.get(i) + sum;
			if(sum > 0) count++;
		}

		System.out.println(count);
		
	}
	/*int a = 0;
		int b = arr.get(0);
		int c = 0;
	 * for(int i = 1
	 * c = a + b;
			b = arr.get(i);
			a = c;

			if (c > 0)
				count++;
			if (i == arr.size() - 1) {
				c = a + b;
				if (c > 0)
					count++;
				//System.out.println(c);
			}
*/
}

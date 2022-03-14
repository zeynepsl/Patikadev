package coderbyte.week4;

import java.util.ArrayList;
import java.util.List;

public class Medium2 {
	// int[] arr = { 0, -2, -2, 5, 5, 5 };
	public static int DistinctList(int[] arr) {
		List<Integer> duplicateList = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					if (i != j) {
						if (!duplicateList.contains(arr[i])) {
							duplicateList.add(arr[i]);
						}
					}
				}
			}
		}

		int duplicateCounter = 0;
		for (int i = 0; i < arr.length; i++) {

			for (var item : duplicateList) {
				if (arr[i] == item) {
					duplicateCounter += 1;
				}
			}
		}

		duplicateCounter -= duplicateList.size();
		// code goes here
		return duplicateCounter;

	}

	public static void main(String[] args) {
		// keep this function call here
		int[] arr = { 0, -2, -2, 5, 5, 5 }; // output--> 3
		System.out.println(DistinctList(arr));
	}
}

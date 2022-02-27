package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Day20Tutorial {
	public static void bubbleSort(int n) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1, 5);
		int[] a = new int[] {};
		for (int i = 0; i < n; i++) {
			// Tek bir dizi geçiþi sýrasýnda deðiþtirilen öðelerin sayýsýný takip edin
		    int numberOfSwaps = 0;
		    
		    for (int j = 0; j < n - 1; j++) {

		    	// Bitiþik öðeleri azalan sýrada deðiþtir
		        if (a[j] > a[j + 1]) {
		            swap(a[j], a[j + 1]);
		            numberOfSwaps++;
		        }
		    }
		    
		 // Bir geçiþ sýrasýnda hiçbir öðe deðiþtirilmediyse, dizi sýralanýr
		    if (numberOfSwaps == 0) {
		        break;
		    }
		}

	}
}

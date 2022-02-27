package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Day20Tutorial {
	public static void bubbleSort(int n) {
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(1, 5);
		int[] a = new int[] {};
		for (int i = 0; i < n; i++) {
			// Tek bir dizi ge�i�i s�ras�nda de�i�tirilen ��elerin say�s�n� takip edin
		    int numberOfSwaps = 0;
		    
		    for (int j = 0; j < n - 1; j++) {

		    	// Biti�ik ��eleri azalan s�rada de�i�tir
		        if (a[j] > a[j + 1]) {
		            swap(a[j], a[j + 1]);
		            numberOfSwaps++;
		        }
		    }
		    
		 // Bir ge�i� s�ras�nda hi�bir ��e de�i�tirilmediyse, dizi s�ralan�r
		    if (numberOfSwaps == 0) {
		        break;
		    }
		}

	}
}

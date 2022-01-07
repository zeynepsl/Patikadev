package coderbyte.learning;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		//Arrays.sort(Object[] o);
		//desc --> Arrays.sort(arrayToSort, Collections.reverseOrder());
		
		int[] array = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};

		for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array.length; j++) {
		        if (array[i] < array[j]) {
		            int temp = array[i];
		            array[i] = array[j];
		            array[j] = temp;
		        }
		    }
		}
		
		
	}
	
	public void bubbleSort(int[] array) {
	    boolean swapped = true;
	    int j = 0;
	    int tmp;
	    while (swapped) {
	        swapped = false;
	        j++;
	        for (int i = 0; i < array.length - j; i++) {
	            if (array[i] > array[i + 1]) {
	                tmp = array[i];
	                array[i] = array[i + 1];
	                array[i + 1] = tmp;
	                swapped = true;
	            }
	        }
	    }
	}
}

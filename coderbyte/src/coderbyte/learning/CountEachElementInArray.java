package coderbyte.learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CountEachElementInArray {
	public static void main(String[] args) {
		int[] numArr = {1,2,3,2};
		List<Integer> numList = Arrays.stream(numArr ).boxed().collect(Collectors.toList());
		
		//Koleksiyonlardaki bir s�kl�k y�ntemi:
		int freq = Collections.frequency(numList, 2);
		//asagida basit bir sim�lasyon var:
	}
	
	public int count(int[] myArray, int targetValue) {
		//diziyi yinele -> her de�eri kontrol et --> arad���n oge ile eslesen varsa sayac� 1 artt�r:
		int counter = 0;
		for (int i = 0; i < myArray.length; i++) {
			if(myArray[i] == targetValue) {
				counter++;
			}
		}
		return counter;
	}
}

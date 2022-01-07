package coderbyte.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyMedium {

	public static int DistinctList(int[] arr) {
		//integer array'i Listeye �eviriyoruz:
		List<Integer> resultList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		//listedeki her eleman�n ge�i� say�s�n�(s�kl���n�) tutaca��m�z liste:
		List<Integer> freq = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			//her bir eleman listede ka� defa ge�iyor --> sonucu "freq" listesine ekliyoruz
			freq.add(Collections.frequency(resultList, resultList.get(i)));
		}
		
		//soruda en s�k ge�en eleman�n ka� defa ge�ti�ini soruyor
		//listedeki elemanlar�n, listedeki ge�i� s�kl�klar�n� kaydetti�imiz listede en b�y�k (en �ok ge�eni) de�eri bulmaya �al���yoruz:
		int largest = freq.get(0);
		for (int i = 1; i < freq.size(); i++) {
			if (freq.get(i) > largest) {
				largest = freq.get(i);
			}
		}
		
		if(largest == 0) return largest;
		else return (largest - 1);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 2, 2, 2, 3, 4, 4, 5, 5, 5 };// 2 nin 4 kopyas� var --> 4
		//int[] arr = { 1, 2};
		System.out.println(DistinctList(arr));
	}
}

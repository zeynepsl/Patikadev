package coderbyte.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MyMedium {

	public static int DistinctList(int[] arr) {
		//integer array'i Listeye çeviriyoruz:
		List<Integer> resultList = Arrays.stream(arr).boxed().collect(Collectors.toList());

		//listedeki her elemanýn geçiþ sayýsýný(sýklýðýný) tutacaðýmýz liste:
		List<Integer> freq = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			//her bir eleman listede kaç defa geçiyor --> sonucu "freq" listesine ekliyoruz
			freq.add(Collections.frequency(resultList, resultList.get(i)));
		}
		
		//soruda en sýk geçen elemanýn kaç defa geçtiðini soruyor
		//listedeki elemanlarýn, listedeki geçiþ sýklýklarýný kaydettiðimiz listede en büyük (en çok geçeni) deðeri bulmaya çalýþýyoruz:
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
		int[] arr = { 1, 2, 2, 2, 2, 2, 3, 4, 4, 5, 5, 5 };// 2 nin 4 kopyasý var --> 4
		//int[] arr = { 1, 2};
		System.out.println(DistinctList(arr));
	}
}

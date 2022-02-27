package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Day11Array2D {
	/*
	 * Ýlk defa, yani, i==0 ve j==0'da, max_sum için bir deðer yok ama elimizde
	 * sadece temp_sum var. Kalan tüm durumlar için, hangisinin büyük olduðunu
	 * doðrulamak için ilk yinelemede sakladýðýnýz max_sum'a sahip olacaksýnýz. Bu
	 * yüzden baþlangýçta bir çöp(garbage) deðerine max_sum atamak yerine i==0 &&
	 * j==0 koþulunu ekledik.
	 */
	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<>();
		List<Integer> numbers = new ArrayList<Integer>();
		for(int i = 0; i <= 10; i++) {
			numbers.add(i);
		}
		arr.add(numbers);
		/*1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0*/
		int tempSum = 0;
		int maxSum = 0;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if ((i + 2) < 6 && (j + 2) < 6) {
					tempSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
							+ arr.get(i + 1).get(j + 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1)
							+ arr.get(i + 2).get(j + 2);

					if (tempSum > maxSum || i == 0 && j == 0)
						maxSum = tempSum;
				}
			}
		}
		System.out.println(maxSum);
	}

}

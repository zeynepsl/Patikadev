package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class Day11Array2D {
	/*
	 * �lk defa, yani, i==0 ve j==0'da, max_sum i�in bir de�er yok ama elimizde
	 * sadece temp_sum var. Kalan t�m durumlar i�in, hangisinin b�y�k oldu�unu
	 * do�rulamak i�in ilk yinelemede saklad���n�z max_sum'a sahip olacaks�n�z. Bu
	 * y�zden ba�lang��ta bir ��p(garbage) de�erine max_sum atamak yerine i==0 &&
	 * j==0 ko�ulunu ekledik.
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

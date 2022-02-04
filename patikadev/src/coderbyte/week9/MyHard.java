package coderbyte.week9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyHard {
	public static String ArrayCouples(int[] arr) {
		// code goes here
		
		List<Integer> nums = new ArrayList<Integer>();
		for (int i : arr) {
			nums.add(i);
		}

		ArrayList<String> noPairs = new ArrayList<String>();

		for (int j = 1; j < nums.size(); j += 2) {
			boolean flag = false;
			int first = nums.get(j - 1);
			int last = nums.get(j);

			for (int k = 1; k < nums.size(); k += 2) {

				if (last == nums.get(k - 1) && first == nums.get(k) && k!=j) {
					flag = true;
					break;//Bir döngü içinde bir break deyimi ile karþýlaþýldýðýnda, döngü hemen sonlandýrýlýr ve program kontrolü döngüden sonraki bir sonraki deyimde devam eder.
				}

			}
			if (flag != true) {
				noPairs.add(first + "," + last);
			}
		}

		String result = "";
		
		//noPairs.size()==0 ise de olabilir
		if(noPairs.isEmpty()) {
			return "yes";
		}
		
		for(int i = 0; i < noPairs.size(); i++) {
			if(i == noPairs.size()-1) {
				result += noPairs.get(i);
			}
			else {
				result += noPairs.get(i) + ",";
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		int[] arr = new int[] { 5,4,7,6,4,5 };
		//6,2,2,6,5,14,14,1
		System.out.print(ArrayCouples(arr));
	}
}

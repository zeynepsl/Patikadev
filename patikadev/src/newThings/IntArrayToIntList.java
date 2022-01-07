package newThings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntArrayToIntList {
	public static void main(String[] args) {
		int[] numArr = { 1, 2, 3 };
		System.out.println("ilk metod: " + method1(numArr));
		System.out.println("2. metod: " + method2(numArr));
	}
	
	public static List<Integer> method1(int[] numArr) {
		List<Integer> numList = new ArrayList<Integer>(numArr.length);
		for (int num : numArr) {
			numList.add(num);
		}
		return numList;
	}
	
	public static List<Integer> method2(int[] numArr) {
		List<Integer> list = Arrays.stream(numArr ).boxed().collect(Collectors.toList());
		return list;
	}
	
}

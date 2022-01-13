package coderbyte.week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Hard {
	
	public static ArrayList<ArrayList<Character>> buildBoard(String[] strArr) {
		ArrayList<ArrayList<Character>> board = new ArrayList<>();
		for (int i = 0; i < strArr.length; i++) {
			ArrayList<Character> row = new ArrayList<>();
			for (int j = 0; j < strArr[i].length(); j++) {

				if (Character.isDigit(strArr[i].charAt(j))) {
					row.add(strArr[i].charAt(j));
				} else if (strArr[i].charAt(j) == 'x')
					row.add('x');
			}

			board.add(row);
		}

		return board;
	}

	public static int findQuadrantNumber(int row, int column) {
		int a = row / 3;
		int b = column / 3;

		return (a * 3) + b + 1;
	}

	public static boolean checkRow(ArrayList<ArrayList<Character>> board, int row, TreeSet<Integer> failed) {

		HashMap<Character, Integer> st = new HashMap<>();
		boolean found = false;
		for (int i = 0; i < 9; i++) {
			if (st.containsKey(board.get(row).get(i))) {
				failed.add(findQuadrantNumber(row, i));
				failed.add(st.get(board.get(row).get(i)));
				found = true;
			}
			if (board.get(row).get(i) != 'x') {
				st.put(board.get(row).get(i), findQuadrantNumber(row, i));
			}
		}
		return !found;
	}

	public static boolean checkCol(ArrayList<ArrayList<Character>> board, int col, TreeSet<Integer> failed) {

		HashMap<Character, Integer> st = new HashMap<>();
		boolean found = false;

		for (int i = 0; i < 9; i++) {
			if (st.containsKey(board.get(i).get(col))) {
				failed.add(findQuadrantNumber(i, col));
				failed.add(st.get(board.get(i).get(col)));

				found = true;
			}

			if (board.get(i).get(col) != 'x') {
				st.put(board.get(i).get(col), findQuadrantNumber(i, col));
			}
		}
		return !found;

	}

	public static boolean checkBox(ArrayList<ArrayList<Character>> board, int startRow, int startCol,
			TreeSet<Integer> failed) {
		HashMap<Character, Integer> st = new HashMap<>();
		boolean found = false;

		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				char curr = board.get(row + startRow).get(col + startCol);

				if (st.containsKey(curr)) {
					failed.add(findQuadrantNumber(row + startRow, col + startCol));
					failed.add(st.get(curr));
					found = true;

				}

				if (curr != 'x') {

					st.put(curr, findQuadrantNumber(row + startRow, col + startCol));
				}
			}
		}

		return true;
	}

	public static String SudokuQuadrantChecker(String[] strArr) {
		ArrayList<ArrayList<Character>> board = buildBoard(strArr);

		TreeSet<Integer> failedQuadrants = new TreeSet<>();

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				checkRow(board, i, failedQuadrants);
				checkCol(board, j, failedQuadrants);
				checkBox(board, i - i % 3, j - j % 3, failedQuadrants);
			}
		}

		StringBuilder stringBuilder = new StringBuilder();
		for (int i : failedQuadrants) {
			stringBuilder.append(String.format("%d,", i));
		}

		return stringBuilder.toString().substring(0, stringBuilder.length() - 1);
	}

	public static void main(String[] args) {
		// keep this function call here
		Scanner s = new Scanner(System.in);
		String[] arr = {"(1,2,3,4,5,6,7,8,9)", "(x,x,x,x,x,x,x,x,x)", "(6,x,5,x,3,x,x,4,x)", 
				"(2,x,1,1,x,x,x,x,x)", "(x,x,x,x,x,x,x,x,x)", "(x,x,x,x,x,x,x,x,x)", 
				"(x,x,x,x,x,x,x,x,x)", "(x,x,x,x,x,x,x,x,x)", "(x,x,x,x,x,x,x,x,9)"};
		System.out.print(SudokuQuadrantChecker(arr));
			
	}
	/*
	 * (1,2,3,4,5,6,7,8,9) (x,x,x,x,x,x,x,x,x) (6,x,5,x,3,x,x,4,x)
	 * (2,x,1,1,x,x,x,x,x) (x,x,x,x,x,x,x,x,x) (x,x,x,x,x,x,x,x,x)
	 * (x,x,x,x,x,x,x,x,x) (x,x,x,x,x,x,x,x,x) (x,x,x,x,x,x,x,x,9)"
	 */

}

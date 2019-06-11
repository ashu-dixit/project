package l_2_10_19;

import java.awt.DisplayMode;
import java.util.Scanner;

//3
//5 3 0
//6 0 0
//0 9 8
public class SUDUKO {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] suduko = takeinput();
		suduko(suduko, 0, 0);

	}

	public static void suduko(int[][] arr, int row, int co) {
		if (row == arr.length) {
			display(arr);
			return;

		}
		if (co == arr[0].length) {
			suduko(arr, row + 1, 0);
			return;
		}

		if (arr[row][co] != 0) {
			suduko(arr, row, co + 1);
			return;
		}
		for (int val = 1; val <= 9; val++) {

			if (is_it_correct_to_put(val, co, row, arr)) {
				arr[row][co] = val;

				suduko(arr, row, co + 1);

				arr[row][co] = 0;
			}
		}

	}

	public static boolean is_it_correct_to_put(int val, int col, int row, int[][] arr) {

		return is_it_safe_to_put_col(arr, row, val) && is_it_safe_to_put_row(arr, col, val)
				&& is_it_safe_to_put_col_row(arr, col, row, val);

	}

	public static boolean is_it_safe_to_put_col_row(int[][] arr, int col, int row, int val) {

		int c = col - col % 3;
		int r = row - row % 3;

		for (int i = c; i < c + 3; i++) {
			for (int j = r; j < r + 3; j++) {
				if (arr[j][i] == val)
					return false;
			}
		}

		return true;
	}

	public static boolean is_it_safe_to_put_col(int[][] arr, int row, int val) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[row][i] == val) {
				return false;
			}
		}

		return true;
	}

	public static boolean is_it_safe_to_put_row(int[][] arr, int col, int val) {

		for (int i = 0; i < arr[0].length; i++) {
			if (arr[i][col] == val) {
				return false;
			}
		}

		return true;
	}

	public static void display(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] takeinput() {
		int n = scn.nextInt();
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}
}
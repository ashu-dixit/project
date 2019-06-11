package programm;

import java.util.Scanner;

public class NqueenProblem {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(countpossiblequeens(new boolean[n][n], 0));
		printpossiblequeens(new boolean[n][n], 0, "");
	}

	public static void printpossiblequeens(boolean[][] chess, int row, String ans) {
		if (row == chess.length) {
			System.out.println(ans + " ");
			return;
		}

		for (int col = 0; col < chess.length; col++) {
			if (isitpossible(chess, row, col)) {
				chess[row][col] = true;
				printpossiblequeens(chess, row + 1, ans + "{" + (row + 1) + "-" + (col + 1) + "} ");
				chess[row][col] = false;
			}
		}
		return;
	}

	public static int countpossiblequeens(boolean[][] chess, int row) {
		if (row == chess.length) {
			return 1;
		}

		int a = 0;

		for (int col = 0; col < chess.length; col++) {
			if (isitpossible(chess, row, col)) {
				chess[row][col] = true;
				a += countpossiblequeens(chess, row + 1);
				chess[row][col] = false;
			}
		}
		return a;
	}

	public static boolean isitpossible(boolean[][] chess, int row, int col) {

		for (int r = row; r >= 0; r--) {
			if (chess[r][col] == true) {
				return false;
			}
		}
		int r = row;
		int c = col;
		while (r >= 0 && c < chess.length) {
			if (chess[r][c] == true) {
				return false;
			}
			r--;
			c++;
		}
		r = row;
		c = col;
		while (r >= 0 && c >= 0) {
			if (chess[r][c] == true) {
				return false;
			}
			r--;
			c--;
		}

		return true;
	}
}

package programm;

import java.util.Scanner;

public class NKnightProblem {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		System.out.println(countpossibleknight(new boolean[n][n], 0, 0, n));
	}

	public static int countpossibleknight(boolean[][] chess, int row, int col, int n) {
		if (n == 0) {
			return 1;
		}
		if (row == chess.length) {
			return 0;
		}
		int a = 0;
		if (col == chess[0].length) {
			a += countpossibleknight(chess, row + 1, col, n);
			return a;
		}

		a += countpossibleknight(chess, row, col + 1, n);

		if (isitpossible(chess, row, col)) {
			chess[row][col] = true;
			a += countpossibleknight(chess, row, col + 1, n - 1);
			chess[row][col] = false;

		}

		return a;
	}

	public static boolean isitpossible(boolean[][] chess, int row, int col) {
		int r = row;
		int c = col;
		r = r - 1;
		// 1
		c = c + 2;
		if (r >= 0 && c < chess[0].length && chess[r][c] == true) {
			return false;
		}
		// 2
		c = col - 2;
		if (r >= 0 && c >= 0 && chess[r][c] == true) {
			return false;
		}
		// 3
		r = row + 1;
		c = col + 2;
		if (r < chess.length && c < chess[0].length && chess[r][c] == true) {
			return false;
		}
		// 4
		c = col - 2;
		if (r < chess.length && c >= 0 && chess[r][c] == true) {
			return false;
		}
		// 5
		c = col - 1;
		r = row + 2;
		if (c >= 0 && r < chess[0].length && chess[r][c] == true) {
			return false;
		}
		// 6
		r = row - 2;
		if (r >= 0 && c >= 0 && chess[r][c] == true) {
			return false;
		}
		// 7
		c = col + 1;
		r = row + 2;
		if (r < chess.length && c < chess[0].length && chess[r][c] == true) {
			return false;
		}
		r = row - 2;
		if (r >= 0 && c < chess[0].length && chess[r][c] == true) {
			return false;
		}
		return true;
	}

}

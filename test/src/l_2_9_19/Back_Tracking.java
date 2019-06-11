package l_2_9_19;

public class Back_Tracking {

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		Nqueens(board, 0, "");
	}

	public static void Nqueens(boolean[][] board, int row, String ans) {
		if (row == board.length) {
			System.out.println(ans);
			return;
		}

		for (int col = 0; col < 4; col++) {
			if (isitsafetoplaceat(board, row, col)) {
				board[row][col] = true;
				Nqueens(board, row + 1, ans + "{" + row + "-" + col + "}");
				board[row][col] = false;
			}
		}

	}

	public static boolean isitsafetoplaceat(boolean[][] board, int row, int col) {

		int r = row - 1;

		while (r >= 0) {
			if (board[r][col])
				return false;
			r--;
		}

		r = row - 1;
		int c = col + 1;
		while (r >= 0 && c < board[0].length) {

			if (board[r][c])
				return false;

			c++;
			r--;
		}
		r = row - 1;
		c = col - 1;
		while (r >= 0 && c >= 0) {

			if (board[r][c])
				return false;

			c--;
			r--;
		}

		return true;
	}
}

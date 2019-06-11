package l_2_9_19;

public class N_NUM_OF_QUEEN {

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		Nqueens2(board, 0, "",0,3);
	}

	public static void Nqueens2(boolean[][] board, int row, String ans,int qpsf,int total) {
		if(qpsf==total) {
			System.out.println(ans);
			return;
		}
		if (row == board.length) {
			return;
		}

		for (int col = 0; col <4; col++) {
			if (isitsafetoplaceat(board, row, col)) {
				board[row][col] = true;
				Nqueens2(board, row + 1, ans + "{" + row + "-" + col + "}",qpsf+1,total);
				board[row][col] = false;
			}
		}
		Nqueens2(board, row+1, ans, qpsf, total);
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

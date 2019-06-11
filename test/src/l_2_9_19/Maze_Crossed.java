package l_2_9_19;

public class Maze_Crossed {

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		board[0][1] = true;
		board[2][1] = true;
		board[3][2] = true;
		mazecrossed(board, 0, 0, board.length, board[0].length, "");

	}

	public static void mazecrossed(boolean[][] board, int cr, int cc, int er, int ec, String ans) {
		if (cc == ec-1 && cr == er-1) {
			System.out.println(ans);
			return;
		}

		if (cr >= er || cr < 0 || cc >= ec || cc < 0 || board[cr][cc]) {
			return;
		}
		board[cr][cc] = true;
		mazecrossed(board, cr + 1, cc, er, ec, ans + "D");
		mazecrossed(board, cr, cc + 1, er, ec, ans + "R");
		mazecrossed(board, cr - 1, cc, er, ec, ans + "T");
		mazecrossed(board, cr, cc - 1, er, ec, ans + "L");
		board[cr][cc] = false;

	}

}

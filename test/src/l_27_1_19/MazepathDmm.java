package l_27_1_19;

import java.util.ArrayList;

public class MazepathDmm {

	public static void main(String[] args) {
		System.out.println(mazepath(3, 3, 0, 0));

	}

	public static ArrayList<String> mazepath(int col, int row, int ccol, int crow) {
		if (ccol == col && crow == row) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		for (int i = 1; i < col && ccol < col; i++) {
			ArrayList<String> rr = mazepath(col, row, ccol + i, crow);
			for (String val : rr) {
				mr.add(val + "H" + i);
			}
		}
		for (int i = 1; i < row && crow < row; i++) {
			ArrayList<String> rr = mazepath(col, row, ccol, crow + i);
			for (String val : rr) {
				mr.add(val + "V" + i);
			}
		}
		for (int i = 1; i < col && ccol < col && crow < row; i++) {
			ArrayList<String> rr = mazepath(col, row, ccol + i, crow + i);
			for (String val : rr) {
				mr.add(val + "D" + i);
			}
		}

		return mr;
	}
}
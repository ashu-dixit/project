
package l_27_1_19;

import java.util.ArrayList;

public class MazepathD {

	public static void main(String[] args) {
		System.out.println(pathHVD(0, 3, 3, 0));

	}

	public static ArrayList<String> pathHVD(int ccol, int row, int col, int crow) {
		if ((crow == row) && (ccol == col)) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}
		if (col < ccol || row < crow) {
			ArrayList<String> br = new ArrayList<>();
			return br;
		}
		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = pathHVD(ccol, row, col, crow + 1);
		for (String val : rrh)
			mr.add("V" + val);

		ArrayList<String> rrv = pathHVD(ccol + 1, row, col, crow);
		for (String val : rrv)
			mr.add("H" + val);

		ArrayList<String> rrd = pathHVD(ccol + 1, row, col, crow + 1);
		for (String val : rrd)
			mr.add("D" + val);

		return mr;
	}
}

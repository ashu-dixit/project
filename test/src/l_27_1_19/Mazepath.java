package l_27_1_19;

import java.util.ArrayList;

public class Mazepath {

	public static void main(String[] args) {
		System.out.println(pathHV(0, 3, 3, 0));

	}

	public static ArrayList<String> pathHV(int ccol, int row, int col, int crow) {
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

		ArrayList<String> rrh = pathHV(ccol, row, col, crow + 1);
		for (String val : rrh)
			mr.add("V" + val);

		ArrayList<String> rrv = pathHV(ccol + 1, row, col, crow);
		for (String val : rrv)
			mr.add("H" + val);

		return mr;
	}
}

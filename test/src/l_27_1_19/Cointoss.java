package l_27_1_19;

import java.util.ArrayList;

public class Cointoss {

	public static void main(String[] args) {
		System.out.println(possibalities(3, 0));
	}

	public static ArrayList<String> possibalities(int not, int ct) {
		if (not == ct) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = possibalities(not, ct + 1);
		for (String val : rrh) {
			mr.add(val + "H");
		}
		ArrayList<String> rrt = possibalities(not, ct + 1);
		for (String val : rrt) {
			mr.add(val + "T");
		}
		return mr;
	}
}

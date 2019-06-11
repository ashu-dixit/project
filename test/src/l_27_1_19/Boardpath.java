package l_27_1_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Boardpath {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(path(0, 10, 0));
		System.out.println(path(0,10));
	}

	public static ArrayList<String> path(int crnt, int end, int count) {
		if (crnt == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		for (int i = 1; i <= 6 && (crnt + i) <= end; i++) {
			ArrayList<String> rr = path(crnt + i, end, count + 1);
			if ((i == 1 || i == 6) || count != 0) {
				for (String val : rr) {
					mr.add(i + val);
				}
			}
		}
		return mr;

	}

	public static ArrayList<String> path(int crnt, int end) {
		if (crnt == end) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		for (int i = 1; i <= 6 && (crnt + i) <= end; i++) {
			ArrayList<String> rr = path(crnt + i, end);

			for (String val : rr) {
				mr.add(i + val);

			}
		}
		return mr;

	}

}

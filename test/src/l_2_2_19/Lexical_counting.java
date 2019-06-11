package l_2_2_19;

import java.util.Scanner;

public class Lexical_counting {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();
		printcounting(0, N);
	}

	public static void printcounting(int cur, int end) {
		if (cur > end) {
			return;
		}
		System.out.println(cur);

		int i = 0;
		if (cur == 0)
			i = 1;

		for (; i <= 9; i++)
			printcounting(cur * 10 + i, end);

	}

}

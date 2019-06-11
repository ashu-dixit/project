package programm;

import java.util.Scanner;

public class RECURSION_CONVERT_STRING_TO_INTEGER {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String ss = scn.next();
		System.out.println(convert(ss, ss.length() - 1));

	}

	public static int convert(String ss, int num) {
		if (ss.length() == 0) {
			return 0;
		}

		char ch = ss.charAt(0);
		String ros = ss.substring(1);
		int i = convert(ros, num - 1);
		i = i + (ch - 48) * (int) Math.pow(10, num);

		return i;

	}
}

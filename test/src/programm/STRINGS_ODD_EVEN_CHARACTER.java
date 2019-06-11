package programm;

import java.util.Scanner;

public class STRINGS_ODD_EVEN_CHARACTER {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String str = scn.next();
		System.out.println(change(str));

	}

	public static String change(String str) {
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (i % 2 == 0)
				ch = (char) (ch + 1);
			else
				ch = (char) (ch - 1);

			st = st + ch;
		}
		return st;
	}

}

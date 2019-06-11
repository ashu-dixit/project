package programm;

import java.util.ArrayList;
import java.util.Scanner;

public class RECURSION_CODES_OF_THE_STRING {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String ss = scn.next();
		System.out.println(getcodes(ss));

	}

	public static ArrayList<String> getcodes(String ss) {
		if (ss.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();
		for (int i = 0; i < 2 && i < ss.length(); i++) {
			String ch = ss.substring(0, i + 1);
			char c = getchar(ch);
			if(Integer.parseInt(ch)<=26) {
			String ros = ss.substring(i + 1);
			ArrayList<String> rr = getcodes(ros);
			for (String val : rr) {
				mr.add(c + val);
			}
		}
		}
		return mr;
	}

	public static char getchar(String ch) {
		int i = Integer.parseInt(ch);
		i += 96;
		char c = (char) i;
		return c;
	}

}

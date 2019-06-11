package programm;

import java.util.ArrayList;
import java.util.Scanner;

public class Keypadcode {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String ss = scn.next();
		ArrayList<String> rr=kpc(ss);
		System.out.println(count);
		for(String val:rr)
		System.out.print(val+" ");
	}
static int count=1;
	public static ArrayList<String> kpc(String ss) {
		if (ss.length() == 0) {
			ArrayList<String> br = new ArrayList<>();
			br.add("");
			return br;
		}

		char ch = ss.charAt(0);
		String ros = ss.substring(1);
		ArrayList<String> mr = new ArrayList<>();
		String s = getcode(ch);
		count*=s.length();
		ArrayList<String> rr = kpc(ros);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			for (String val : rr) {
				mr.add(c + val);
			}
		}
		return mr;
	}

	public static String getcode(char ch) {
		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jkl";
		else if (ch == '5')
			return "mno";
		else if (ch == '6')
			return "pqrs";
		else if (ch == 7)
			return "tuv";
		else if (ch == 8)
			return "wx";
		else
			return "yz";
	}
}

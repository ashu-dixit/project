package l_1_20_19;

import java.util.ArrayList;

public class Keypadcombination {
	public static void main(String[] args) {
		System.out.println(combination("45"));
		System.out.println(permutation("abc"));
	}

	public static String getCode(char ch) {

		if (ch == '1')
			return "abc";
		else if (ch == '2')
			return "def";
		else if (ch == '3')
			return "ghi";
		else if (ch == '4')
			return "jk";
		else if (ch == '5')
			return "lmno";
		else if (ch == '6')
			return "pqr";
		else if (ch == '7')
			return "stu";
		else if (ch == '8')
			return "vwx";
		else if (ch == '9')
			return "yz";
		else if (ch == '0')
			return "@#";
		else
			return "";
	}

	public static ArrayList<String> combination(String st) {

		if (st.length() == 0) {
			ArrayList<String> r = new ArrayList<>();
			r.add("");
			return r;
		}
		char ch = st.charAt(0);
		String s = getCode(ch);
		st = st.substring(1);
		ArrayList<String> rr = combination(st);
		ArrayList<String> mr = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {
			for (String val : rr)
				mr.add(s.charAt(i) + val);
		}
		return mr;
	}

	public static ArrayList<String> permutation(String st) {
		if (st.length() == 0) {
			ArrayList<String> r = new ArrayList<>();
			r.add("");
			return r;
		}
		char s=st.charAt(0);
		st = st.substring(1);
		
		ArrayList<String> rr = permutation(st);
		ArrayList<String> mr = new ArrayList<>();
		
		for (String val : rr) {
			for(int i=0;i<=val.length();i++)
			mr.add(val.substring(0, i)+s+val.substring(i));
		}
		return mr;
	}
}

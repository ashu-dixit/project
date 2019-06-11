package programm;

import java.util.Scanner;

public class IS_PALINDROME_2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String ss=scn.next();
		System.out.println(ispalindrome(ss));
	}

	public static boolean ispalindrome(String ss) {

		int lo = 0;
		int hi = ss.length() - 1;
		while (lo <= hi) {

			if (ss.charAt(lo) != ss.charAt(hi)) {
				return false;
			}

			hi--;
			lo++;
		}
		return true;
	}
}

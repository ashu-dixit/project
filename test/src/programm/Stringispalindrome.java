package programm;

import java.util.Scanner;

public class Stringispalindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		if(ispalindrome(str))
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static boolean ispalindrome(String str) {
		int lo = 0;
		int hi = str.length() - 1;
		while (lo <= hi) {
			if (str.charAt(lo) != str.charAt(hi)) {
				return false;
			}
			hi--;
			lo++;
		}

		return true;
	}
}

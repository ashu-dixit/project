package programm;

import java.util.ArrayList;
import java.util.Scanner;

public class Palindromicsubsequence {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
	System.out.println(palindromesubsring(str));
	}
	public static int palindromesubsring(String ss) {
		int count=0;
		for(int i=0;i<ss.length();i++) {
			for(int j=i+1;j<=ss.length();j++) {
				if(ispalindrome(ss.substring(i, j)))
				count++;
			}
		}
		return count;
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

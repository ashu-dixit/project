package programm;

import java.util.Scanner;

public class STRINGS_DIFFERENCE_IN_ASCII_CODES {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String ss=scn.next();
		System.out.println(difference(ss));
	}
public static String difference(String ss ) {
	String s="";
	for(int i=1;i<ss.length();i++) {
		s+=ss.substring(i-1, i)+(ss.charAt(i)-ss.charAt(i-1));
	}
	s+=ss.charAt(ss.length()-1);
	return s;
}
}

package programm;

import java.util.Scanner;

public class RECURSION_SUBSEQUENCES {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String ss=scn.next();
		System.out.println(subsequences(ss, ""));
	}
public static int subsequences(String ss,String ans) {
	if(ss.length()==0) {
		System.out.println(ans);
		return 1;
	}
	
	
	char ch=ss.charAt(0);
	String s=ss.substring(1);
	int a=0;
	a+=subsequences(s, ans);
	a+=subsequences(s, ans+ch);
	return a;
	
}
}

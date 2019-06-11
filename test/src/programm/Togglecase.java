package programm;

import java.util.Scanner;

public class Togglecase {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		String str =scn.next();
		System.out.println(change(str));
	
	}
public static String change(String str) {
	String st="";
	char chh='a';
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		
		if(ch>='A'&&ch<='Z') {
			int c=ch+('a'-'A');
			chh=(char)c;
		}
		if(ch>='a'&&ch<='z') {
			int c=ch-('a'-'A');
			chh=(char)c;
		}
		st=st+chh;
	}
	return st;
}
}

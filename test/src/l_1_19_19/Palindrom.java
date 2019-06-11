package l_1_19_19;

import java.util.Scanner;

public class Palindrom {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		String str=scn.next();
		if(ispalindrome(str)) 
			System.out.println("yes");
		else
			System.out.println("no");
		System.out.println("----------");
		Allsubstring(str);
		System.out.println("----------");
		palindromesubsring(str);
		
	}
	
	public static Boolean ispalindrome(String ss) {
		int i=0;
		int j=ss.length()-1;
		while(i<j) {
			if(ss.charAt(i)!=ss.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
public static void Allsubstring(String ss) {
	
	
	for(int i=0;i<ss.length();i++) {
		for(int j=i+1;j<=ss.length();j++) {
			System.out.println(ss.substring(i, j));
		}
	}
	
	
	
}

public static void palindromesubsring(String ss) {
	for(int i=0;i<ss.length();i++) {
		for(int j=i+1;j<=ss.length();j++) {
			if(ispalindrome(ss.substring(i, j)))
			System.out.println(ss.substring(i, j));
		}
	}
}

}

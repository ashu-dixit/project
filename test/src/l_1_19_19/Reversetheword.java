package l_1_19_19;

import java.util.Scanner;

public class Reversetheword {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		String ss=scn.nextLine();
		reversestring(ss);
	}
	
	
	public static void reversestring(String ss) {
		
		String[] s=ss.split(" ");
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]+" ");
		}
		
	}

}

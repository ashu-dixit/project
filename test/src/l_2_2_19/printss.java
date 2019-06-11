package l_2_2_19;

import java.util.Scanner;

public class printss {
static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
	String ss=scn.next();
	printss(ss, "");

	}
public static void printss(String qos, String ans) {
	if(qos.length()==0) {
		System.out.println(ans);
		return;
	}
	
	
	char ch=qos.charAt(0);
	qos=qos.substring(1);
	
	printss(qos, ans);
	printss(qos, ans+ch);
	
}
}

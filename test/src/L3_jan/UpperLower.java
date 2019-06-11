package L3_jan;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		char  ch=scn.next().charAt(0);
		if(ch<='z' && ch>='a') {
			System.out.println("lowercase");
		}else if(ch<='Z'&& ch>='A') {
			System.out.println("upper");
		}else {
			System.out.println("invalid input");
		}

	}

}

package programm;

import java.util.Scanner;

public class RECURSION_NTH_TRIANGLE {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(triangle(1, n));
	}

	public static int triangle(int ct, int lt) {
		if (ct == lt) {
			return ct;
		}
		int sum = 0;
		sum = ct + triangle(ct + 1, lt);
		return sum;
	}
}

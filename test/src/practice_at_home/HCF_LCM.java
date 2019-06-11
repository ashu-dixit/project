package practice_at_home;

import java.util.Scanner;

public class HCF_LCM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int divident = scn.nextInt();
		int divisor = scn.nextInt();
		int a = divisor;
		int b = divident;
		String sh="ashutosh";
		sh.s
		while (divident % divisor != 0) {
			int rem = divident % divisor;
			divident = divisor;
			divisor = rem;
		}
		System.out.println("HCF = " + divisor);
		System.out.println("LCM = " + (a * b) / divisor);

	}

}

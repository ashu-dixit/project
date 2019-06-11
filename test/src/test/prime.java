package test;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int prime = scn.nextInt();
		int count = 1, s = 0;
		while (count < prime / 2) {
			count = count + 1;
			if (prime % count == 0) {
				System.out.println("number is not prime");
				s = 30;
				break;
			}

		}
		if (s != 30) {
			System.out.println("number is prime");
		}
	}

}

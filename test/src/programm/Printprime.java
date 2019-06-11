package programm;

import java.util.Scanner;

public class Printprime {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();
		int prime = 2;

		while (prime <= num) {
			int factor = 0, countin = 1;
			while (countin <= prime) {
				if (prime % countin == 0) {
					factor = factor + 1;
				}
				countin = countin + 1;
			}
			if (factor == 2) {
				System.out.println(prime);
			}
			prime = prime + 1;

		}

	}

}

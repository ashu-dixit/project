package programm;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();

		printprimes(lo, hi);
	}

	public static void printprimes(int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			if (isprime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isprime(int n) {
		int count = 1;
		boolean check = true;
		while (count < n / 2) {
			count = count + 1;
			if (n % count == 0) {
				check = false;

			}

		}
		return check;

	}

}

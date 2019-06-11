package programm;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int lo = scn.nextInt();
		int hi = scn.nextInt();
		printarmstrong(lo, hi);

	}

	public static void printarmstrong(int lo, int hi) {
		for (int i = lo; i <= hi; i++) {

			if (isarmstrong(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isarmstrong(int n) {
		int no = noofdigits(n);

		int rem = 0;
		int ans = 0;
		int num = n;
		while (n != 0) {
			rem = n % 10;
			ans = ans + (int) Math.pow(rem, no);
			n /= 10;
		}
		if (num == ans)
			return true;
		else
			return false;
	}

	public static int noofdigits(int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}

}

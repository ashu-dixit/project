package vipul;

import java.util.Scanner;

public class Firstprog {

	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
//		int n = 0;
//		int num = scn.nextInt();
//		while (num!=0) {
//				n = n + 1;
//				num/=10;
//		}
//		System.out.println(n);
//		hcf(90,60);
		name();
	}

	public static void hcf(int divident, int divisor) {
		int r = 1;
		if (divident > divisor) {
			while (r != 0) {
				r = divident % divisor;
				divisor = divident;
				divisor = r;
			}
		}
		System.out.println(divisor);
	}

	public static void name() {
		Scanner scn = new Scanner(System.in);

		long num = scn.nextLong();
		long n = num;
		long count = 0;
		while (n != 0) {
			count += 1;
			n = n / 10;
		}
		n = num;
		for (long i = 0; i < count; i++) {
			long rem = n % 10;
			if (rem == 0)
				num = (long) (num + 5 * (Math.pow(10, i)));
			n = n / 10;
		}
		System.out.println(num);
	}
}
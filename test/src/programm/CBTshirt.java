package programm;

import java.util.Scanner;

public class CBTshirt {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int deci = scn.nextInt();
			for(int j=1;j<=deci;j++)
			System.out.print(decimaltooctal(j) + " ");
		}
	}

	public static long decimaltooctal(long deci) {
		long binary = 0;
		long i = 0;
		while (deci != 0) {
			binary = binary + (deci % 2) * (long) Math.pow(10, i);
			i++;
			deci /= 2;
		}
		return binary;
	}
}

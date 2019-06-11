package test;

import java.util.Scanner;

public class SumfOddEvenDlaceDigit {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int odd;
		int even;
		int sum1 = 0, sum2 = 0;
		int count = 1;

		while (num != 0) {

			if (count % 2 == 0)
				sum1 = sum1 + num % 10;
			else
				sum2 = sum2 + num % 10;
			num = num / 10;
			count = count + 1;
		}

		if (count % 2 == 1) {
			odd = sum1;
			even = sum2;
		}

		else {
			odd = sum2;
			even = sum1;
		}

		System.out.println(even);
		System.out.println(odd);
	}
}

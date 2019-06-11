package test;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int count = 1, sum = 0;

		while (count <= n) {

			sum = sum + count;

			count = count + 1;

		}
		System.out.println(sum);
	}

}

package programm;

import java.util.Scanner;

public class MaximumCircularsum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		for (int i = 0; i < t; i++)
			System.out.println(maxsum(takeinput()));
	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;
	}

	public static int maxsum(int[] arr) {

		int summax = 0;
		for (int j = 0; j < arr.length; j++) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				if (i - j < 0) {
					sum = sum + arr[(i + arr.length - j)];
				} else {
					sum = sum + arr[i - j];
				}
				if (i == 0 && j == 0)
					summax = sum;
				else {
					if (sum > summax)
						summax = sum;
				}

			}
		}
		return summax;
	}
}

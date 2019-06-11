package programm;

import java.util.Scanner;

public class Largestsubarray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int[] arr = takearr();
			subarray(arr);
		}
	}

	public static int[] takearr() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		return arr;
	}

	public static void subarray(int[] arr) {
		int max = 0;
		int lo = -1;
		int hi = -1;
		for (int i = 0; i < arr.length; i++) {
			int count0 = 0;
			int count1 = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] == 0)
					count0++;
				else if (arr[j] == 1)
					count1++;
				int len = j - i + 1;
				if (count0 == count1 && len > max) {
					max = len;
					lo = i;
					hi = j;
				}
			}

		}

		if (lo != -1 && hi != -1)
			System.out.println(lo + " " + hi);
		else {
			System.out.println("None");
		}
	}
}

package programm;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Scanner;

public class BookAllocation__binarysearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		int T = 0;
		while (t > T) {
			System.out.println(minithemaxi());
			T++;
		}
	}

	public static int minithemaxi() {
		// input
		int n = scn.nextInt();
		int m = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		//
		int max = sumarr(arr);
		int min = arr[0];
		int mid = 0;
		while (max >= min) {
			mid = (max + min) / 2;
			if (ispossible(arr, m, mid)) {
				max = mid-1;
			} else {
				min = mid+1;
			}

		}
		return min;
	}

	public static boolean ispossible(int[] arr, int m, int atmost) {

		int student = 0;
		int j = 0;
		int i = 0;
		boolean flag=true;
		for (i = 0; i < m; i++) {
			for (; j < arr.length; j++) {
				flag=true;
				student += arr[j];
				if (student > atmost) {
					student = 0;
					flag=false;
					break;

				}
			}

		}
		return flag;
	}

	public static int sumarr(int[] vol) {

		int sum = 0;
		for (int i = 0; i < vol.length; i++) {
			sum += vol[i];
		}
		return sum;
	}
}

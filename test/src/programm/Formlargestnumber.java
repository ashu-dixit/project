package programm;

import java.util.Scanner;

public class Formlargestnumber {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// long[] arr = { 548, 54, 540, 60 };
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			long[] arr = takeinput();
			sortlexicaly(arr);
			System.out.println(largestnumber(arr));
		}
	}

	public static long[] takeinput() {
		int n = scn.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextLong();
		}
		return arr;
	}

	public static void sortlexicaly(long[] arr) {

		for (int i = 1; i < arr.length; i++) {
			String temp = String.valueOf(arr[i]);
			long tem = arr[i];
			int j = i - 1;
			int at = 0;
			while (j >= 0 && Integer.parseInt(String.valueOf(arr[j]) + String.valueOf(tem)) < Integer
					.parseInt(String.valueOf(tem) + String.valueOf(arr[j]))) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = tem;
		}

	}

	public static long countdigit(long num) {
		long count = 0;
		while (num != 0) {
			count++;
			num /= 10;
		}
		return count;
	}

	public static long largestnumber(long[] arr) {
		long num = 0;
		for (int i = 0; i < arr.length; i++) {
			num = num * (long) Math.pow(10, countdigit(arr[i])) + arr[i];
		}
		return num;
	}

}

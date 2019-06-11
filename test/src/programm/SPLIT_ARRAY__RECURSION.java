package programm;

import java.util.Scanner;

public class SPLIT_ARRAY__RECURSION {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takearr();
		int a = split(arr, 0, 0, 0, "", "");
		System.out.println(a);
	}

	public static int[] takearr() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		return arr;
	}

	public static int split(int[] arr, int vindx, int sum1, int sum2, String ans1, String ans2) {
		if (vindx == arr.length) {
			if (sum1 == sum2) {
				System.out.println(ans1 + " and " + ans2);
				return 1;
			}
			return 0;
		}
		int a = 0;
		a += split(arr, vindx + 1, sum1 + arr[vindx], sum2, ans1 + " " + arr[vindx], ans2);
		a += split(arr, vindx + 1, sum1, sum2 + arr[vindx], ans1, ans2 + " " + arr[vindx]);

		return a;

	}
}

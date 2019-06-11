package programm;

import java.util.Scanner;

public class painterpatitionproblem {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int k = scn.nextInt();
		System.out.println(timemin(takeinput(), k));
	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		return arr;
	}

	public static int max(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}

		return max;
	}

	public static int sum(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}

	public static int timemin(int[] arr, int k) {
		int lo = max(arr);
		int hi =sum(arr);
		int mid = (lo + hi) / 2;
		int ans = 0;
		while (lo <= hi) {
			mid = (lo + hi) / 2;
			if (noofpainter(mid, arr) > k) {
				lo = mid + 1;

			} else if (noofpainter(mid, arr) <= k) {
				hi = mid - 1;
				ans = mid;
			} 
				

		}

		return ans;

	}

	public static int noofpainter(int mid, int[] arr) {
		int i = 0;
		int time = 0;
		int noofpainter = 1;
		for (i = 0; i < arr.length; i++) {
			time += arr[i];
			if (time > mid) {
				noofpainter++;
				time = arr[i];
			}
		}
		return noofpainter;
	}
}

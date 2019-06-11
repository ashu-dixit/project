package programm;
import java.util.Scanner;

public class Rversearray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		for (int val : reverse(takeinput())) {
			System.out.println(val);
		}
	}

	public static int[] reverse(int[] arr) {
		int lo = 0;
		int hi = arr.length-1;
		while (lo <= hi) {
			int temp = arr[lo];
			arr[lo] = arr[hi];
			arr[hi] = temp;

			lo++;
			hi--;

		}
		return arr;
	}

	public static int[] takeinput() {
		System.out.println("enter number terms in array");
		int n = scn.nextInt();
		System.out.println("Enter number of array");
		int[] arr = new int[5];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;
	}
}

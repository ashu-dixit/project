package programm;

import java.util.ArrayList;
import java.util.Scanner;

public class DeepakAndgirlfriend {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		for (int T = 0; T < t; T++) {
			int[] arr = takeinput();
			sort(arr);
			int m = scn.nextInt();
			printmoney(addprice(arr, m));
			System.out.println();
		}
	}

	public static void sort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		return arr;
	}

	public static ArrayList<Integer> addprice(int[] arr, int m) {
		ArrayList<Integer> sub = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int t = arr[i] + arr[j];
				if (t == m) {
					sub.add(arr[i]);
					sub.add(arr[j]);
				}
			}
		}
		return sub;
	}

	public static void printmoney(ArrayList<Integer> sub) {
		int min = sub.get(1) - sub.get(0);
		for (int i = 2; i < sub.size() - 1; i += 2) {
			if (min > sub.get(i + 1) - sub.get(i))
				min = sub.get(i + 1) - sub.get(i);
		}
		for (int i = 0; i < sub.size() - 1; i += 2) {
			if (min == sub.get(i + 1) - sub.get(i)) {
				System.out.println("Deepak should buy roses whose prices are " + sub.get(i) + " and " + sub.get(i + 1)+".");
				break;
			}
		}

	}

}

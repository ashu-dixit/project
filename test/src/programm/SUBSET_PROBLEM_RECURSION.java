package programm;

import java.util.ArrayList;
import java.util.Scanner;

public class SUBSET_PROBLEM_RECURSION {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeinput();
		int t = scn.nextInt();
		ArrayList<Integer> r = new ArrayList<>();
		System.out.println(print(arr, 0, t, r,0));
		printv(arr, 0, t, r, 0);
	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static int print(int[] arr, int sum, int t, ArrayList<Integer> r,int j) {
		if (sum == t) {
			/*for (int val : r) {
				System.out.print(arr[val]);
				
			}
			System.out.println();
			*/if(r.size()!=0)
			r.remove(r.size() - 1);
			return 1;
		}
		if (sum > t) {
			if(r.size()!=0)
			r.remove(r.size() - 1);
			return 0;

		}

		int n = 0;
		for (int i = j; i < arr.length; i++) {
			r.add(i);
			n += print(arr, sum + arr[i], t, r,i+1);
		}
		if(r.size()!=0)
		r.remove(r.size()-1);
		return n;
	}
	public static void printv(int[] arr, int sum, int t, ArrayList<Integer> r,int j) {
		if (sum == t) {
			for (int val : r) {
				System.out.print(arr[val]);
				
			}
			System.out.println();
			if(r.size()!=0)
			r.remove(r.size() - 1);
			return;
		}
		if (sum > t) {
			if(r.size()!=0)
			r.remove(r.size() - 1);
			return;

		}

		for (int i = j; i < arr.length; i++) {
			r.add(i);
			printv(arr, sum + arr[i], t, r,i+1);
		}
		if(r.size()!=0)
		r.remove(r.size()-1);
		return ;
	}
}

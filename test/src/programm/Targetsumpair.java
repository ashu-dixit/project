package programm;

import java.util.Scanner;

public class Targetsumpair {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int[] arr = takeinput();
		int target = scn.nextInt();
		sort(arr);
		printnumber(arr, target);
	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		return arr;
	}
	public static void sort(int[] arr) {
		
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	public static void printnumber(int[] arr, int target) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int t = arr[i] + arr[j];
				if (t == target)
					System.out.println(arr[i] + " and " + arr[j]);
			}
		}

	}

}

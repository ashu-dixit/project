package practice_at_home;

import java.util.Scanner;

public class selectionsort {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		selectionsort(takeinput());
	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
		}
		return a;
	}

	public static void selectionsort(int arr[]) {
		for (int count = 0; count < arr.length; count++) {
			int min = count;
			for (int j = count; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[count];
			arr[count] = temp;
		}
		
		for(int a:arr) {
			System.out.println(a);
		}
		
	}
}

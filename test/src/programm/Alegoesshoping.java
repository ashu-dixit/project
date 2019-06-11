package programm;

import java.util.Scanner;

public class Alegoesshoping {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		name(takeinput());
	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		return arr;
	}

	public static void name(int[] arr) {
		int q = scn.nextInt();
		for (int i = 0; i < q; i++) {
			int money = scn.nextInt();
			int item = scn.nextInt();
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (money % arr[j] == 0) {
					count++;
				}
				if(count==item)
					break;
			}
			if (count == item)
				System.out.println("Yes");
			else
				System.out.println("No");

		}

	}
}

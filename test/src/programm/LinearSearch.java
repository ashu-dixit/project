
package programm;
import java.util.Scanner;

public class LinearSearch {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		if (linearsearch(takeinput()) == -1)
			System.out.println("number is not present");
		else
			System.out.println("number found at" + linearsearch(takeinput()));
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

	public static int linearsearch(int[] arr) {
		System.out.println("Enter number to search");
		int notosearch = scn.nextInt();
		int i = 0;
		int flag = 0;
		while (i < arr.length) {
			if (notosearch == arr[i]) {
				return i;
			}

			i++;
		}

		return -1;

	}

}

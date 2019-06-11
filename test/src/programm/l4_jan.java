package programm;
import java.util.Scanner;

public class l4_jan {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(findmax(takeinput()));

	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] arr = null;
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static int findmax(int[] arr) {
		int max = arr[0];
		int i = 0;
		while (i < arr.length) {
			if (max < arr[i])
				max = arr[i];
			
			i++;
		}
		return max;

	}
}

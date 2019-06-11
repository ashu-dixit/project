package L_1_12_2018;

import java.util.Scanner;

public class TwoDarray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		display(Takeinput());

	}

	public static int[][] Takeinput() {

		System.out.println("row?");
		int rows = scn.nextInt();
		int[][] arr = new int[rows][];
		for (int row = 0; row < rows; row++) {
			System.out.println("cols?");
			int cols = scn.nextInt();
			arr[row] = new int[cols];
			/*arr[row][cols];
			arr = new int[rows][col];*/
			for (int col = 0; col < cols; col++) {
				System.out.println("[" + row + "-" + col + "] ?");
				arr[row][col] = scn.nextInt();
			}
		}
		return arr;
	}

	public static void display(int[][] arr) {
		for (int[] val : arr) {
			for (int a : val) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
}

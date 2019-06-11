package programm;

import java.util.Scanner;

public class PRINTCLOCKWISESPIRAL {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		printspiral(takeinput());

	}

	public static int[][] takeinput() {
		int row = scn.nextInt();
		int col = scn.nextInt();
		int[][] arr = new int[row][col];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}

	public static void printspiral(int[][] arr) {
		int r = arr.length;
		int c = arr[0].length;
		int maxrow = r - 1;
		int minrow = 0;
		int maxcol = c - 1;
		int mincol = 0;
		int count = 0;
		while (count < c * r) {

			for (int i = mincol; i <= maxcol && count < c * r; i++) {
				System.out.print(arr[minrow][i] + ", ");
				count++;
			}
			minrow++;
			for (int i = minrow; i <= maxrow && count < c * r; i++) {
				System.out.print(arr[i][maxcol] + ", ");
				count++;
			}
			maxcol--;
			for (int i = maxcol; i >= mincol && count < c * r; i--) {
				System.out.print(arr[maxrow][i] + ", ");
				count++;
			}
			maxrow--;
			for (int i = maxrow; i >= minrow && count < c * r; i--) {
				System.out.print(arr[i][mincol] + ", ");
				count++;
			}
			mincol++;

			
		}

		System.out.println("end");
	}
}

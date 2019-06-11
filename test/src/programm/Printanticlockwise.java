package programm;

import java.util.Scanner;

public class Printanticlockwise {
static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
		print(takeinput());

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
	public static void print(int[][] arr) {
		int minrow = 0;
		int maxcol = arr[0].length - 1;
		int maxrow = arr.length - 1;
		int mincol = 0;
		int count = 0;
		int m= arr.length * arr[0].length;
		while (count < m) {
			for (int i = minrow; count < m && i <= maxrow; i++) {
				System.out.print(arr[i][mincol] + " ");
				count++;
			}
		mincol++;
		for (int i = mincol; count <m && i <= maxcol; i++) {
			System.out.print(arr[maxrow][i] + " ");
			count++;
		}
		maxrow--;
		for (int i = maxrow; count <m && i >= minrow; i--) {
			System.out.print(arr[i][maxcol] + " ");
			count++;
		}
		maxcol--;
		for (int i = maxcol; count <m&&i >= mincol; i--) {
			System.out.print(arr[minrow][i] + " ");
			count++;
		}
		minrow++;
		}

	}
}

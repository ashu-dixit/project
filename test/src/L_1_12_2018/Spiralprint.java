package L_1_12_2018;

public class Spiralprint {

	public static void main(String[] args) {
		int[][] arr = { { 01, 02, 03, 04, 05 }, 
						{ 06, 07,  8,  9, 10 }, 
						{ 11, 12, 13, 14, 15 }, 
						{ 16, 17, 18, 19, 20 } };
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

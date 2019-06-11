package L_1_12_2018;

public class Matrixmultiplication {

	public static void main(String[] args) {
		int[][] one = { { 1, 2, 3 }, { 4, 5, 6 }, { 10, 11, 12 } };
		int[][] two = { { 7 }, { 8 }, { 9 } };

		int c1 = one[0].length;
		int r2 = two.length;
		int r1 = one.length;
		int c2 = two[0].length;
		if (c1 != r2)
			System.out.println("multiplication not possible");
		int[][] arr = new int[r1][c2];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				int sum = 0;
				for (int k = 0; k < r1; k++) {
					sum += one[i][k] * two[k][j];
				}
				arr[i][j] = sum;
			}
		}

		for (int[] val : arr) {
			for (int b : val) {
				System.out.print(b + " ");
			}
		}

	}

}

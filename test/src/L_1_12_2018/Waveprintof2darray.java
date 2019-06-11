package L_1_12_2018;

import java.util.Scanner;

public class Waveprintof2darray {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr = Takeinput();
		int j = 0;
		for (int i = 0; i <arr[0].length; i++) {
			if (i % 2 == 0) {
				for(j = 0;j<arr.length;j++) {
					System.out.print(arr[j][i] + " ");	
				}
			} else {
				for(j =arr[i].length;j>=0;j--) {
					System.out.print(arr[j][i] + " ");	
				}
			}}
			/*while (true) {
				System.out.print(arr[j][i] + " ");
				if (i % 2 == 0) {
					j++;
					if (j == arr.length)
						break;
				} else {
					j--;
					if (j == -1)
						break;
				}
			}
*/
		

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

}

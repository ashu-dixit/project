package programm;

import java.util.Scanner;

public class Patterntriangle {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int rowno = 1;
		int nsp = rows - 1;
		int nd = 1;
		int num = 0;
		while (rowno <= rows) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" 	");
				csp++;
			}
			int cd = 1;
			while (cd <= nd / 2 + 1) {
				num++;
				System.out.print(num+"	");
				cd++;
			}
			while (cd <= nd) {
				num--;
				System.out.print(num+"	");
				cd++;
			}
			nd += 2;
			nsp--;
			System.out.println();
			rowno++;
		}

	}

}

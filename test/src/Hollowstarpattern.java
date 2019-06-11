
import java.util.Scanner;

public class Hollowstarpattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int rowno = 1;
		int nsp = 1;
		int nst1 = rows / 2;
		while (rowno <= rows) {
			int cst = 1;
			if (rowno == 1 || rowno == rows) {
				while (cst <= rows) {
					System.out.print("*");
					cst++;
				}
				System.out.println();
			} else {

				cst = 1;
				while (cst <= nst1) {
					System.out.print("*");
					cst++;
				}
				int csp = 1;
				while (csp <= nsp) {
					System.out.print(" ");
					csp++;
				}
				cst = 1;
				while (cst <= nst1) {
					System.out.print("*");
					cst++;
				}

				if (rowno <= rows / 2 ) {
					nsp += 2;
					nst1--;
				} else {
					nsp -= 2;
					nst1++;
				}

			System.out.println();	
			}
			rowno++;
			
		}
	}
}

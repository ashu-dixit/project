package test;

public class Pyramidpattern {

	public static void main(String[] args) {
		int n = 5;
		int nsp = n - 1;
		int nst = 1;
		int row = 1;

		while (row <= n) {
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp = csp + 1;
			}
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst = cst + 1;
			}
			System.out.println();
			row = row + 1;
			nst = nst + 2;
			nsp = nsp - 1;
		}

	}

}

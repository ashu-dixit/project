package programm;

import java.util.Scanner;

public class Patternmountain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int rowno = 1;
		int nsd = 1;
		int num = 0;
		int nsp = 2*rows - 3;
		while (rowno <= rows) {
			int csd = 1;
			num = 0;
			while (csd <= nsd) {
				num++;
				System.out.print(num+"	");
				csd++;
			}
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" 	");
				csp++;
			}
			csd = 1;
			if(rowno==rows)
				num--;
			while (csd <= nsd) {
				if(num==0)
					break;
				
				System.out.print(num+"	");
				num--;
				
				
				csd++;
			}

			nsp -= 2;
			nsd++;

			System.out.println();
			rowno++;
		}
	}

}

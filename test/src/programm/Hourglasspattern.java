package programm;

import java.util.Scanner;

public class Hourglasspattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int rowno = 1;
		int nd = 2 * rows + 1;
		int num;
		int nsp=0;
		int num2=rows;
		while (rowno <= 2*rows+1) {
			int cd = 1;
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			num=num2;
			while (cd <= nd) {
				System.out.print(num);
				if (cd <nd/2+1)
					num--;
				else
					num++;
				cd++;
			}
			if(rowno<=rows) {
				nsp++;
				nd-=2;
				num2--;
			}
			else {
				nsp--;
				nd+=2;
				num2++;
			}
			
			System.out.println();
			rowno++;
		}
	}

}

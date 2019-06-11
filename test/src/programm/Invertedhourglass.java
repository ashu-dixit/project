package programm;

import java.util.Scanner;

public class Invertedhourglass {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int rowno = 0;
		int num = rows + 1;
		int nd = 1;
		int nsp=2*rows-1;
		while (rowno <= 2*rows+1) {
			int cd = 1;
			while (cd <= nd) {
				num--;
				System.out.print(num+" ");
				cd++;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.print("  ");
			csp++;
			}
			cd=1;
			if(rowno==rows) {
				num++;
				cd=2;
				}
			while (cd <= nd) {
		
				System.out.print(num+" ");
				
				num++;
				cd++;
			}
			if(rowno<rows) {
				nsp-=2;
				nd++;
			}else {
				nsp+=2;
				nd--;
			}
			System.out.println();
			rowno++;
		}

	}

}

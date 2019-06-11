package programm;

import java.util.Scanner;

public class MirrorStarpattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int rowno = 1;
		int nsp=rows/2;
		int nst=1;
		while(rowno<=rows) {
			int csp=1;
			
			while(csp<=nsp) {
				System.out.print("  ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print("* ");
				cst++;
			}
			System.out.println();
			if(rowno<=rows/2) { 
				
				nsp--;
				nst+=2;
		}
			else {
				
				nsp=nsp+1;
				nst-=2;
			}
			rowno++;
			
		}
	
	}

}

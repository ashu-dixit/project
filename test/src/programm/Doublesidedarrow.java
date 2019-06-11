package programm;

import java.util.Scanner;

public class Doublesidedarrow {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int rows=scn.nextInt();
		int rowno=1;
		int nd=1;
		int nsp1=rows-1;
		int num=0;
		int nsp2=0;
		int num2=2;
		while(rowno<=rows) {
			int csp=1;
			while(csp<=nsp1) {
				System.out.print("  ");
				csp++;
			}
			int cd=1;
			num=num2;
			while(cd<=nd) {
				num--;
				System.out.print(num+" ");
				cd++;
			}
			csp=1;
			while(csp<nsp2) {
				System.out.print("  ");
				csp++;
			}
			cd=1;
			if(rowno!=1&&rowno!=rows) {
			while(cd<=nd) {
				System.out.print(num+" ");
				num++;
				cd++;
			}
			}
			System.out.println();
			if(rowno<=rows/2) {
			nsp1-=2;
			nsp2+=2;
			nd++;
			num2++;
			}else {
				nsp1+=2;
				nsp2-=2;
				nd--;
				num2--;
			}
			
			rowno++;
		}
	}

}

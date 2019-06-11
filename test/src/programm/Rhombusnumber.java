package programm;

import java.util.Scanner;

public class Rhombusnumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int rows = scn.nextInt();
		int rowno = 1;
		int nsp = rows - 1;
		int nsd = 1;
		int num;
		int num2=0;
		while(rowno<=2*rows-1) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print("	");
				csp++;
			}
			int csd=1;
			num=num2;
			while(csd<=nsd/2+1) {
				num++;
				System.out.print(num+"	");
				csd++;
				
			}
			while(csd<=nsd) {
				num--;
				System.out.print(num+"	");
				csd++;
				
			}
			if(rowno<rows) {
			nsp--;
			nsd+=2;
			num2++;
			}else {
				nsp++;
				nsd-=2;
				num2--;
			}
			
			
			
			
			
			
			
			System.out.println();
			rowno++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int num ;
		int num2 = 1;
		System.out.println(num2);
		while (rowno <= 2 * rows - 1) {
			int csp = 1;

			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			int csd = 1;
			num = num2;
			while (csd <= nsd / 2 + 1) {
				System.out.print(num);
				csd++;
				num++;
			}
			while (csd > nsd / 2) {
				num--;
				System.out.print(num);
				csd++;
			}
			if (rowno < rows) {
				nsp--;
				nsd += 2;
				num2++;
			} else {
				nsp++;
				nsd -= 2;
				num2--;
			}
			
			rowno++;
			System.out.println();
		}
*/
	}

}

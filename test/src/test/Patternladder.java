package test;

import java.util.Scanner;

public class Patternladder {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int num=1;
		int row = 1;
		int n = scn.nextInt();
		while(row<=n) {
			int digit = 1;
			while(digit<=row) {
				System.out.print(num+"	");
				num=num+1;
				digit=digit+1;
			}
			
			System.out.println();
			row=row+1;
					
		}

	}

}

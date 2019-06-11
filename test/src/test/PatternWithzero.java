package test;

import java.util.Scanner;

public class PatternWithzero {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int row=1;
		int noofrow=scn.nextInt();
		int digit=1;
		int zero=0;
		int nzero=0;
		while(row<=noofrow) {
			if(row!=1)
			System.out.print(digit+"	");
			int count=0;
			while(count<row-2) {
			System.out.print(zero+"	");
				count=count+1;
				
			}
			System.out.print(digit);
			System.out.println();
			row=row+1;
			digit=digit+1;
		}
		

	}

}

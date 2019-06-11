package test;

import java.util.Scanner;

public class Fibbonacipattern {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		int f1=0,f2=1;
		int f3=0;
		int row =1;
		int nrow=scn.nextInt();
		
		while(row<=nrow) {
			int ndigi=0;
			while(ndigi<row) {
			f3=f3+f1;
			f1=f2;
			f2=f3;
			System.out.printf("%3d	",f3);
			ndigi++;
			}
			System.out.println();
			row++;
			
		}

	}

}

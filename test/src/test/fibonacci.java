package test;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter number of terms to print");
		int n = scn.nextInt();
		int count = 1 ,f1=0,f2=1,f3=0;
		if(n==0) {
			System.out.println(f1);
		}
		else {
		while(count<=n-1) {
			
			f3=f1+f2;
			f1=f2;
			f2=f3;
			
			count = count +1;
		}
		System.out.println(f2);
		}
	}

}

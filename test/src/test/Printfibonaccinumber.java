package test;

import java.util.Scanner;

public class Printfibonaccinumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = 0, b = 1;
		int sum=0;
		int num = scn.nextInt();
		if(num==0)
			System.out.println(a);
		else {
		while (true) {
			if(sum<=num) 
				System.out.println(sum);
			else
				break;
			sum = a + b;
			b = a;
			a = sum;
			
		}
		}
	}

}


package test;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner Scn = new Scanner(System.in);
		int a= Scn.nextInt();
		int b=Scn.nextInt();
		int rem;
		
		while(a%b!=0) {
			
			rem=a%b;
			a=b;
			b=rem;
			
		}
		
		System.out.println(b);
	}

	
	
	

}

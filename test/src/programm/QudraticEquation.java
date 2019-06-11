package programm;

import java.util.Scanner;

public class QudraticEquation {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int D=b*b-4*a*c;
				if(D<0) {
					System.out.print("Imaginary ");
				}
				else if(D>0) {
					System.out.println("Real and distinct");
					System.out.println((-b+(int)Math.sqrt(D))/2+" "+(-b-(int)Math.sqrt(D))/2);
				}
				else {
					System.out.println("Real and equal");
				System.out.println((-b+(int)Math.sqrt(D))/2);
				}
	}

}

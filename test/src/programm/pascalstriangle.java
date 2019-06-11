package programm;

import java.util.Scanner;

public class pascalstriangle {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		printpattern(n);
	}
public static int[] printpattern(int n) {
	if(n==1) {
		int[] br= new int[1];
		br[0]=1;
		for(int val:br)
			System.out.print(val);
		return br;
	}
	int[] rr =printpattern(n-1);
	int[] mr=new int[rr.length+1];
	mr[0]=1;
	mr[rr.length]=1;
	for(int i=1;i<mr.length-1;i++) {
		mr[i]=rr[i-1]+rr[i];
	}
	System.out.println();
	for(int val:mr)
		System.out.print(val+"	");
	return mr;
}
}

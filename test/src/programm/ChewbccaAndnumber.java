package programm;

import java.util.Scanner;

public class ChewbccaAndnumber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		System.out.println(invertno(num));

	}

public static long invertno(long num) {
	long no=num;
	int p=0;
	while(no!=0) {
		long rem =no%10;
		long inv=9-rem;
		
		if(rem>inv) {
			num=num-rem*(long)Math.pow(10, p)+inv*(long)Math.pow(10,p);
		if(no<=9&&rem==9)
		    	num=num-inv*(long)Math.pow(10, p)+rem*(long)Math.pow(10,p);
		}
		p++;
		no/=10;
	}
	return num;
}
}

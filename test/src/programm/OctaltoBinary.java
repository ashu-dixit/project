package programm;

import java.util.Scanner;

public class OctaltoBinary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int octal = scn.nextInt();
		System.out.println(decitobinary(octaltodecimal(octal)));

	}

	public static int octaltodecimal(int octal) {
		int deci = 0;
		int i = 0;
		while (octal != 0) {
			deci = deci +(octal % 10)*(int) Math.pow(8, i); 
			i++;
			octal/=10;
		}
		return deci;
	}
	public static int decitobinary(int deci) {
		int bina = 0;
		int i = 0;
		while (deci != 0) {
			bina = bina +(deci % 2)*(int) Math.pow(10, i); 
			i++;
			deci/=2;
		}
		return bina;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public static long octaltobinary(long octal, long noofdigit) {
		long binary = 0;
		while (octal != 0) {

			long rem = octal / (long) Math.pow(10, noofdigit - 1);
			long rem2 = rem;
			long bin = 0;
			int i = 0;
			while (rem != 0) {
				bin = bin + (rem % 2) * (long) Math.pow(10, i);
				i++;
				rem /= 2;
			}
			octal = octal - rem2 * (long) Math.pow(10, noofdigit - 1);
				binary = binary + bin;
			if(octal!=0)
				binary*=1000;
			noofdigit--;
		}

		return binary;
	}

	public static long countdigit(long octal) {
		long count = 0;
		while (octal != 0) {
			count++;
			octal /= 10;
		}
		return count;
	}
	
*/
	/*
	 * public static long octaltobinary(long octal) { long binary = 0;
	 * 
	 * while (octal != 0) { long rem=octal%10; long i = 0; long bin=0; while(rem!=0)
	 * { bin=bin+(rem%2)*(long)Math.pow(10, i); i++; rem/=2; } binary=binary+bin;
	 * octal/=10; if(octal!=0) binary=binary*1000;
	 * 
	 * } return binary; }
	 */

}
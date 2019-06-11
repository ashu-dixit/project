package programm;

import java.util.Scanner;

public class Inverseofnumber {
	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(inverse(n));
	}
	
	
	
	public static int inverse(int n) {
		int rem=0;
		int num=0;
		int i=1;
		while(n!=0) {
			rem=n%10;
			num=num+i*(int)Math.pow(10, rem-1);
			i++;
			n/=10;
		}
		
		return num;
	}
}

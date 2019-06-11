package programm;

import java.util.Scanner;

public class SUM_OF_THE_DIGITS {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int num=scn.nextInt();
		System.out.println(sum(num,0));

	}
	
public static int sum(int num,int sum) {
	if(num==0)
		return sum;
	
	sum=sum+num%10;
	num/=10;
	int a=sum(num,sum);
	return a;
}
}

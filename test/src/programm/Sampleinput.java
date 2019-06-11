package programm;

import java.util.Scanner;

public class Sampleinput {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int sum=0;
		int a=scn.nextInt();
		while(sum>=0) {
			System.out.println(a);
			a=scn.nextInt();
			
			sum=sum+a;
			
		}

	}

}

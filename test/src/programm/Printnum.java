package programm;

import java.util.Scanner;

public class Printnum {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int numofterm=scn.nextInt();
		int multipnum=scn.nextInt();
		int count=1;
		int n=1;
		while(count<=numofterm) {
			
			if((3*n+2)%multipnum!=0) {
				System.out.println(3*n+2);
				
				count++;
			}
			n++;
		}

	}

}

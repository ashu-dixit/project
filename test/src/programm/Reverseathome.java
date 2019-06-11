package programm;

import java.util.Scanner;

public class Reverseathome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		int count = 1, rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num /= 10;
		}
		
		System.out.println(rev);
	}

}

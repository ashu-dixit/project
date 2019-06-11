package programm;

import java.util.Scanner;

public class Binarytodecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int binary = scn.nextInt();
		System.out.println(binarytodecimal(binary));

	}

	public static int binarytodecimal(int bina) {
		int dec = 0;
		int i = 0;
		while (bina != 0) {
			dec = dec +(bina % 10)*(int) Math.pow(2, i); 
			i++;
			bina/=10;
		}
		return dec;
	}

}

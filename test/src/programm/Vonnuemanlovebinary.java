package programm;

import java.util.Scanner;

public class Vonnuemanlovebinary {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		for(int i=1;i<=n;i++) {
		long binary = scn.nextInt();
		System.out.println(binarytodecimal(binary));
		}
	}

	public static long binarytodecimal(long bina) {
		int dec = 0;
		int i = 0;
		while (bina != 0) {
			dec = (int)(dec +(bina % 10)*(int) Math.pow(2, i)); 
			i++;
			bina/=10;
		}
		return dec;
	}

}



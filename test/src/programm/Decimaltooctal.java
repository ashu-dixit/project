package programm;

import java.util.Scanner;

public class Decimaltooctal {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int decimal = scn.nextInt();
	System.out.println(decimaltooctal(decimal));

}

public static int decimaltooctal(int deci) {
	int octal = 0;
	int i = 0;
	while (deci != 0) {
		octal = octal +(deci % 8)*(int) Math.pow(10, i); 
		i++;
		deci/=8;
	}
	return octal;
}
}

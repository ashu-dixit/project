package test;

import java.util.Scanner;

/*Take the following as input.
A number
A digit
Write a function that returns the number of times digit is found in the number. Print the value returned.*/
public class CountingNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int number = scn.nextInt();
		int digit = scn.nextInt();
		int count = 0;
		while (number != 0) {
			if (number % 10 == digit) {
				count = count + 1;
			}
			number = number / 10;
		}
		System.out.println(count);
	}

}

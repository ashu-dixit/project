package programm;

import java.util.Scanner;

public class Primeathome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int prime = scn.nextInt();
		int count = 1;
		int factor = 0;
		while (count <= prime) {
			if (prime % count == 0) {
				factor = factor + 1;
			}
			count = count + 1;

		}
		if (factor == 2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}

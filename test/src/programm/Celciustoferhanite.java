package programm;

import java.util.Scanner;

public class Celciustoferhanite {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int c;
		int f;

		int i;
		for (i = 0; i <= 100; i++) {
			f = scn.nextInt();
			c = (int) (5.0 / 9 * (f - 32));
			System.out.println(c);

		}
	}

}
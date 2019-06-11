package programm;

import java.util.Scanner;

public class BasicCalculators {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		int a, b;
		while (ch != 'x' && ch != 'X') {
			if (ch == '*') {
				a = scn.nextInt();
				b = scn.nextInt();
				System.out.println(a * b);
			} else if (ch == '/') {
				a = scn.nextInt();
				b = scn.nextInt();
				System.out.println(a / b);
			} else if (ch == '+') {
				a = scn.nextInt();
				b = scn.nextInt();
				System.out.println(a + b);
			} else if (ch == '-') {
				a = scn.nextInt();
				b = scn.nextInt();
				System.out.println(a - b);}
			else if (ch == '%') {
				a = scn.nextInt();
				b = scn.nextInt();
				System.out.println(a % b);
			}
			else {
				System.out.println("Invalid operation. Try again.");
			}
			ch = scn.next().charAt(0);
		}
		
	}
}

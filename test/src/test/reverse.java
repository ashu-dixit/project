package test;

public class reverse {

	public static void main(String[] args) {
		int n = 4389438;
		int rem = 0;
		int count = 1;

		while (n != 0) {
			rem = rem * 10 + n % 10;

			count = count + 1;
			n = n / 10;
		}
		System.out.println("Reverse is " + rem);
	}
}

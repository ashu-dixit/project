package l_2_10_19;

import java.util.Arrays;

public class PrintprimeSOE {

	public static void main(String[] args) {
		printprime(25);

	}

	public static void printprime(int n) {

		boolean[] prime = new boolean[n];
		Arrays.fill(prime, true);
		prime[0] = false;
		prime[1] = false;
		for (int table = 2; table * table <= n; table++) {
			if (prime[table] == false)
				continue;
			for (int mul = 2; mul * table < n; mul++) {
				prime[mul * table] = false;

			}

		}

		for (int i = 0; i < prime.length; i++) {
			if (prime[i]) {
				System.out.println(i);
			}
		}
	}
}

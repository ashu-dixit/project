package l_2_10_19;

public class power {
	public static void main(String[] args) {

		System.out.println(pow(2, 8));
	}

	public static int pow(int x, int n) {
		if (n == 1) {
			return x;
		}

		int a = pow(x, n / 2);

		if (n % 2 == 0)
			return a * a;
		else
			return a * a * x;

	}
}

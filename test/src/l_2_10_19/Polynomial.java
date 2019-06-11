package l_2_10_19;

public class Polynomial {

	public static void main(String[] args) {
		polysum(3, 6, 1, 0);
		System.out.println(polysum(3, 6));
	}

	public static void polysum(int x, int n, int xn, int sum) {
		if (n == 0) {
			System.out.println(sum);
			return;
		}
		xn = xn * x;
		sum += n * xn;
		polysum(x, n - 1, xn, sum);

	}

	public static int polysum(int x, int n) {
		int sum = 0;
		int xn = x;
		for (int i = n; i >= 0; i--) {
			sum += i * xn;
			xn *= x;
		}
		return sum;

	}
}

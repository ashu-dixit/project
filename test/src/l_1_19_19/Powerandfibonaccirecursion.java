package l_1_19_19;

public class Powerandfibonaccirecursion {

	public static void main(String[] args) {
		System.out.println(pow(2, 30));
		System.out.println(fibo(200));
	}

	public static int pow(int n, int pow) {
		//base case
		if (pow == 0) {
			return 1;
		}
		// smaller work
		int num = pow(n, pow - 1);
		// self work
		int p = n * num;
		return p;
	}

	public static int fibo(int n) {
		//base case
		if (n == 1) {
			return 0;
		}
		if (n == 2)
			return 1;
		// smaller work
		int fn = fibo(n - 2) + fibo(n - 1);
		// self work
		int p = fn;

		return p;
	}
	
}

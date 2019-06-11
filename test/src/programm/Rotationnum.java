package programm;
public class Rotationnum {
	public static void main(String[] args) {
		System.out.println(rotate(12345, 3));

	}

	public static int rotate(int num, int n) {
		int rotat;
		int p;
		int divisor=num /(int) Math.pow(10, n);
		p = num %(int) Math.pow(10, n);
		rotat = divisor + p * (int)Math.pow(10, noofdigit(divisor));

		return rotat;
	}

	public static int noofdigit(int n) {
		int count = 0;
		while (n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}

}

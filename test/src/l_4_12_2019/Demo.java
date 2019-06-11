package l_4_12_2019;

public class Demo {

	public static void main(String[] args) {
		System.out.println(add(1,2,3,4));
	}

	// variable number of argument
	// variable should be in last
	public static int add(int... arr) {
		int sum = 0;

		for (int val : arr) {
			sum += val;
		}
		return sum;
	}

}

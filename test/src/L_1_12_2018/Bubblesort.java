package L_1_12_2018;

public class Bubblesort {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 4 };
		int n = arr.length;
		for (int counter = 0; counter < n - 1; counter++) {
			for (int j = 0; j < n - counter - 1; j++) {
				if (arr[j + 1] < arr[j]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int val : arr) {
			System.out.println(val);
		}
	}

}

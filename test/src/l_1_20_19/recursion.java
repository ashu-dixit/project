package l_1_20_19;

public class recursion {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 34, 23, 4, 2, 2, 3, 5 };
		for (int val : alloccurrenc(arr, 0, 2, 0)) {
			System.out.println(val);
		}
		System.out.println(arr[max(arr, 0, 0)]);
	}

	public static int[] alloccurrenc(int[] arr, int vidx, int n, int count) {
		if (vidx == arr.length) {
			int[] a = new int[count];
			return a;
		}
		if (arr[vidx] == n) {
			count++;
		}
		int[] a = alloccurrenc(arr, vidx + 1, n, count);
		if (arr[vidx] == n) {
			count--;
			a[count] = vidx;
		}
		return a;
	}

	public static int max(int[] arr, int vidx, int max) {

		if (vidx == arr.length)
			return max;
		if (arr[vidx] > arr[max]) {
			max = vidx;
		}
		int val = max(arr, vidx + 1, max);
		return val;
	}

}

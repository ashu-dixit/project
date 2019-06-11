package l_2_10_19;

public class Recursion_sorting {

	public static void main(String[] args) {
		int[] arr = { 1, 6, 4, 7, 3, 7, 89, 43, 43, 67 };
		int[] ans = divideandconquer(arr, 0, arr.length - 1);
		/*for (int val : ans) {
			System.out.println(val);
		}*/
		System.out.println("---------------------");
		quicksort(arr, 0, arr.length-1);
		
		for (int val : arr) {
			System.out.println(val);
		}

	}

	public static int[] mergetwosortedarrays(int[] one, int[] two) {
		int[] merge = new int[one.length + two.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				merge[k] = one[i];
				k++;
				i++;
			} else {
				merge[k] = two[j];
				j++;
				k++;
			}
		}
		if (i == one.length) {
			while (j < two.length) {
				merge[k] = two[j];
				j++;
				k++;
			}
		}
		if (j == two.length) {
			while (i < one.length) {
				merge[k] = one[i];
				i++;
				k++;
			}
		}
		return merge;
	}

	public static int[] divideandconquer(int[] arr, int lo, int hi) {
		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (hi + lo) / 2;
		int[] lh = divideandconquer(arr, lo, mid);
		int[] uh = divideandconquer(arr, mid + 1, hi);

		int[] sorted = mergetwosortedarrays(lh, uh);

		return sorted;

	}

	public static void quicksort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}

		int mid = (lo + hi) / 2;
		int pivot = arr[mid];
		int left = lo;
		int right = hi;

		while (left <= right) {

			while (arr[left] < pivot) {

				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}
			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}
		quicksort(arr, lo, right);
		quicksort(arr, left, hi);
	}

}

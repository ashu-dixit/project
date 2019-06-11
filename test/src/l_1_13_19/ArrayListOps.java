package l_1_13_19;

import java.util.ArrayList;

public class ArrayListOps {

	public static void main(String[] args) {
		System.out.print(Intersection());
		System.out.print(Sum());
	}

	public static ArrayList<Integer> Intersection() {
		int[] arr = { 5, 5, 10, 10, 20, 25, 25, 25, 30 };
		int[] arr2 = { 3, 5, 5, 5, 10, 10, 10, 25, 25, 25, 25 };
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0, j = 0; i < arr.length && j < arr2.length;) {
			if (arr[i] == arr2[j]) {
				ans.add(arr[i]);
				i++;
				j++;

			} else if (arr[i] > arr2[j]) {
				j++;
			} else
				i++;
		}
		return ans;
	}

/*	public static ArrayList<Integer> Sum2() {
		int[] arr = { 5, 5, 10, 10, 20, 25, 25, 25, 30 };
		int[] arr2 = { 3, 5, 5, 5, 10, 10, 10, 25, 25, 25, 25 };
		ArrayList<Integer> ans = new ArrayList<>();
		if (arr.length > arr2.length) {
			for (int i = arr.length - 1, j = arr2.length - 1; i >= 0 && j >= 0; i--, j--) {
				rem = (arr[i] + arr2[j]) / 10;
				ans.add((arr[i] + arr2[j]) % 10);
			}
		} else {
			for (int i = arr.length, j = arr2.length; i >= 0 && j >= 0; i--, j--) {
				ans.add(arr[i] + arr2[j]);

			}
		}
		return ans;
	}*/

public static ArrayList<Integer> Sum() {
	int[] arr = {9,9,8,6 };
	int[] arr2 = { 9,9 };
	ArrayList<Integer> ans = new ArrayList<>();
		int i=arr.length-1;
		int j=arr2.length-1;
		int sum=0;
				int carry=0;
		while(i>=0||j>=0) {
			sum=carry;
			if(i>=0) {
				sum+=arr[i];
			}
			if(j>=0) {
				sum+=arr2[j];
			}
			ans.add(0,sum%10);
			carry=sum/10;
			
			i--;
			j--;
		}
		if(carry!=0)
			ans.add(0,carry);
		return ans;
}
}
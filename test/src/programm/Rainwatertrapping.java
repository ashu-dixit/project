package programm;

import java.util.Scanner;

public class Rainwatertrapping {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println(volumeofwater());
		int t = scn.nextInt();
		int T = 0;
		while (t > T) {
			System.out.println(volumeofwater());
			T++;
		}
	}

	public static int volumeofwater() {
		int[] arr = takeinput();

		int[] lmh = new int[arr.length];// left most highest
		int[] rmh = new int[arr.length];// right most highest

		int[] vol = new int[arr.length];

		lmh[0] = arr[0];
		rmh[arr.length - 1] = arr[arr.length-1];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > lmh[i - 1]) {
				lmh[i] = arr[i];
			} else {
				lmh[i] = lmh[i - 1];
			}
		}
		for (int j = arr.length - 2; j >= 0; j--) {
			if (arr[j] > rmh[j + 1]) {
				rmh[j] = arr[j];
			} else {
				rmh[j] = rmh[j + 1];
			}

		}

		//add volume
		for (int i = 0; i < arr.length; i++) {
			int min = Math.min(lmh[i], rmh[i]);

			if (arr[i] >= min) {
				vol[i] = 0;
			} else {
				vol[i] = min - arr[i];
			}

		}
		
		
		return sumarr(vol);

	}

	public static int[] takeinput() {
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		return arr;
	}

	public static int sumarr(int[] vol) {

		int sum=0;
		for(int i=0;i<vol.length;i++) {
			sum+=vol[i];
		}
		return sum;
	}
}

package programm;

import java.util.Scanner;

public class Maxsumoathintwoarray {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scn.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scn.nextInt();
			int a = scn.nextInt();
			int[] ar = new int[a];
			int[] arr = new int[n];
			for (int j = 0; j < n; j++)
				arr[j] = scn.nextInt();
			for (int j = 0; j < a; j++)
				ar[j] = scn.nextInt();
			System.out.println(sum(arr, ar));
		}
	}
	public static int sum(int[] arri, int[] arrj) {
		int sum = 0;
		int i = 0;
		int j = 0;
		int sumi = 0;
		int sumj = 0;
		while (true) {
			
			if(i!=arri.length&&j!=arrj.length) {
			if (arri[i] > arrj[j]) {
				sumj = sumj + arrj[j];
				j++;
			}
			else if (arri[i] < arrj[j]) {
				sumi = sumi + arri[i];
				i++;
			}
			else {
				sumj = sumj + arrj[j];
				sumi = sumi + arri[i];
				if (sumj > sumi)
					sum = sum + sumj;
				else
					sum = sum + sumi;
				i++;
				j++;
				sumj = 0;
				sumi = 0;
			}
			}else {
				if(j!=arrj.length) {
					sumj = sumj + arrj[j];
					j++;
				}else if(i!=arri.length) {
					sumi = sumi + arri[i];
					i++;
				}else {
					if (sumj > sumi)
						sum = sum + sumj;
					else
						sum = sum + sumi;
					break;
				}
					
			}
			
			
		}

		return sum;
	}
}

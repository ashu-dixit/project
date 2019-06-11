package programm;

import java.util.Scanner;

public class Calculatethesum {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < arr.length; i++)
			arr[i] = scn.nextLong();
		int q = scn.nextInt();
		System.out.println(Sum(arr, q));
	}

	public static long Sum(long[] arr, long Q) {
		long sum = 0;
		long q = 1;
		long[] a=new long[arr.length];
		
		while (q <= Q) {
			for(int i=0;i<a.length;i++) {
				a[i]=arr[i]%(int)(Math.pow(10, 9)+7);
			}
			long x = scn.nextLong();
			int y = (int)x % arr.length;
			for (int i = 0; i < arr.length; i++) {
				if (i - y < 0)
					arr[i] =(arr[i]+ a[(i + arr.length - y)]) % ((long) Math.pow(10, 9) + 7);
				else
					arr[i] =(arr[i]+ a[(i - y)]) % ((long) Math.pow(10, 9) + 7);
			}
			q++;
		}
		for (int i = 0; i < arr.length; i++)
			sum =(sum + arr[i]) % ((long) Math.pow(10, 9) + 7);
		return sum;
	}
}

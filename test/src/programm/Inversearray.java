package programm;

import java.util.Scanner;

public class Inversearray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		for(int val:inverse(arr))
			System.out.print(val+" ");
	}

	public static int[] inverse(int[] arr) {
		int[] a=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
		a[arr[i]]=i;
		}
		return a;
	}
	
	
	
}

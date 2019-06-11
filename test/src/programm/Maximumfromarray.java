package programm;

import java.util.Scanner;

public class Maximumfromarray {
	static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
		int n=scn.nextInt();
		int[] arr= new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int max=0;
		int i;
		for(i=1;i<arr.length;i++) {
			if(arr[i]>arr[max]) 
				max=i;
		}
		System.out.println(arr[max]);
	}
	}

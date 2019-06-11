package programm;

import java.util.Scanner;

public class NEXT_PERMUTATION {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int t=scn.nextInt();
		for(int i=0;i<t;i++) {
		int[] arr=takeinput(); 
		name(arr);
		}
	}
public static void name(int[] arr) {
	boolean flag = true;
	for(int i=arr.length-1;i>0;i--) {
		if(arr[i]>arr[i-1]) {
			int temp=arr[i];
			arr[i]=arr[i-1];
			arr[i-1]=temp;
			flag = false;
			break;
		}
	}
	for (int counter = 0; counter < arr.length - 1&&flag; counter++) {
		for (int j = 0; j < arr.length - counter - 1; j++) {
			if (arr[j + 1] < arr[j]) {
				int temp = arr[j + 1];
				arr[j + 1] = arr[j];
				arr[j] = temp;

			}
		}
	}
	
	
	for(int val:arr)
		System.out.print(val+" ");
	System.out.println();
}
public static int[] takeinput() {
	int n=scn.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=scn.nextInt();
	return arr;
}
}

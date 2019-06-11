package programm;

import java.util.Scanner;

public class IS_ARRAY_SORTED {
static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {

		if(issorted(takeinput(), 1))
			System.out.println("true");
		else
			System.out.println("false");

	}
	public static int[] takeinput() {
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		return arr;
	}
public static boolean issorted(int[] arr,int vindx) {
	if(vindx==arr.length) {
		return true;
	}
	
	if(arr[vindx-1]>arr[vindx]) {
	return false;
	}
	boolean val=issorted(arr, vindx+1);
	return val;
}
}

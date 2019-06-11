package programm;

import java.util.Scanner;

public class CONTAINED_IN_AN_ARRAY {
	static Scanner scn =new Scanner(System.in);
	static int m;
	public static void main(String[] args) {

		if(ispresent(takeinput(), 0))
			System.out.println("true");
		else
			System.out.println("false");

	}
	public static int[] takeinput() {
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		
		m=scn.nextInt();
		return arr;
	}
public static boolean ispresent(int[] arr,int vindx) {
	if(vindx==arr.length) {
		return false;
	}
	
	if(arr[vindx]==m) {
	return true;
	}
	boolean val=ispresent(arr, vindx+1);
	return val;
}
}

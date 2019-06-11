package programm;

import java.util.Scanner;

public class REVERSE_AN_ARRAY {
static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
		reverse(takeinput(),0);
	}
	public static int[] takeinput() {
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scn.nextInt();
		return arr;
	}
public static void reverse(int[] arr,int vindx) {
	if(vindx==arr.length) {
		return;
	}
	reverse(arr,vindx+1);
	System.out.println(arr[vindx]);
}
}

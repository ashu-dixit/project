package programm;

import java.util.Scanner;

public class Arraylinearsearch {
static Scanner scn=new Scanner(System.in);

	public static void main(String[] args) {
		int n=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int a=scn.nextInt();
		System.out.println(find(a,arr));
	}
public static int find(int a,int arr[]) {
	boolean check=false;
	int i;
	for(i=0;i<arr.length;i++) {
		if(arr[i]==a) {
		 check=true;
		 break;
		}
		
	}
	if(check) {
		return i;
	}else
		return -1;
}
}

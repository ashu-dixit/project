package programm;

import java.util.Scanner;

public class NEXT_SMALLER_OF_NEXT_GREATER {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		int t=scn.nextInt();
		for(int i=0;i<t;i++) {
			int[] arr=takeinput();
			name(arr);
		}
	}
public static void name(int[] arr) {
	int j=0;
	int k=0;
	for(int i=0;i<arr.length;i++) {
		for(j=i+1;j<arr.length;j++) {
			if(arr[j]>arr[i]) {
				break;
			}
		}
		for(k=j+1;k<arr.length;k++) {
			if(arr[k]<arr[j]) {
				break;
			}
		}
		if(k>=arr.length)
			System.out.print(-1+" ");
		else
		System.out.print(arr[k]+" ");
	}
}
public static int[] takeinput() {
	int n=scn.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=scn.nextInt();
	return arr;
}
}

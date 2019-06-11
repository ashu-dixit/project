package programm;

import java.util.Scanner;

public class ARRAYS_IS_ARRAY_MIRROR_INVERSE {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scn.nextInt();
		}
		int flag=0;
		int a[]=inverse(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==a[i])
				continue;
			if(arr[i]!=a[i]) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("True");
		else 
			System.out.println("False");
	}

	public static int[] inverse(int[] arr) {
		int[] a=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
		a[arr[i]]=i;
		}
		return a;
	}

}

package programm;

import java.util.Scanner;

public class MAXIMUM_INTEGER_WITH_AT_MOST_K_SWAPS {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int k=scn.nextInt();
		int max=num;
		for(int i=0;i<k;i++) {
			int a= maximumnum(numtoarr(max), max);
			max=a;
		}
		System.out.println(max);
		
	}
public static int maximumnum(int[] arr,int max) {
	int lo=0;
	int hi=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			int n=arrtonum(arr);
			if(n>max) {
				max=n;
				lo=i;
				hi=j;
				}
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
	}
	return max;
}
public static int countd(int n) {
	int c=0;
	while(n!=0) {
		c++;
		n/=10;
	}
	return c;
}
public static int[] numtoarr(int n) {
	int[] arr=new int[countd(n)];
	for(int i=countd(n)-1;i>=0;i--) {
		arr[i]=n%10;
		n/=10;
	}
	return arr;
}
public static int arrtonum(int[] arr) {
	int n=0;
	for(int i=0;i<arr.length;i++) {
		n=n*10+arr[i];
	}
	return n;
}
}

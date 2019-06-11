package programm;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);

		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		int m=scn.nextInt();
		int lo=0;
		int hi=arr.length-1;
		
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(m>arr[mid]) {
				lo=mid+1;
			}else if(m<arr[mid]) {
				hi=mid-1;
			}else {
				System.out.println(mid);
				return;
			}
			
			
		}
		
		System.out.println(-1);

	}

}

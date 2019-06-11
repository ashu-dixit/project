package programm;

import java.util.Scanner;

public class Waveprintrowwise {
static Scanner scn =new Scanner(System.in);
	public static void main(String[] args) {
		int[][] arr=takeinput();
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				for(int j=0;j<arr[i].length;j++) {
					if(j==arr[i].length-1)
					System.out.print(arr[i][j]+"");
				}
			}else {
				for(int j=arr[0].length-1;j>=0;j--) {
					System.out.print(arr[i][j]);
				}
			}
		}
		
	}
public static int[][] takeinput() {
	int row=scn.nextInt();
	int col=scn.nextInt();
	int[][] arr=new int[row][col];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=scn.nextInt();
		}
	}
	return arr;
}
}

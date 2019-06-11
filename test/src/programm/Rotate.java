package programm;
import java.util.Scanner;

public class Rotate {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		
		for(int val: rotate(takeinput())) {
			System.out.println(val);
		}
	}
	public static int[] takeinput() {
		System.out.println("enter number terms in array");
		int n = scn.nextInt();
		System.out.println("Enter number of array");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		return arr;
	}
	
	
	public static int[] rotate(int[] arr) {
		System.out.println("enter number of terms to rotate");
		int r=scn.nextInt();	
		int[] newarr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			newarr[(r+i)%arr.length]=arr[i];
		}
		return  newarr;
	}
}

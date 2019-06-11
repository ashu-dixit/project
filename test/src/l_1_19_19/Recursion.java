package l_1_19_19;

public class Recursion {

	public static void main(String[] args) {
		int arr[] = { 20, 2, 30, 46, 30, 40,30 ,90,};
		pdi(4);
		System.out.println("-------");
		pdiby2(4);
		System.out.println("-------");
		searchinarr(arr, 0, 30);
		System.out.println("-------");
		System.out.println(firstoccurence(arr,0,30));
		System.out.println("-------");
		System.out.println(lastoccurence(arr,0,30));
		System.out.println("-------");
		System.out.println(lastoccurence2(arr,0,2,-1));
	
	}

	public static void pdi(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		pdi(n - 1);
		System.out.println(n);
	}

	public static void pdiby2(int n) {
		if (n <= 0) {
			return;
		}
		if (n % 2 == 0) {
			System.out.println(n);
		}
		pdiby2(n - 1);

		if (n % 2 == 1)
			System.out.println(n);

	}

	public static void searchinarr(int[] arr, int vidx, int n) {
		if (vidx == arr.length)
			return;

		if (arr[vidx] == n) {
			System.out.println(vidx);
		}

		searchinarr(arr, vidx + 1, n);

	}

	public static int firstoccurence(int[] arr, int vidx, int n) {
		if (vidx == arr.length)
			return -1;
		if (arr[vidx] == n) {
			return vidx;
			
		}
		return firstoccurence(arr, vidx + 1, n);

	}

	public static int lastoccurence(int[] arr, int vidx, int n) {
		int val;
		if(vidx==arr.length)
		return -1;
		val=lastoccurence(arr,vidx+1,n);
		if (val==-1&&arr[vidx] == n)
			return vidx;
		
		
			return val;
	}
	public static int  lastoccurence2(int[] arr,int vidx,int n,int l) {
		if(vidx==arr.length)
			return l;
		if(arr[vidx]==n)
			l=vidx;
		int val=lastoccurence2(arr, vidx+1, n, l);
				return val;
		
		
	}
}

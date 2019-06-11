package l_1_20_19;

public class Maxdiffer {

	public static void main(String[] args) {
		int[] arr= {7,9,5,4,3,20,1};
		System.out.println(maxdif(arr,0,0,0));
	}
	public static int maxdif(int[] arr,int vidx,int max,int min) {
		if(vidx==arr.length)
			return arr[max]-arr[min];
		if(arr[vidx]>arr[max]) {
			max=vidx;
			if(arr[vidx]<arr[min]&&min<max) {
				min=vidx;
			}
			
		}
		int val=maxdif(arr,vidx+1,max,min);
		return val;
		
	}

}

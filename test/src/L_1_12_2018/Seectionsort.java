package L_1_12_2018;

public class Seectionsort {

	public static void main(String[] args) {
		int[] arr= {10,2,-9,4,6,8};
		
		for(int count=0;count<arr.length-1;count++) {
			int min=count;
			for(int j=count+1;j<arr.length-1;j++) {
				if(arr[min]>arr[j]) {
					min=j;
				}
			}
			
			int temp=arr[count];
			arr[count]=arr[min];
			arr[min]=temp;
		}
		for(int val: arr) {
			System.out.println(val);
		}

	}

}

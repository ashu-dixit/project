package L_1_12_2018;

public class Insertionsort {

	public static void main(String[] args) {
		int[] arr= {5,6,3,23,56,7,6};
		int n=arr.length;
		for(int counter=1;counter<n;counter++) {
			int temp=arr[counter];
			int j=counter-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
			j--;
			}
			arr[j+1]=temp;
		}
		for(int val: arr) {
			System.out.println(val);
		}
	}

}

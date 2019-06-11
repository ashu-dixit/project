package l3_24_19;

public class HeapClient {

	public static void main(String[] args) {
		
		int[] arr= {5,10,2,3,7,8,90};
		Heap heap=new Heap();
		for(int val:arr) {
			heap.add(val);
		}
		
		heap.display();
		while(!heap.isempety()) {
			System.out.println(heap.remove());
		}

	}

}

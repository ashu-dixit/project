package l_2_17_19;

public class DQclient {

	public static void main(String[] args) throws Exception {

		DynamicQueue dq = new DynamicQueue();

		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		System.out.println(dq.dequeue());
		System.out.println(dq.dequeue());
		dq.enqueue(60);
		dq.enqueue(70);
		dq.enqueue(80);
		dq.enqueue(90);
		dq.display();

		System.out.println();
		System.out.println("---------------------");
		
		displayreverse(dq, 0);
		System.out.println();
		System.out.println("---------------------");
		
		actualreverse(dq);
		dq.display();

	}

	public static void actualreverse(DynamicQueue dq) throws Exception {
		if (dq.isempety()) {
			return;
		}

		int temp = dq.dequeue();
		actualreverse(dq);
		dq.enqueue(temp);

	}

	public static void displayreverse(DynamicQueue dq,int count) throws Exception {
		if(count==dq.size()) {
			return;
		}
		int temp = dq.dequeue();
		dq.enqueue(temp);
		displayreverse(dq,count+1);
		
		System.out.print(temp+" ");
		
		
	}
	public static void firstnegativeintegers(int[] arr,int k) {
		
		DynamicQueue dq=new DynamicQueue();
		
		for(int i=0;i<k;i++) {
			
			
		}
		
		
	}
}

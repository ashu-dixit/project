package l_2_24_19;

import l_2_17_19.DynamicQueue;

public class Stackusingqueuepopeff {

	DynamicQueue primary=new DynamicQueue();
	
	public int  pop() throws Exception {
		
		return primary.dequeue();
		
	}
	public void push(int item) throws Exception {
		DynamicQueue helper=new DynamicQueue();
		helper.enqueue(item);
		
		while(!primary.isempety()) {
			helper.enqueue(primary.dequeue());
		}
		
		primary = helper ;
		
	}
	public int size() {
		return primary.size();
	}
	public boolean isfull() {
		
		return primary.isfull();
	}
	public boolean isempety() {
		return primary.isempety();
	}
public void display() throws Exception {
		
		for(int i=0;i<primary.size();i++) {
			int a=primary.dequeue();
			System.out.print(a+" ");
			primary.enqueue(a);
		}
}
}
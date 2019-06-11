package l_2_24_19;

import l_2_17_19.DynamicQueue;

public class StackusingQueuepusheff {

	 DynamicQueue primary = new DynamicQueue();

	public void push(int item) throws Exception {

		primary.enqueue(item);

	}

	public int  pop() throws Exception {

		DynamicQueue helper = new DynamicQueue();

		while (primary.size() != 1) {
			helper.enqueue(primary.dequeue());
		}
		int rv = primary.dequeue();

		primary = helper;
		
		return rv;
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
		display(0);
	}
	private void display(int count) throws Exception {
		if(count==primary.size()) {
			return;
		}
		int temp = primary.dequeue();
		primary.enqueue(temp);
		display(count+1);
		
		System.out.print(temp+" ");
		
		
	}
}

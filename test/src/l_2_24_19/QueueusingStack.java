package l_2_24_19;

import l_2_17_19.DynamicStack;

public class QueueusingStack {

	DynamicStack primary = new DynamicStack();

	public int dequeue() throws Exception {
		return primary.pop();
	}

	public void push(int item) throws Exception {
		DynamicStack helper = new DynamicStack();
		while (!primary.isempty()) {
			helper.push(primary.pop());
		}
		primary.push(item);
		while (!helper.isempty()) {
			primary.push(helper.pop());
		}

	}
	public int size() {
		return primary.size();
	}
	public boolean isempety() {
		return primary.isempty();
	}
	public boolean isfull() {
		return primary.isfull();
	}
	public void display() {
		primary.display();
	}
}

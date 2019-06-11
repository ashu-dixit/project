package l_2_16_19;

public class Stack {
	protected int[] data=new int[5];
	protected int tos = -1;

	public Stack() {

	}

	public Stack(int cap) {
		this.data = new int[cap];

	}

	public void push(int item) throws Exception {
		if (this.isfull()) {
			throw new Exception("Stack is full");
		}
		this.tos++;
		this.data[this.tos] = item;

	}

	public int pop() throws Exception {
		if (this.isempty()) {

			throw new Exception("Stack is full");
		}
		int r = this.data[this.tos];
		this.data[this.tos] = 0;
		tos--;
		return r;
	}

	public int peek() throws Exception {
		if (this.isempty()) {

			throw new Exception("Stack is full");
		}
		int r = this.data[this.tos];
		return r;
	}

	public int size() {

		return tos + 1;
	}

	public boolean isfull() {
		return this.size() == this.data.length;
	}

	public boolean isempty() {
		return this.size() == 0;
	}

	public void display() {
		for (int i = this.tos; i >= 0; i--) {
			System.out.print(this.data[i]+" ");
		}
		System.out.println();
	}
}

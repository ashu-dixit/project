package l_2_16_19;

public class Queue {

	protected int[] data;
	protected int front;
	protected int size;

	public Queue() {
		this.data = new int[5];
		this.front = 0;
		this.size = 0;

	}

	public Queue(int cap) {
		this.data = new int[cap];
		this.front = 0;
		this.size = 0;
	}

	public void enqueue(int item) throws Exception {
		if (isfull()) {
			throw new Exception("queue is full");
		}
		int rear = (this.front + this.size) % this.data.length;
		this.data[rear] = item;
		size++;

	}

	public int dequeue() throws Exception {
		if (isempety()) {
			throw new Exception("queue is empty");
		}
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		this.front = (this.front + 1) % this.data.length;
		size--;
		return rv;
	}

	public int size() {
		return size;
	}

	public boolean isfull() {
		return this.size == this.data.length;
	}

	public boolean isempety() {
		return this.size == 0;
	}

	public void display() {

		for (int i = 0; i < this.size; i++) {
			System.out.print(this.data[(i + this.front) % this.data.length] + " ");
		}

	}

	public int getfront() {
		return this.data[front];
	}

}

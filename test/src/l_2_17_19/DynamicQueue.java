package l_2_17_19;

import l_2_16_19.Queue;

public class DynamicQueue extends Queue {

	public void enqueue(int item) throws Exception {

		if (isfull()) {

			int[] na = new int[this.data.length * 2];

			for (int i = 0; i < this.data.length; i++) {

				na[i] = data[(i + this.front) % this.data.length];

			}

			data = na;
			this.front=0;

		}

		super.enqueue(item);

	}

}

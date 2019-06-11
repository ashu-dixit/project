package l_2_17_19;

import l_2_16_19.Stack;

public class DynamicStack extends Stack {

	@Override
	public void push(int item) throws Exception {

		if (isfull()) {
			
			//increasing capacity
			int[] na = new int[this.data.length * 2];
			
			//copy
			for (int i = 0; i < data.length; i++) {
				na[i] = this.data[i];
			}

			data = na;

		}

		super.push(item);

	}

}

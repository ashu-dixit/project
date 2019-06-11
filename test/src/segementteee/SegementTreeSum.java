 package segementteee;

public class SegementTreeSum  implements SegementTreeI{

	@Override
	public int operate(int left, int right) {
		
		return left+right;
	}

	@Override
	public int defaultvalue() {
		return 0;
	}

}

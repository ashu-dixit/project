package segementteee;

public class SegementTreeMax implements SegementTreeI {

	@Override
	public int operate(int left, int right) {
		return Math.max(left, right);
	}

	@Override
	public int defaultvalue() {
		// TODO Auto-generated method stub
		return Integer.MIN_VALUE;
	}

}

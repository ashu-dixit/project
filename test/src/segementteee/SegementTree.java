package segementteee;

public class SegementTree {

	private class node {

		int data;
		int si;
		int ei;

		node left;
		node right;

	}

	private node root;
	private SegementTreeI STI;

	public SegementTree(int[] arr, SegementTreeI STI) {
		this.STI = STI;
		this.root = construct(arr, 0, arr.length - 1);

	}

	private node construct(int[] arr, int lo, int hi) {
		if (lo == hi) {
			node n = new node();
			n.ei = hi;
			n.si = lo;
			n.data = arr[lo];

			return n;
		}

		int mid = (lo + hi) / 2;

		node nn = new node();
		nn.si = lo;
		nn.ei = hi;

		nn.left = construct(arr, lo, mid);
		nn.right = construct(arr, mid + 1, hi);

		nn.data = STI.operate(nn.left.data, nn.right.data);

		return nn;

	}

	public int query(int qsi, int qei) {
		return query(this.root, qsi, qei);
	}

	private int query(node n, int qsi, int qei) {

		if (n.si >= qsi && n.ei <= qei) {
			return n.data;
		} else if (n.si > qei || n.ei < qsi) {
			return STI.defaultvalue();
		} else {

			int lquery = query(n.left, qsi, qei);
			int rquery = query(n.right, qsi, qei);

			return STI.operate(lquery, rquery);

		}

	}

	public void display() {
		display(this.root);
	}

	private void display(node n) {
		if (n.left == null) {
			return;
		}
		String str = "";

		str += n.left.data + " -> " + n.data + " <- " + n.right.data;
		System.out.println(str);
		display(n.left);
		display(n.right);

	}

	public void update(int indx, int item) {

		update(this.root, indx, item);

	}

	private void update(node n, int indx, int item) {

		if (indx == n.si && indx == n.ei) {

			n.data = item;

		} else if (indx >= n.si && indx <= n.ei) {

			update(n.left, indx, item);
			update(n.right, indx, item);

			n.data = STI.operate(n.left.data, n.right.data);

		} else {
			return;
		}

	}
}

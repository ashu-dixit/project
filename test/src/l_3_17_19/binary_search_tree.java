package l_3_17_19;

import test.print;

public class binary_search_tree {

	private class node {
		int data;
		node left;
		node right;
	}

	private node root;

	public binary_search_tree(int[] in) {
		this.root = construct(in, 0, in.length);
	}

	private node construct(int[] in, int ilo, int ihi) {
		// base case
		if (ilo > ihi) {
			return null;
		}
		int mid = (ilo + ihi) / 2;
		node nn = new node();
		nn.data = in[mid];
		// smaller work
		nn.left = construct(in, ilo, mid - 1);
		nn.right = construct(in, mid + 1, ihi);

		return nn;
	}

	public int max() {
		return max(this.root);
	}

	private int max(node nn) {
		if (nn.right == null) {
			return nn.data;
		}

		return max(nn.right);
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(node nn, int item) {
		if (nn == null) {
			return false;
		}
		if (nn.data > item) {
			return find(nn.left, item);
		} else if (nn.data < item) {
			return find(nn.right, item);
		} else {
			return true;
		}

	}

	public void printinrange(int lo, int hi) {
		printinrange(this.root, lo, hi);
	}

	private void printinrange(node nn, int lo, int hi) {
		if (nn == null) {
			return;
		}
		if (nn.data < lo) {
			printinrange(nn.left, lo, hi);

		}
		if (nn.data > hi) {
			printinrange(nn.right, lo, hi);

		}

		if (nn.data <= lo && nn.data >= hi) {
			printinrange(nn.left, lo, hi);
			System.out.println(nn.data);
			printinrange(nn.right, lo, hi);

		}
		// return;
	}

	public void printdec(node nn) {
		if (nn == null) {
			return;
		}
		printdec(nn.right);
		System.out.print(nn.data + " ");
		printdec(nn.left);

	}

	public class Heapmover {
		int sum = 0;
	}

	public void rplac_wth_sm() {
		rplac_wth_sm_lar(this.root, new Heapmover());
	}

	private void rplac_wth_sm_lar(node nn, Heapmover sum) {
		if (nn == null) {
			return;
		}

		rplac_wth_sm_lar(nn.right, sum);

		int temp = nn.data;
		nn.data = sum.sum;
		sum.sum += nn.data;
		rplac_wth_sm_lar(nn.left, sum);

	}

	private int rplac_wth_sm_lar(node nn, int sum) {
		if (nn == null) {
			return sum;
		}

		int sumfrmright = rplac_wth_sm_lar(nn.right, sum);

		int temp = nn.data;
		nn.data = sum;
		sumfrmright += temp;

		int sumfrm_left = rplac_wth_sm_lar(nn.left, sumfrmright);
		return sumfrm_left;
	}

	public void add(int item) {
		add(this.root, item);

	}

	private void add(node nn, int item) {

		if (item > nn.data) {
			if (nn.right == null) {
				node nnode = new node();
				nnode = nn.right;
				nnode.data = item;
			} else {
				add(nn.right, item);
			}

		} else if (item < nn.data) {
			if (nn.left != null)
				add(nn.left, item);
			else {
				node nnode = new node();
				nnode = nn.left;
				nnode.data = item;
			}
		}

	}
	public void addreturn(int item) {
		add(this.root, item);
		}
	private node addreturn(node nn, int item) {
		if (nn == null) {
			node nnode = new node();
			nn = nnode;
			nn.data = item;
			return nn;
		}

		if (item <= nn.data) {
			nn.left = addreturn(nn.left, item);

		} else {

			nn.right = addreturn(nn.right, item);
		}
		return nn;
	}

	public void remove(int item) {
		remove(this.root, this.root, item);

	}

	private void remove(node parent, node node, int item) {

		if (item < node.data) {
			remove(node, node.left, item);
		} else if (item > node.data) {
			remove(node, node.right, item);
		} else {

			if (node.left == null && node.right == null) {
				if (parent.data > item) {
					parent.left = null;
				} else {
					parent.right = null;
				}

			} else if (node.left == null && node.right != null) {

				if (parent.data > item) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			} else if (node.left != null && node.right == null) {

				if (parent.data > item) {
					parent.left = node.left;
				} else {
					parent.right = node.left;
				}
			} else {
				
				int lmax=max(node.left);
					node.data=lmax;
					remove(lmax);
			}

		}
	}
	
	
}

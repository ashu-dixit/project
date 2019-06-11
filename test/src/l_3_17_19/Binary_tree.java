package l_3_17_19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Binary_tree {
	Scanner scn = new Scanner(System.in);

	private class node {

		int data;
		node right;
		node left;
	}

	private node root;

	public Binary_tree() {
		this.root = takeinput(null, true);
	}

	private node takeinput(node parent, boolean ilc) {

		if (parent == null) {
			System.out.println("Enter the Data for root node");
		} else {
			if (ilc) {
				System.out.println("enter data for left child");
			} else {
				System.out.println("enter data for right child");
			}
		}

		int item = scn.nextInt();
		node nn = new node();
		nn.data = item;
		System.out.println("this node has left child");
		boolean hlc = scn.nextBoolean();
		if (hlc) {
			nn.left = takeinput(nn, true);
		}
		System.out.println("this node has right child");
		boolean hrc = scn.nextBoolean();
		if (hrc) {
			nn.right = takeinput(nn, false);
		}
		return nn;
	}

	public Binary_tree(int[] pre, int[] in) {
		this.root = construct(pre, 0, pre.length - 1, in, 0, in.length - 1);
	}

	private node construct(int[] pre, int plo, int phi, int[] in, int ilo, int ihi) {

		if (plo > phi || ilo > ihi) {
			return null;
		}
		node nn = new node();
		nn.data = pre[plo];
		int si = -1;
		for (int i = ilo; i <= ihi; i++) {
			if (in[i] == pre[plo]) {
				si = i;
				break;
			}

		}
		int noe = si - ilo;
		nn.left = construct(pre, plo + 1, plo + noe, in, ilo, si - 1);
		nn.right = construct(pre, plo + noe + 1, phi, in, si + 1, ihi);

		return nn;
	}

	public int size() {
		return size(this.root);
	}

	private int size(node nn) {
		// base case
		if (nn == null) {
			return 0;
		}

		// smaller work
		int lc = size(nn.left);
		int rc = size(nn.right);

		int totalcount = lc + rc + 1;// 1 is for node itself
		return totalcount;

	}

	public int max() {
		return max(this.root, this.root.data);
	}

	private int max(node node, int max) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}

		int maxl = max(node.left, max);
		int maxr = max(node.right, max);

		return Math.max(node.data, Math.max(maxl, maxr));
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(node n, int item) {
		if (n == null) {
			return false;
		}
		boolean isinleft;
		boolean isinright;
		if (n.data == item) {
			return true;
		} else {
			isinleft = find(n.left, item);
			isinright = find(n.right, item);
		}
		return isinleft || isinright;
	}

	public int hieght() {
		return hieght(this.root);
	}

	private int hieght(node nn) {

		if (nn == null) {
			return -1;// for 0 it will return 1 for leaf node
		}

		int lh = hieght(nn.left);
		int rh = hieght(nn.right);

		return Math.max(lh, rh) + 1;

	}

	
	
	
	public boolean istreebst() {
		return istreebst();
	}

	private class BSTpair {
		boolean isbst = true;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
	}

	private BSTpair istreebst(node node) {
		BSTpair lbp = istreebst(node.left);
		BSTpair rbp = istreebst(node.right);

		BSTpair fbp = new BSTpair();

		if (lbp.isbst && rbp.isbst && node.data > lbp.max && node.data < rbp.min)
			fbp.isbst = true;
		else
			fbp.isbst = false;

		fbp.max = Math.max(node.data, Math.max(lbp.max, lbp.max));
		fbp.min = Math.min(node.data, Math.min(lbp.min, lbp.min));

		return fbp;
	}

	private class VOpair implements Comparable<VOpair> {

		int data;
		int vd;
		int hd;

		@Override
		public String toString() {

			return this.data + "";
		}

		@Override
		public int compareTo(VOpair other) {
			return this.hd - other.hd;
		}
	}

	public void verticledisplay() {

		HashMap<Integer, ArrayList<VOpair>> map = new HashMap<>();

		verticledisplay(this.root, map, 0, 0);

		ArrayList<Integer> keys = new ArrayList<>(map.keySet());
		Collections.sort(keys);

		for (int key : keys) {

			ArrayList<VOpair> list = map.get(key);
			Collections.sort(list);
			System.out.println(key + "->" + list);

		}
	}

	private void verticledisplay(node node, HashMap<Integer, ArrayList<VOpair>> map, int hdist, int vdist) {

		if (node == null) {
			return;
		}
		VOpair np = new VOpair();
		np.data = node.data;
		np.hd = hdist;
		np.vd = vdist;

		if (!map.containsKey(vdist)) {
			map.put(vdist, new ArrayList<VOpair>());
		}

		map.get(vdist).add(np);

		verticledisplay(node.left, map, hdist + 1, vdist - 1);
		verticledisplay(node.right, map, hdist + 1, vdist + 1);

		return;
	}

}

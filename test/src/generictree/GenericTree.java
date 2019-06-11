package generictree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GenericTree {
	Scanner scn = new Scanner(System.in);

	private class node {
		int data;
		ArrayList<node> children = new ArrayList<>();

		public node(int data) {
			this.data = data;
		}

	}

	private node root;

	GenericTree() {

		this.root = constructer(null, -1);

	}

	private node constructer(node parent, int i) {
		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {

			System.out.println("enter the data for" + i + "th chile of" + parent.data);
		}
		int item = scn.nextInt();

		node nn = new node(item);

		System.out.println("no of child of" + nn.data + "?");
		int noc = scn.nextInt();

		for (int j = 0; j < noc; j++) {

			node child = constructer(nn, j);
			nn.children.add(child);
		}

		return nn;

	}

	public void display() {

		display(this.root);
	}

	private void display(node node) {

		String str = node.data + " -> ";

		for (node child : node.children) {
			str += child.data + " , ";
		}

		System.out.println(str);

		for (node child : node.children) {
			display(child);
		}
	}

	public int size() {
		return size(this.root);
	}

	private int size(node node) {
		if (node == null) {
			return 0;
		}

		int ts = 0;
		for (node child : node.children) {
			int cs = size(child);
			ts += cs;
		}

		return ts + 1;
	}

	public int max() {
		return max(this.root);
	}

	private int max(node node) {

		int max = node.data;
		for (node child : node.children) {
			int childmax = max(child);
			if (childmax > max) {
				max = childmax;
			}
		}

		return max;
	}

	public boolean find(int item) {
		return find(this.root, item);
	}

	private boolean find(node node, int item) {

		if (node.data == item) {
			return true;
		}

		for (node child : node.children) {
			boolean childfind = find(child, item);

			if (childfind) {
				return true;
			}
		}

		return false;

	}

	public int hieght() {
		return hieght(this.root);
	}

	private int hieght(node node) {
		if (node == null) {
			return 0;
		}

		int mh = 0;
		for (node child : node.children) {

			int ch = hieght(child);
			if (ch > mh) {
				mh = ch;
			}
		}

		return mh + 1;
	}

	public void mirror() {
		mirror(this.root);
	}

	private void mirror(node node) {

		for (node child : node.children) {
			mirror(child);
		}

		int i = 0;
		int j = node.children.size() - 1;
		while (i < j) {

			node in = node.children.get(i);
			node jn = node.children.get(j);
			node.children.set(i, jn);
			node.children.set(j, in);
			i++;
			j--;
		}

//		ArrayList<node> reverse = new ArrayList<>();
//		for (node child : node.children) {
//			reverse.add(0, child);
//		}
//		node.children = reverse;
	}

	public void printlevel(int level) {
		ArrayList<Integer> arr = new ArrayList<>();
		printlevel(this.root, 0, level, arr);
		System.out.println(arr);
	}

	private void printlevel(node node, int cl, int tl, ArrayList<Integer> digit) {// tl=target level, cl=current level

		if (cl == tl) {
			System.out.println(node.data);
			return;
		}

		for (node child : node.children) {
			printlevel(child, cl + 1, tl, digit);
		}

	}

	public void preorder() {
		preorder(this.root);
		System.out.println("-------------");
	}

	public void preorder(node node) {

		System.out.print(node.data + ", ");

		for (node child : node.children) {
			preorder(child);
		}

	}

	public void postorder() {
		postorder(this.root);
		System.out.println("------------------------");
	}

	public void postorder(node node) {

		for (node child : node.children) {
			postorder(child);
		}

		System.out.print(node.data + ", ");
	}

	public void linearize() {
		linearize(this.root);

	}

	private void linearize(node node) {

		// Smaller work
		// base case
		for (node child : node.children) {
			linearize(child);
		}

		// self work

		while (node.children.size() > 1) {
			node tail = gettail(node.children.get(0));
			tail.children.add(node.children.remove(1));
		}
	}

	private node gettail(node node) {

		while (!node.children.isEmpty()) {
			node = node.children.get(0);
		}

		return node;
	}

	public void levelorder() {

		LinkedList<node> queue = new LinkedList<>();
		queue.add(this.root);
		while (!queue.isEmpty()) {
			for (node child : queue.getFirst().children) {
				queue.addLast(child);
			}
			System.out.print(queue.removeFirst().data + ", ");
		}
	}

	public void levelorderLW() {

		LinkedList<node> queue = new LinkedList<>();
		queue.add(this.root);

		int ccount = 0;
		int lcount = 1;
		int i = 0;

		while (!queue.isEmpty()) {
			node rn = queue.removeFirst();

			System.out.print(rn.data + ", ");
			for (node child : rn.children) {
				queue.addLast(child);
				ccount++;
			}
			i++;
			if (i == lcount) {
				System.out.println();
				i = 0;
				lcount = ccount;
				ccount = 0;

			}

		}
	}

	public void levelorderLW2() {

		LinkedList<node> queue = new LinkedList<>();
		queue.add(this.root);
		queue.addLast(null);

		while (!queue.isEmpty()) {
			node rn = queue.removeFirst();

			if (rn == null) {
				queue.addLast(null);
				System.out.println();
			}

			if (rn == null && queue.size() == 1) {
				break;
			}
			if (rn != null) {
				System.out.print(rn.data + ", ");
				for (node child : rn.children) {
					queue.addLast(child);
				}
			}

		}
	}

	public void levelorderLW3() {

		LinkedList<node> pqueue = new LinkedList<>();
		LinkedList<node> hqueue = new LinkedList<>();
		pqueue.add(this.root);

		while (!pqueue.isEmpty()) {
			node rn = pqueue.removeFirst();

			System.out.print(rn.data + ", ");

			for (node child : rn.children) {
				hqueue.addLast(child);

			}
			if (pqueue.isEmpty()) {
				System.out.println();
				LinkedList<node> temp = pqueue;
				pqueue = hqueue;
				hqueue = temp;
			}
		}
	}

	public void levelorderzz() {

		LinkedList<node> stack = new LinkedList<>();
		LinkedList<node> queue = new LinkedList<>();

		queue.add(this.root);
		int count = 0;
		while (!queue.isEmpty()) {
			node rn = queue.removeFirst();

			System.out.print(rn.data + ", ");

			if (count % 2 == 0) {
				for (node child : rn.children) {
					stack.addFirst(child);
				}
			} else {
				for (int i = rn.children.size() - 1; i >= 0; i--) {
					stack.addFirst(rn.children.get(i));
				}
			}
			if (queue.isEmpty()) {
				LinkedList<node> temp = stack;
				stack = queue;
				queue = temp;
				count++;
				System.out.println();
			}
		}
	}

	private class heapmover {

		int max = Integer.MIN_VALUE;
		int ht = 0;
		int size = 0;
		boolean find = false;
		node pred;
		node succ;

		@Override
		public String toString() {
			return "max  :- " + max + "\nht   :- " + ht + "\nsize :- " + size + "\nfind :- " + find + "\npre :- "
					+ (pred == null ? null : pred.data) + "\nsucc = " + (succ == null ? null : succ.data);
		}

	}

	public void multitask(int item) {
		heapmover mover = new heapmover();
		multitask(this.root, mover, item, 0);
		System.out.println(mover);
	}

	private void multitask(node node, heapmover mover, int item, int count) {

		mover.size++;

		if (mover.find == true && mover.succ == null) {
			mover.succ = node;
		}

		if (node.data > mover.max) {
			mover.max = node.data;
		}
		if (node.data == item) {
			mover.find = true;
		}
		if (mover.find == false) {
			mover.pred = node;
		}
		if (count > mover.ht) {
			mover.ht = count;
		}
		for (node child : node.children) {

			multitask(child, mover, item, count + 1);

		}

	}
}

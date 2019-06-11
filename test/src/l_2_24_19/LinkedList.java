package l_2_24_19;

public class LinkedList {

	private class node {

		int data;
		node next;
	}

	private node head;
	private node tail;
	private int size;

	public int size() {
		return this.size;
	}

	public boolean isempety() {
		return this.size() == 0;
	}

	public int getfirst() throws Exception {
		if (isempety())
			throw new Exception("Lst is empety");
		return this.head.data;
	}

	public int getlast() throws Exception {
		if (isempety())
			throw new Exception("Lst is empety");

		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {
		if (isempety())
			throw new Exception("Lst is empety");

		node temp = this.head;
		if (idx < 0 || idx >= size)
			throw new Exception("invalid index");
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public node getnodeAt(int idx) throws Exception {
		if (isempety())
			throw new Exception("Lst is empety");

		node temp = this.head;
		if (idx < 0 || idx >= size)
			throw new Exception("invalid index");
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void display() {
		node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.print(temp.data + ", ");
			temp = temp.next;
		}

	}

//
	public void addlast(int item) {

		node nn = new node();
		nn.data = item;
		if (isempety()) {
			head = nn;
			tail = nn;
		} else {
			tail.next = nn;
			tail = nn;
		}

		size++;
	}

	public void addfirst(int item) {

		node nn = new node();
		nn.data = item;

		if (isempety()) {
			this.head = nn;
			this.tail = nn;
		} else {
			nn.next = head;
		}

		head = nn;
		size++;

	}

	public void addAt(int idx, int item) throws Exception {
		if (idx < 0 || idx > size())
			throw new Exception("Invalid Index");

		node nn = new node();

		nn.data = item;
		if (idx == 0) {
			addfirst(item);
			return;
		} else if (idx == size) {
			addlast(item);
			return;
		} else {
			node nm1 = getnodeAt(idx - 1);
			node nm2 = nm1.next;

			nn.next = nm2;
			nm1.next = nn;
			size++;

		}

	}

	public int removefirst() throws Exception {
		if (isempety())
			throw new Exception("LL is empety");

		int a = head.data;
		if (size() == 1) {
			head = null;
			tail = null;
			size = 0;

		} else {
			head = head.next;
			size--;

		}
		return a;
	}

	public int removelast() throws Exception {

		if (isempety())
			throw new Exception("LL is empety");
		int a = tail.data;
		if (size() == 1) {
			head = null;
			tail = null;
			size = 0;

		} else {
			node nm1 = getnodeAt(size - 2);// indexing from 0 to (size-1)
			nm1.next = null;
			tail = nm1;
			size--;

		}
		return a;

	}

	public int RemoveAt(int idx) throws Exception {

		if (isempety())
			throw new Exception("LL is empety");

		if (idx == 0) {
			return removefirst();
		} else if (idx == size - 1) {
			return removelast();
		} else {

			node nm1 = getnodeAt(idx - 1);
			int rv = nm1.next.data;
			node nm2 = nm1.next.next;
			nm1.next = nm2;
			size--;
			return rv;
		}

	}

	public void reversedataiteratively() throws Exception {
		int left = 0;
		int right = this.size - 1;

		while (left < right) {
			node ln = getnodeAt(left);
			node rn = getnodeAt(right);
			int temp = ln.data;
			ln.data = rn.data;
			rn.data = temp;
			left++;
			right--;
		}
	}

	public void reversenodeiteratively() throws Exception {
		node prev = this.head;
		node curr = prev.next;

		while (curr != null) {
			node ahead = curr.next;
			curr.next = prev;

			prev = curr;
			curr = ahead;

		}
		node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		// this.tail.next=null;
	}

	public void reversedatarcursionheap() {
		heapmover heap = new heapmover();
		heap.left = this.head;
		reversedatarcursionheap(heap, this.head, 0);
	}

	private class heapmover {
		node left;
	}

	private void reversedatarcursionheap(heapmover heap, node right, int count) {
		if (right == null) {
			return;
		}
		reversedatarcursionheap(heap, right.next, count + 1);
		if (count >= this.size / 2) {
			int temp = heap.left.data;
			heap.left.data = right.data;
			right.data = temp;
		}
		heap.left = heap.left.next;
	}

	public void reversedatarcursion() {
		reversedatarcursion(this.head, this.head, 0);
	}

	private node reversedatarcursion(node left, node right, int count) {
		if (right == null) {
			return left;
		}
		node cleft = reversedatarcursion(left, right.next, count + 1);
		if (count == this.size / 2) {
			int temp = cleft.data;
			cleft.data = right.data;
			right.data = temp;
		}
		return cleft.next;
	}

	public void reversepointerrcursion() {
		reversepointerrcursion(this.head, this.head.next);
	}

	private void reversepointerrcursion(node prev, node curr) {

		if (curr == null) {
			return;
		}

		reversepointerrcursion(curr, curr.next);
		curr.next = prev;

	}

	public void foldlinkedlist() {
		heapmover mover = new heapmover();
		mover.left = this.head;
		foldlinkedlistheapmover(mover, this.tail, 0);
	}

	private void foldlinkedlistheapmover(heapmover mover, node right, int count) {
		if (right == null) {
			return;
		}

		foldlinkedlistheapmover(mover, right.next, count + 1);
		if (count > this.size / 2) {
			node ahead = mover.left.next;
			mover.left.next = right;
			right.next = ahead;
			mover.left = ahead;

		}
		if (count == this.size / 2) {
			this.tail = right;
			this.tail.next = null;
		}

	}

	public void foldlinkedlistreturn() {
		foldlinkedlistreturn(this.head, this.tail, 0);
	}

	private node foldlinkedlistreturn(node left, node right, int count) {
		if (right == null) {
			return left;
		}

		left = foldlinkedlistreturn(left, right.next, count + 1);
		if (count > this.size / 2) {
			right.next = left.next;
			left.next = right;
		}
		if (count == this.size / 2) {
			this.tail = right;
			this.tail.next = null;
		}
		return left;
	}

	public int midvalue() {
		return midvalue(this.head, this.head);
	}

	private int midvalue(node slower, node faster) {
		if (faster.next.next == null || faster.next == null) {
			return slower.data;
		}

		return midvalue(slower.next, faster.next.next);

	}

	public node midnode() {

		node slower = this.head;
		node faster = this.head;

		while (faster.next == null || faster.next.next == null) {
			slower = slower.next;
			faster = faster.next.next;
		}

		return slower;
	}

	public int kthfromlast(int k) {

		node beforek = this.head;
		for (int i = 0; i < k; i++) {
			beforek = beforek.next;
		}
		node afterk = beforek;
		while (afterk != null) {
			beforek = beforek.next;
			afterk = afterk.next;
		}
		return beforek.data;
	}

	public void kreverse(int k) throws Exception {
		LinkedList prev = null;

		while (this.isempety()) {
			LinkedList curr = new LinkedList();

			for (int i = 1; i < k; i++) {
				curr.addfirst(this.getfirst());
			}
			if (prev == null) {
				prev = curr;
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
			}
			this.head = prev.head;
			this.size = prev.size;
			this.tail = prev.tail;
		}
	}

	public LinkedList mergetwoLL(LinkedList two) {

		LinkedList merged = new LinkedList();
		node firsttemp = this.head;
		node secondtemp = two.head;

		while (firsttemp != null && secondtemp != null) {
			if (firsttemp.data < secondtemp.data) {
				merged.addlast(firsttemp.data);
				firsttemp = firsttemp.next;
				secondtemp = secondtemp.next;
			} else {
				merged.addlast(secondtemp.data);
				firsttemp = firsttemp.next;
				secondtemp = secondtemp.next;
			}
		}

		if (firsttemp == null) {
			while (secondtemp != null) {
				merged.addlast(secondtemp.data);
				firsttemp = firsttemp.next;
				secondtemp = secondtemp.next;
			}
		} else {
			merged.addlast(firsttemp.data);
			firsttemp = firsttemp.next;
			secondtemp = secondtemp.next;
		}
		return merged;

	}

	public void mergesort() {
		if (this.size == 1) {
			return;
		}

		node mid = this.midnode();
		node midn = mid.next;

		LinkedList fh = new LinkedList();

		fh.head = this.head;
		fh.tail = mid;
		fh.tail.next = null;
		fh.size = (this.size + 1) / 2;

		LinkedList sh = new LinkedList();

		sh.head = midn;
		sh.tail = this.tail;
		sh.size = (this.size + 1) / 2;

		fh.mergesort();
		sh.mergesort();

		LinkedList sorted = fh.mergetwoLL(sh);

		this.head = sorted.head;
		this.tail = sorted.tail;
	}

	public boolean detectremoveloop() {
			
		//FLOYD CYCLE
		
		node slower = this.head;
		node faster = this.head;
		// detect loop
		while (faster.next == null || faster.next.next == null) {

			slower = slower.next;
			faster = faster.next.next;

			if (slower == faster)
				break;
		}

		node p = this.head;

		if (p.next == slower.next) {
			while (p.next != slower.next&&p.next!=this.head) {
				slower = slower.next;
				p = p.next;
			}
			slower.next = null;
			return true;
		} else {
			return false;
		}
	}
}

package Generic;

public class LinkedListGneric<T> {

		private class node {

			T data;
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

		public T getfirst() throws Exception {
			if (isempety())
				throw new Exception("Lst is empety");
			return this.head.data;
		}

		public T getlast() throws Exception {
			if (isempety())
				throw new Exception("Lst is empety");

			return this.tail.data;
		}

		public T getAt(int idx) throws Exception {
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
		public void addlast(T item) {

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

		public void addfirst(T item) {

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

		public void addAt(int idx, T item) throws Exception {
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

		public T removefirst() throws Exception {
			if (isempety())
				throw new Exception("LL is empety");

			T a = head.data;
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

		public T removelast() throws Exception {

			if (isempety())
				throw new Exception("LL is empety");
			T a = tail.data;
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

		public T RemoveAt(int idx) throws Exception {

			if (isempety())
				throw new Exception("LL is empety");

			if (idx == 0) {
				return removefirst();
			} else if (idx == size - 1) {
				return removelast();
			} else {

				node nm1 = getnodeAt(idx - 1);
				T rv = nm1.next.data;
				node nm2 = nm1.next.next;
				nm1.next = nm2;
				size--;
				return rv;
			}

		}


}

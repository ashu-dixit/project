package l3_24_19;

import java.util.ArrayList;

import Generic.Car;

public class GenericHeap {

	public static void main(String[] args) {

		Heap<Car> c = new Heap<>();

		Car[] carr = new Car[5];

		carr[0] = new Car(10, 200, "black");
		carr[1] = new Car(20, 100, "blue");
		carr[2] = new Car(30, 300, "green");
		carr[3] = new Car(60, 500, "white");
		carr[4] = new Car(50, 400, "yellow");

		for (int i = 0; i < carr.length; i++) {
			c.add(carr[i]);
		}
		while (!c.isempety()) {
			System.out.println(c.remove());
		}

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();

		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());
		list.add(new ArrayList<>());

		list.get(0).add(1);
		list.get(0).add(8);
		list.get(0).add(9);
		list.get(0).add(10);
		list.get(0).add(12);
		list.get(1).add(5);
		list.get(1).add(15);
		list.get(1).add(20);
		list.get(2).add(1);
		list.get(2).add(13);
		list.get(2).add(25);
		list.get(2).add(30);
		list.get(3).add(2);
		list.get(3).add(3);

		System.out.println(mergeksortedlist(list));

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(3);
		list2.add(40);
		list2.add(18);
		list2.add(15);
		list2.add(11);

		largestk(list2, 3);

	}

	private static class pair implements Comparable<pair> {

		int item;
		int listno;
		int idx;

		@Override
		public int compareTo(pair o) {

			return this.item - o.item;
		}

	}

	public static ArrayList<Integer> mergeksortedlist(ArrayList<ArrayList<Integer>> lists) {

		ArrayList<Integer> sorted = new ArrayList<>();

		Heap<pair> heap = new Heap<>();

		for (int i = 0; i < lists.size(); i++) {
			pair np = new pair();
			np.item = lists.get(i).get(0);
			np.idx = 0;
			np.listno = i;
			heap.add(np);
		}

		while (!heap.isempety()) {
			pair rp = heap.remove();
			sorted.add(rp.item);
			rp.idx++;
			if (rp.idx < lists.get(rp.listno).size()) {
				rp.item = lists.get(rp.listno).get(rp.idx);
				heap.add(rp);
			}
		}

		return sorted;

	}

	public static void largestk(ArrayList<Integer> list, int k) {

		Heap<Integer> heap = new Heap<>();

		for (int i = 0; i < k; i++) {
			heap.add(list.get(i));
		}
		for (int i = k; i < list.size(); i++) {

			if (list.get(i) > heap.getHP()) {
				heap.remove();
				heap.add(list.get(i));
			}
			

		}

		while (!heap.isempety()) {
			System.out.println(heap.remove());
		}

	}

}

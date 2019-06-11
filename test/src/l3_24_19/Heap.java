package l3_24_19;

import java.util.ArrayList;
import java.util.HashMap;

public class Heap<T extends Comparable<T>> {

	ArrayList<T> data = new ArrayList<>();

	public void add(T item) {

		data.add(item);

		upheapify(data.size() - 1);

	}

	private void upheapify(int ci) {

		int pi = (ci - 1) / 2;

		if (islarger(data.get(ci), data.get(pi)) > 0) {
			swap(pi, ci);
			upheapify(pi);
		}

	}

	private void swap(int pi, int ci) {

		T p = data.get(pi);
		T c = data.get(ci);

		data.set(ci, p);
		data.set(pi, c);

	}

	public T remove() {
		swap(0, data.size() - 1);

		T temp = data.remove(data.size() - 1);

		dowmheapify(0);

		return temp;
	}

	private void dowmheapify(int pi) {

		int lci = 2 * pi + 1;
		int rci = 2 * pi + 2;
		int mini = pi;
		if (lci < data.size() && islarger(data.get(lci), data.get(mini)) > 0) {
			mini = lci;
		}
		if (rci < data.size() && islarger(data.get(rci), data.get(mini)) > 0) {
			mini = rci;
		}

		if (mini != pi) {
			swap(mini, pi);
			dowmheapify(mini);
		}

	}

	public boolean isempety() {
		return data.isEmpty();

	}

	public int size() {
		return data.size();
	}

	public void display() {
		System.out.println(data);
	}

	public T getHP() {
		return data.get(0);
	}

	private int islarger(T t, T o) {
		return o.compareTo(t);
	}

	public void updatepriority(T t) {
		int i;
		for (i = 0; i < this.data.size(); i++) {
			if (this.data.get(i) == t)
				break;

		}
		upheapify(i);
	}

}

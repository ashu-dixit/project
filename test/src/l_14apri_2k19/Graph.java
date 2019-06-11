package l_14apri_2k19;
//vetex=1000&&edge=640

//maximum number of connected component possible
//minimum number of connected component possible

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;

import l3_24_19.Heap;

public class Graph {

	HashMap<String, Vertex> vrtc = new HashMap<>();

	private class Vertex {

		HashMap<String, Integer> nbrs = new HashMap<>();

	}

	public int numofvertex() {
		return vrtc.size();
	}

	public boolean containsvertex(String vname) {

		return vrtc.containsKey(vname);
	}

	public void addvertex(String vname) {
		Vertex vrtx = new Vertex();
		vrtc.put(vname, vrtx);
	}

	public void removeVertex(String vname) {

		Vertex vrtx = vrtc.get(vname);

		for (String key : vrtx.nbrs.keySet()) {
			vrtc.get(key).nbrs.remove(vname);
		}

		vrtc.remove(vname);

	}

	public int numEdge() {
		int size = 0;
		for (String key : vrtc.keySet()) {
			Vertex vrtx = vrtc.get(key);
			size += vrtx.nbrs.size();
		}

		return size / 2;
	}

	public boolean containsEdge(String vname1, String vname2) {
		Vertex vrtx1 = vrtc.get(vname1);
		Vertex vrtx2 = vrtc.get(vname2);

		if (vrtx1 == null || vrtx2 == null || !vrtx1.nbrs.containsKey(vname2)) {
			return false;
		}
		return true;
	}

	public void addEdge(String vname1, String vname2, int cost) {
		Vertex vrtx1 = vrtc.get(vname1);
		Vertex vrtx2 = vrtc.get(vname2);

		if (vrtx1 == null || vrtx2 == null || vrtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vrtx1.nbrs.put(vname2, cost);
		vrtx2.nbrs.put(vname1, cost);
	}

	public void removeEdge(String vname1, String vname2) {
		Vertex vrtx1 = vrtc.get(vname1);
		Vertex vrtx2 = vrtc.get(vname2);

		if (vrtx1 == null || vrtx2 == null || !vrtx1.nbrs.containsKey(vname2)) {
			return;
		}
		vrtx1.nbrs.remove(vname2);
		vrtx2.nbrs.remove(vname1);
	}

	public void display() {

		System.out.println("----------------------------");
		for (String Key : vrtc.keySet()) {
			Vertex vrtx = new Vertex();
			vrtx = vrtc.get(Key);
			System.out.println(Key + " -> " + vrtx.nbrs);
		}
		System.out.println("----------------------------");
	}

	public boolean Hashpath(String src, String des) {
		return Hashpath(src, des, new HashMap<>());
	}

	private boolean Hashpath(String src, String des, HashMap<String, Boolean> processed) {

		if (containsEdge(src, des)) {
			return true;
		}
		if (processed.containsKey(src)) {
			return false;
		}
		processed.put(src, true);
		Vertex vrtx = vrtc.get(src);

		for (String key : vrtx.nbrs.keySet()) {

			if (Hashpath(key, des, processed)) {
				return true;
			}
		}

		return false;
	}

	public void Hashpathprint(String src, String des) {
		Hashpathprint(src, des, new HashMap<>(), src);
	}

	private boolean Hashpathprint(String src, String des, HashMap<String, Boolean> processed, String ans) {

		if (containsEdge(src, des)) {
			System.out.println(ans + des);
			return true;
		}
		if (processed.containsKey(src)) {
			return false;
		}
		processed.put(src, true);
		Vertex vrtx = vrtc.get(src);

		for (String key : vrtx.nbrs.keySet()) {

			if (Hashpathprint(key, des, processed, ans + key)) {
				return true;
			}
		}
		return false;
	}

	public void printallpath(String src, String dst) {
		printallpath(src, dst, new HashSet<>(), src);
	}

	private void printallpath(String src, String dst, HashSet<String> processed, String ans) {
		if (src.equals(dst)) {
			System.out.println(ans);
			return;
		}

		processed.add(src);
		Vertex vrtx = vrtc.get(src);

		for (String key : vrtx.nbrs.keySet()) {

			if (!processed.contains(key)) {
				printallpath(key, dst, processed, ans + key);

			}
		}
		processed.remove(src);

	}

	private class pair {

		String Vname;
		String ssf;
		String colour;

	}

	public boolean bsf(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> queue = new LinkedList<>();

		// create new pair and put in queue
		pair np = new pair();
		np.Vname = src;
		np.ssf = src;

		queue.addLast(np);

		// 2. work till queue is not empty
		while (!queue.isEmpty()) {
			// 2.1 remove the pair
			pair rp = queue.removeFirst();

			if (processed.containsKey(rp.Vname)) {
				continue;
			}

			// 2.2 mark as processed
			processed.put(rp.Vname, true);

			// if direct edge present
			if (containsEdge(rp.Vname, dst)) {
				System.out.println(rp.ssf + dst);
				return true;
			}

			// process only unprocessed nbrs
			for (String nbr : vrtc.get(rp.Vname).nbrs.keySet()) {

				if (!processed.containsKey(nbr)) {
					pair p = new pair();
					p.Vname = nbr;
					p.ssf = rp.ssf + nbr;
					queue.addLast(p);
				}

			}

		}

		return false;

	}

	public boolean dsf(String src, String dst) {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> stack = new LinkedList<>();

		// create new pair and put in queue
		pair np = new pair();
		np.Vname = src;
		np.ssf = src;

		stack.addFirst(np);

		// 2. work till queue is not empty
		while (!stack.isEmpty()) {
			// 2.1 remove the pair
			pair rp = stack.removeFirst();

			if (processed.containsKey(rp.Vname)) {
				continue;
			}

			// 2.2 mark as processed
			processed.put(rp.Vname, true);

			// if direct edge present
			if (containsEdge(rp.Vname, dst)) {
				System.out.println(rp.ssf + dst);
				return true;
			}

			// process only unprocessed nbrs
			for (String nbr : vrtc.get(rp.Vname).nbrs.keySet()) {

				if (!processed.containsKey(nbr)) {
					pair p = new pair();
					p.Vname = nbr;
					p.ssf = rp.ssf + nbr;
					stack.addFirst(p);
				}

			}

		}

		return false;

	}

	public boolean containscyclebsf() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> queue = new LinkedList<>();

		for (String src : vrtc.keySet()) {
			if (processed.containsKey(src)) {
				continue;
			}
			// create new pair and put in queue
			pair np = new pair();
			np.Vname = src;
			np.ssf = src;

			queue.addLast(np);

			// 2. work till queue is not empty
			while (!queue.isEmpty()) {
				// 2.1 remove the pair
				pair rp = queue.removeFirst();

				if (processed.containsKey(rp.Vname)) {
					return true;
				}

				// 2.2 mark as processed
				processed.put(rp.Vname, true);

				// process only unprocessed nbrs
				for (String nbr : vrtc.get(rp.Vname).nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {
						pair p = new pair();
						p.Vname = nbr;
						p.ssf = rp.ssf + nbr;
						queue.addLast(p);
					}

				}

			}
		}
		return false;

	}

	public void bft() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> queue = new LinkedList<>();

		for (String src : vrtc.keySet()) {
			if (processed.containsKey(src)) {
				continue;
			}
			// create new pair and put in queue
			pair np = new pair();
			np.Vname = src;
			np.ssf = src;

			queue.addLast(np);

			// 2. work till queue is not empty
			while (!queue.isEmpty()) {
				// 2.1 remove the pair
				pair rp = queue.removeFirst();

				if (processed.containsKey(rp.Vname)) {
					continue;
				}

				// 2.2 mark as processed
				processed.put(rp.Vname, true);

				// if direct edge present
				System.out.println(src + " -> " + rp.ssf);

				// process only unprocessed nbrs
				for (String nbr : vrtc.get(rp.Vname).nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {
						pair p = new pair();
						p.Vname = nbr;
						p.ssf = rp.ssf + nbr;
						queue.addLast(p);
					}

				}

			}
		}

	}

	public void dft() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> stack = new LinkedList<>();

		for (String src : vrtc.keySet()) {
			// create new pair and put in queue
			if (processed.containsKey(src)) {
				continue;
			}

			pair np = new pair();
			np.Vname = src;
			np.ssf = src;

			stack.addFirst(np);

			// 2. work till queue is not empty
			while (!stack.isEmpty()) {
				// 2.1 remove the pair
				pair rp = stack.removeFirst();

				if (processed.containsKey(rp.Vname)) {
					continue;
				}

				// 2.2 mark as processed
				processed.put(rp.Vname, true);

				// if direct edge present
				System.out.println(src + " -> " + rp.ssf);

				// process only unprocessed nbrs
				for (String nbr : vrtc.get(rp.Vname).nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {
						pair p = new pair();
						p.Vname = nbr;
						p.ssf = rp.ssf + nbr;
						stack.addFirst(p);
					}
				}
			}
		}
	}

// cycle
// isconnected
// istree
// getconnected
	public boolean isconnected() {

		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> queue = new LinkedList<>();
		int count = 0;
		for (String src : vrtc.keySet()) {
			if (processed.containsKey(src)) {
				continue;
			}
			count++;
			// create new pair and put in queue
			pair np = new pair();
			np.Vname = src;
			np.ssf = src;

			queue.addLast(np);

			// 2. work till queue is not empty
			while (!queue.isEmpty()) {
				// 2.1 remove the pair
				pair rp = queue.removeFirst();

				if (processed.containsKey(rp.Vname)) {
					continue;
				}

				// 2.2 mark as processed
				processed.put(rp.Vname, true);

				// process only unprocessed nbrs
				for (String nbr : vrtc.get(rp.Vname).nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {
						pair p = new pair();
						p.Vname = nbr;
						p.ssf = rp.ssf + nbr;
						queue.addLast(p);
					}

				}

			}
		}

		return count > 1;

	}

	public boolean istree() {

		return !containscyclebsf() && isconnected();

	}

	public ArrayList<ArrayList<String>> getconnectedcomponent() {

		ArrayList<ArrayList<String>> ans = new ArrayList<>();
		HashMap<String, Boolean> processed = new HashMap<>();

		LinkedList<pair> queue = new LinkedList<>();
		for (String src : vrtc.keySet()) {
			if (processed.containsKey(src)) {
				continue;
			}
			ArrayList<String> subans = new ArrayList<>();
			// create new pair and put in queue
			pair np = new pair();
			np.Vname = src;
			np.ssf = src;

			queue.addLast(np);

			// 2. work till queue is not empty
			while (!queue.isEmpty()) {
				// 2.1 remove the pair
				pair rp = queue.removeFirst();

				if (processed.containsKey(rp.Vname)) {
					continue;
				}

				// 2.2 mark as processed
				processed.put(rp.Vname, true);

				subans.add(rp.Vname);

				// process only unprocessed nbrs
				for (String nbr : vrtc.get(rp.Vname).nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {
						pair p = new pair();
						p.Vname = nbr;
						p.ssf = rp.ssf + nbr;
						queue.addLast(p);
					}

				}

			}
			ans.add(subans);
		}

		return ans;

	}

	// Bipartite
	// 2 colorable

	public boolean isbipartite() {
		HashMap<String, String> processed = new HashMap<>();

		LinkedList<pair> queue = new LinkedList<>();

		for (String src : vrtc.keySet()) {
			if (processed.containsKey(src)) {
				continue;
			}
			// create new pair and put in queue
			pair np = new pair();
			np.Vname = src;
			np.ssf = src;
			np.colour = "r";
			queue.addLast(np);

			// 2. work till queue is not empty
			while (!queue.isEmpty()) {
				// 2.1 remove the pair
				pair rp = queue.removeFirst();

				if (processed.containsKey(rp.Vname)) {

					String oc = processed.get(rp.Vname);

					String nc = rp.colour;
					if (!nc.equals(oc)) {
						return false;
					}

					continue;
				}

				// 2.2 mark as processed
				processed.put(rp.Vname, rp.colour);

				// if direct edge present
				// System.out.println(src + " -> " + rp.ssf);

				// process only unprocessed nbrs
				for (String nbr : vrtc.get(rp.Vname).nbrs.keySet()) {

					if (!processed.containsKey(nbr)) {
						pair p = new pair();
						p.Vname = nbr;
						p.ssf = rp.ssf + nbr;
						p.colour = rp.colour.equals("r") ? "g" : "r";
						queue.addLast(p);
					}

				}

			}
		}
		return true;
	}

	private class primspair implements Comparable<primspair> {
		String vname;
		String aquvname;
		int cost;

		@Override
		public int compareTo(primspair o) {
			return o.cost - this.cost;
		}

	}

	public Graph Spanningtreeprims() {

		Graph mst = new Graph();

		Heap<primspair> heap = new Heap<>();
		HashMap<String, primspair> map = new HashMap<>();
		// make new pair and put in map

		for (String key : vrtc.keySet()) {

			primspair np = new primspair();

			np.vname = key;
			np.aquvname = null;
			np.cost = Integer.MAX_VALUE;

			heap.add(np);
			map.put(key, np);

		}

		// work till heap become empty
		while (!heap.isempety()) {

			primspair rp = heap.remove();
			map.remove(rp.vname);

			if (rp.aquvname == null) {
				mst.addvertex(rp.vname);
			} else {
				mst.addvertex(rp.vname);
				mst.addEdge(rp.vname, rp.aquvname, rp.cost);

			}

			for (String nbr : vrtc.get(rp.vname).nbrs.keySet()) {

				primspair np = map.get(nbr);
				
				int nc = vrtc.get(rp.vname).nbrs.get(nbr);
				int oc = map.get(rp.vname).cost;
				if (nc < oc) {
					np.cost = nc;
					np.aquvname = rp.vname;
					heap.updatepriority(np);

				}

			}

		}

		return mst;
	}
}

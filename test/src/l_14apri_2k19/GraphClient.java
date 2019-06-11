package l_14apri_2k19;

public class GraphClient {

	public static void main(String[] args) {
		Graph gg = new Graph();

		gg.addvertex("A");
		gg.addvertex("B");
		gg.addvertex("C");
		gg.addvertex("D");
		gg.addvertex("E");
		gg.addvertex("F");
		gg.addvertex("G");

		gg.addEdge("A", "B", 2);
		gg.addEdge("A", "D", 10);
//		gg.addEdge("B", "C", 1);
		gg.addEdge("D", "C", 2);
		gg.addEdge("D", "E", 4);
		gg.addEdge("E", "F", 3);
		gg.addEdge("E", "G", 2);
//		gg.addEdge("F", "G", 6);

		gg.display();

		gg.removeEdge("E", "D");

		// gg.display();
		// gg.removeVertex("A");
		// gg.display();
		// System.out.println(gg.Hashpath("A", "F"));
		// gg.Hashpathprint("A", "F");

		// gg.printallpath("A", "F");

		// System.out.println(gg.dsf("A", "F"));

//		System.out.println(gg.containscyclebsf("A", "F"));
//		gg.removeEdge("A", "B");
//		gg.removeEdge("G", "F");
//		System.out.println(gg.containscyclebsf("A", "F"));

		// gg.bft();
		// gg.dft();

		System.out.println(gg.getconnectedcomponent());
		System.out.println(gg.isbipartite());
		gg.Spanningtreeprims().display();

	}

}

package l_2_24_19;

public class LLClient {

	public static void main(String[] args) throws Exception {
		LinkedList list = new LinkedList();

		list.addlast(10);
		list.addlast(20);
		list.addlast(30);
		list.addlast(40);
		System.out.println(list.size());

		list.display();
		System.out.println();

		System.out.println(list.getAt(3));
		System.out.println(list.getfirst());
		System.out.println(list.getlast());
		
		System.out.println(list.removefirst());
		
		list.display();
		System.out.println();
		list.addfirst(200);
		list.display();
		System.out.println();
		System.out.println(list.removelast());
		list.display();

	}

}

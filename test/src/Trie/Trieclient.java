package Trie;

public class Trieclient {

	public static void main(String[] args) {

		Trie tt = new Trie();

		tt.addword("ant");
		tt.addword("arc");
		tt.addword("and");
		tt.addword("bee");
		tt.addword("been");
		
		tt.display();
		System.out.println(tt.searchword("an"));
		tt.removeword("ant");
		tt.removeword("bee");
		System.out.println("-------------------------");
		tt.display();
		

	}

}

package hauffmancoding;

import java.util.HashMap;

import l3_24_19.Heap;

public class HauffmanCoding {

	private class node implements Comparable<node> {

		char ch;
		int cost;
		node left;
		node right;

		@Override
		public int compareTo(node o) {
			// TODO Auto-generated method stub
			return o.cost - this.cost;
		}

	}

	HashMap<Character, String> encoder = new HashMap<>();
	HashMap<String, Character> decoder = new HashMap<>();

	public HauffmanCoding(String str) {

		HashMap<Character, Integer> fmap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (fmap.containsKey(ch)) {
				fmap.put(ch, fmap.get(ch) + 1);
			} else {
				fmap.put(ch, 1);
			}

		}

		Heap<node> hp = new Heap<>();

		for (char ch : fmap.keySet()) {

			node n = new node();
			n.ch = ch;
			n.cost = fmap.get(ch);
			hp.add(n);

		}

		while (hp.size() != 1) {

			node ln = hp.remove();
			node rn = hp.remove();

			node nn = new node();
			nn.cost = ln.cost + rn.cost;
			nn.left = ln;
			nn.right = rn;

			hp.add(nn);

		}

		node lastnode = hp.remove();
		System.out.println(lastnode.ch);
		fillencoderdecoder(lastnode, "");
		System.out.println(encoder);
	
		System.out.println(decoder);
	}

	public void fillencoderdecoder(node node, String str) {

		if (node.left == null && node.right == null) {

			encoder.put(node.ch, str);
			decoder.put(str, node.ch);

			return;
		}

		fillencoderdecoder(node.left, str + '0');
		fillencoderdecoder(node.right, str + '1');

	}

	public String encode(String str) {
		String ans = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(encoder.containsKey(ch))
			ans += encoder.get(ch);

		}

		return ans;
	}

	public String decode(String str) {

		String key = "";
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			key += ch;

			if (decoder.containsKey(key)) {

				ans += decoder.get(key);
				key = "";
			}

		}
		return ans;

	}

}

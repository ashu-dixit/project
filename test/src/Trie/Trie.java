package Trie;

import java.awt.DisplayMode;
import java.util.HashMap;

public class Trie {

	private class node {

		char ch;

		boolean eow;

		HashMap<Character, node> table;

		public node(char ch) {
			this.ch = ch;
			this.eow = false;
			this.table = new HashMap<>();
		}

	}

	private node root;

	public Trie() {
		this.root = new node('*');
	}

	public void addword(String word) {
		addword(this.root, word);
	}

	private void addword(node parent, String word) {

		if (word.length() == 0) {
			parent.eow = true;
			return;
		}

		char ch = word.charAt(0);

		String ros = word.substring(1);

		if (parent.table.containsKey(ch)) {

			addword(parent.table.get(ch), ros);
		} else {
			node nn = new node(ch);
			parent.table.put(ch, nn);

			addword(parent.table.get(ch), ros);
		}

	}

	public void display() {
		display(this.root, "");
	}

	private void display(node parent, String str) {

		if (parent.eow) {
			System.out.println(str);
		}

		for (char ch : parent.table.keySet()) {
			display(parent.table.get(ch), str + ch);
		}

	}

	public boolean searchword(String word) {

		return searchword(this.root, word);
	}

	private boolean searchword(node parent, String word) {

		if (word.length() == 0) {
			return parent.eow;
		}

		char ch = word.charAt(0);

		String ros = word.substring(1);

		if (parent.table.containsKey(ch)) {

			return searchword(parent.table.get(ch), ros);
		} else {
			return false;
		}

	}

	public void removeword(String word) {

		removeword(this.root, word);
	}

	private void removeword(node parent, String word) {

		if (word.length() == 0) {
			parent.eow = false;
			return;
		}

		char ch = word.charAt(0);
		String ros = word.substring(1);

		if (parent.table.containsKey(ch)) {

			node child = parent.table.get(ch);

			removeword(child, ros);

			if (child.eow == false && child.table.isEmpty()) {
				parent.table.remove(ch);
			}
		}else
			return;

	}

	public void displaytrie() {

		displaytrie(this.root);

	}

	private void displaytrie(node parent) {

		String str = parent.ch + " -> ";

		for (char ch : parent.table.keySet()) {
			str += ch + ", ";
		}

		System.out.println(str);

		for (char ch : parent.table.keySet()) {
			displaytrie(parent.table.get(ch));
		}

	}
}

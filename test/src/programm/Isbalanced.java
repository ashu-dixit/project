package programm;

import java.util.LinkedList;
import java.util.Scanner;

public class Isbalanced {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(isbalanced(str));

	}

	public static boolean isbalanced(String str) {

		LinkedList<Character> Stack = new LinkedList<>();

		while (str.length() != 0) {

			char ch = str.charAt(0);
			String ros = str.substring(1);
			if (ch == '{' || ch == '(' || ch == '[') {
				Stack.addFirst(ch);
			}
			boolean t = ch == '}' || ch == ')' || ch == ']';
			if (!Stack.isEmpty() && t) {
				char rch = Stack.getFirst();
				if (rch == '{' && ch == '}') {
					Stack.removeFirst();
				}
				if (rch == '(' && ch == ')') {
					Stack.removeFirst();
				}
				if (rch == '[' && ch == ']') {
					Stack.removeFirst();
				}

			}

			str = ros;

		}

		if (Stack.isEmpty()) {
			return true;
		}

		return false;
	}
}

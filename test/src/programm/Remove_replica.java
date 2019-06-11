package programm;

import java.util.Scanner;

public class Remove_replica {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String ss = scn.next();
		System.out.println(remove(ss));
	}

	public static String remove(String ss) {

		for (int i = 0; i < ss.length(); i++) {
			for (int j = i+1; j < ss.length(); j++) {
				if (ss.charAt(i) == ss.charAt(j)) {
					ss = ss.substring(0, j) + ss.substring(j + 1);
				j--;
				}else
					break;
			}
		}

		return ss;
	}
}

package l_2_24_19;

import java.util.ArrayList;
import java.util.HashMap;

import l_3_17_19.Binary_tree;

public class Hashmapops {

	public static void main(String[] args) {

		System.out.println(Hieghestfreqcharacter("aaaabaaccdd"));

		int[] one = { 2, 10, 3, 3, 1, 2, 5, 10, 10, 20 };
		int[] two = { 2, 15, 16, 3, 3, 5, 5, 10, 15 };

		System.out.println(Intersection(one, two));
		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };

		set(arr);
		int[] pre= {10,20,40,80,90,190,160,50,30,60,100,120,130,140,70};
		int[] in=  {80,40,90,190,160,20,50,10,100,60,130,120,140,30,70};
		
		Binary_tree bt=new Binary_tree(pre,in);
		
		bt.verticledisplay();
		
	}

	private static ArrayList<Integer> Intersection(int[] one, int[] two) {
		ArrayList<Integer> arr = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < one.length; i++) {
			int ch = one[i];
			if (map.containsKey(ch)) {
				int cf = map.get(ch);
				int nf = cf + 1;

				map.put(ch, nf);
			} else {
				map.put(ch, 1);
			}
		}
		for (int i = 0; i < two.length; i++) {
			int key = two[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) - 1);
				arr.add(key);

				if (map.get(key) == 0)
					map.remove(key);
			}
		}

		return arr;
	}

	private static char Hieghestfreqcharacter(String string) {

		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (map.containsKey(ch)) {
				int cf = map.get(ch);
				int nf = cf + 1;

				map.put(ch, nf);
			} else {
				map.put(ch, 1);
			}
		}
		int maxfreq = 0;
		char maxchar = ' ';
		for (Character key : map.keySet()) {
			if (map.get(key) > maxfreq) {
				maxfreq = map.get(key);
				maxchar = key;
			}
		}
		return maxchar;
	}

	public static void set(int[] arr) {


		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i] - 1)) {
				map.put(arr[i], false);
			} else {
				map.put(arr[i], true);
			}
			if (map.containsKey(arr[i] + 1)) {
				map.put(arr[i] + 1, false);
			}

		}

		int maxcount = 0;
		int digit = 0;

		for (Integer Key : map.keySet()) {
			int count = 0;
			if (map.get(Key)) {

				while (map.containsKey(Key + count)) {
					count++;
				}
				if (count > maxcount) {
					maxcount = count;
					digit = Key;
				}

			}

		}

		for (int i = 0; i < maxcount; i++) {
			System.out.println(digit + i);
		}

	}

	

}

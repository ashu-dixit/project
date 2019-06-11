
package l_3_30_19;

import java.util.Arrays;

public class DP {

	public static void main(String[] args) {

		int n = 10;

		System.out.println(fibonacci(n));
		System.out.println(fibonacciTD(n, new int[n + 1]));
		System.out.println(fibonacciBU(n));
		System.out.println(fibonacciBUSpaceefficient(n));
		System.out.println("---------------------------");
		System.out.println(boardpath(0, 10));
		System.out.println(boardpathTD(0, 10, new int[10]));
		System.out.println(boardpathBU(10));
		System.out.println(boardpathBUSE(10));
		System.out.println("---------------------");
		System.out.println(mazepath(0, 0, 2, 2));
		System.out.println(mazepathTD(0, 0, 2, 2, new int[3][3]));
		System.out.println(mazepathBU(2, 2));
		System.out.println(mazepathBUSE(2, 2));
		System.out.println(mazepathdiagonal(3, 3));
		System.out.println("----------------------------");
		String s1 = "abcd";
		String s2 = "agcfd";
		System.out.println(LCS("abcd", "agcfd"));
		System.out.println(LCSBU("abcd", "agcfd"));
		System.out.println(LCSTD(s1, s2, new int[s1.length() + 1][s2.length() + 1]));
		System.out.println(reduceto1(8));
		System.out.println("------------------------------");
		System.out.println(EditDistance(s1, s2));
		System.out.println(EditDistanceBU(s1, s2));
		int[][] strg = new int[s1.length() + 1][s2.length() + 1];
		for (int i = 0; i < strg.length; i++) {
			for (int j = 0; j < strg[i].length; j++) {
				strg[i][j] = -1;
			}
		}
		System.out.println(EditDistanceTD(s1, s2, strg));
		System.out.println("------------------------");
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(MCM(arr, 0, arr.length - 1));
		int[][] strg1 = new int[arr.length][arr.length];
		System.out.println(MCMTD(arr, 0, arr.length - 1, strg1));
		System.out.println(MCMBU(arr));
		System.out.println("---------------------------");
		int[] arrw = { 2, 3, 5, 1, 4 };
		System.out.println(wineproblem(arrw, 0, arrw.length - 1, 1));
		System.out.println(wineproblemTD(arrw, 0, arrw.length - 1, new int[arrw.length][arrw.length]));
		System.out.println(wineproblemBU(arrw));
		int[] wt = { 1, 3, 4, 5 };
		int[] price = { 1, 4, 5, 7 };
		int cap = 7;
		System.out.println(knopsack(wt, price, 7, 0));
		System.out.println(knopsackTD(wt, price, cap, 0, new int[wt.length][cap + 1]));
		System.out.println(knapsackBU(wt, price, cap));
		int[] arrh = { 40, 60, 20 };
		System.out.println(harrypottercolours(arrh, 0, arrh.length - 1));
		System.out.println(harrypottercoloursTD(arrh, 0, arrh.length - 1, new int[arrh.length][arrh.length]));
		System.out.println(stringpattern("ababc", "?*a*"));
		System.out.println(wildcardmatchingBU("ababc", "?*a*"));

		int[] len = { 1, 0, 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] prie = { 1, 0, 1, 5, 8, 9, 10, 17, 17, 20 };
		// System.out.println(rodprofit(len, prie, 8, 0));
		System.out.println(rodcut(prie, 8));
		System.out.println(rodcutTD(prie, 8, new int[prie.length]));
		System.out.println(rodcutBU(prie, 8));

	}

	public static int fibonacci(int n) {

		if (n == 0 || n == 1) {
			return n;
		}

		int fn1 = fibonacci(n - 1);
		int fn2 = fibonacci(n - 2);

		return fn1 + fn2;

	}

	public static int fibonacciTD(int n, int[] strg) {

		if (n == 0 || n == 1) {
			return n;
		}
		if (strg[n] != 0) {
			return strg[n];
		}
		int fn1 = fibonacciTD(n - 1, strg);
		int fn2 = fibonacciTD(n - 2, strg);
		int fn = fn1 + fn2;
		strg[n] = fn;
		return fn;

	}

	public static int fibonacciBU(int n) {

		int[] strg = new int[n + 1];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 2; i < strg.length; i++) {

			strg[i] = strg[i - 1] + strg[i - 2];

		}

		return strg[n];

	}

	public static int fibonacciBUSpaceefficient(int n) {

		int[] strg = new int[2];
		strg[0] = 0;
		strg[1] = 1;
		for (int i = 0; i < n - 1; i++) {
			int next = strg[1] + strg[0];
			strg[0] = strg[1];
			strg[1] = next;

		}

		return strg[1];

	}

	public static int boardpath(int curr, int end) {

		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}

		int sum = 0;
		for (int i = 1; i < 7; i++) {
			sum += boardpath(curr + i, end);
		}

		return sum;

	}

	public static int boardpathTD(int curr, int end, int[] strg) {

		if (curr == end) {
			return 1;
		}
		if (curr > end) {
			return 0;
		}
		if (strg[curr] != 0) {
			return strg[curr];
		}

		int sum = 0;
		for (int i = 1; i < 7; i++) {
			sum += boardpath(curr + i, end);
		}
		strg[curr] = sum;
		return sum;

	}

	public static int boardpathBU(int end) {

		int[] strg = new int[end + 6];
		strg[end] = 1;

		for (int i = end - 1; i >= 0; i--) {
			for (int j = 1; j < 7; j++) {
				strg[i] += strg[i + j];
			}
		}

		return strg[0];

	}

	public static int boardpathBUSE(int end) {

		int[] strg = new int[6];
		strg[0] = 1;

		for (int j = 0; j < end; j++) {
			int temp = 0;
			for (int i = 0; i < strg.length; i++) {
				temp += strg[i];
			}
			for (int i = strg.length - 1; i > 0; i--) {
				strg[i] = strg[i - 1];
			}
			strg[0] = temp;
		}
		return strg[0];

	}

	public static int mazepath(int cr, int cc, int er, int ec) {

		if (cr == er && ec == cc) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		int ch = mazepath(cr, cc + 1, er, ec);
		int cv = mazepath(cr + 1, cc, er, ec);

		return ch + cv;
	}

	public static int mazepathTD(int cr, int cc, int er, int ec, int[][] strg) {

		if (cr == er && ec == cc) {
			return 1;
		}
		if (cr > er || cc > ec) {
			return 0;
		}

		if (strg[cr][cc] != 0) {
			return strg[cr][cc];
		}

		int ch = mazepathTD(cr, cc + 1, er, ec, strg);
		int cv = mazepathTD(cr + 1, cc, er, ec, strg);

		strg[cr][cc] = ch + cv;

		return ch + cv;
	}

	public static int mazepathBU(int ec, int er) {

		int[][] strg = new int[er + 2][ec + 2];

		strg[er][ec] = 1;

		for (int cr = er; cr >= 0; cr--) {
			for (int cc = ec; cc >= 0; cc--) {
				if (cc == ec && cr == er)
					continue;

				strg[cr][cc] = strg[cr + 1][cc] + strg[cr][cc + 1];

			}
		}

		return strg[0][0];
	}

	public static int mazepathBUSE(int ec, int er) {

		int[] strg = new int[ec + 1];

		Arrays.fill(strg, 1);

		for (int cr = er - 1; cr >= 0; cr--) {

			for (int cc = ec; cc >= 0; cc--) {

				if (cc == ec) {
					strg[cc] = 1;
				} else {
					strg[cc] = strg[cc] + strg[cc + 1];
				}

			}

		}
		return strg[0];
	}

	public static int mazepathdiagonal(int ec, int er) {

		int[] strg = new int[ec + 1];
		Arrays.fill(strg, 1);

		int diag = 1;
		for (int cr = er - 1; cr >= 0; cr--) {

			for (int cc = ec; cc >= 0; cc--) {

				if (cc == ec) {
					strg[cc] = 1;
					diag = 1;
				} else {
					int sum = strg[cc] + strg[cc + 1] + diag;
					diag = strg[cc];
					strg[cc] = sum;
				}

			}

		}
		return strg[0];

	}

	public static int reduceto1(int num) {
		if (num == 1) {
			return 0;
		}

		int ans = Integer.MAX_VALUE;
		if (num % 3 == 0) {
			int c3 = reduceto1(num / 3) + 1;
			ans = Math.min(c3, ans);
		}
		if (num % 2 == 0) {
			int c2 = reduceto1(num / 2) + 1;
			ans = Math.min(c2, ans);
		}
		int c1 = reduceto1(num - 1) + 1;
		ans = Math.min(c1, ans);

		return ans;
	}

	public static int reduceto1TD(int num, int[] strg) {
		if (num == 1) {
			return 0;
		}

		if (strg[num] != 0) {
			return strg[num];
		}
		int ans = Integer.MAX_VALUE;
		if (num % 3 == 0) {
			int c3 = reduceto1(num / 3) + 1;
			ans = Math.min(c3, ans);
		}
		if (num % 2 == 0) {
			int c2 = reduceto1(num / 2) + 1;
			ans = Math.min(c2, ans);
		}
		int c1 = reduceto1(num - 1) + 1;

		ans = Math.min(c1, ans);
		strg[num] = ans;

		return ans;
	}

	public static int LCS(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans;
		if (ch1 == ch2) {
			ans = LCS(ros1, ros2) + 1;
		} else {
			int o1 = LCS(s1, ros2);
			int o2 = LCS(ros1, s2);

			ans = Math.max(o1, o2);
		}
		return ans;
	}

	public static int LCSBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length() - 1; row >= 0; row--) {
			for (int col = s2.length() - 1; col >= 0; col--) {
				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1] + 1;
				} else {
					int o1 = strg[row + 1][col];
					int o2 = strg[row][col + 1];

					strg[row][col] = Math.max(o1, o2);
				}
			}
		}

		return strg[0][0];

	}

	public static int LCSTD(String s1, String s2, int[][] strg) {

		if (s1.length() == 0 || s2.length() == 0) {
			return 0;
		}

		if (strg[s1.length()][s2.length()] != 0) {
			return strg[s1.length()][s2.length()];
		}
		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);

		int ans;
		if (ch1 == ch2) {
			ans = LCS(ros1, ros2) + 1;
		} else {
			int o1 = LCS(s1, ros2);
			int o2 = LCS(ros1, s2);

			ans = Math.max(o1, o2);
		}
		strg[s1.length()][s2.length()] = ans;
		return ans;
	}

	public static int EditDistance(String s1, String s2) {

		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans;
		if (ch1 == ch2) {
			ans = EditDistance(ros1, ros2) + 1;
		} else {

			int d = EditDistance(s1, ros2);
			int i = EditDistance(ros1, s2);
			int r = EditDistance(ros1, ros2);

			ans = Math.min(r, Math.min(i, d));

		}

		return ans;

	}

	public static int EditDistanceTD(String s1, String s2, int[][] strg) {

		if (s1.length() == 0 || s2.length() == 0) {
			return Math.max(s1.length(), s2.length());
		}

		if (strg[s1.length()][s2.length()] != -1) {
			return strg[s1.length()][s2.length()];

		}

		char ch1 = s1.charAt(0);
		char ch2 = s2.charAt(0);

		String ros1 = s1.substring(1);
		String ros2 = s2.substring(1);
		int ans;
		if (ch1 == ch2) {
			ans = EditDistance(ros1, ros2) + 1;
		} else {

			int d = EditDistance(s1, ros2);
			int i = EditDistance(ros1, s2);
			int r = EditDistance(ros1, ros2);

			ans = Math.min(r, Math.min(i, d));

		}
		strg[s1.length()][s2.length()] = ans;

		return ans;

	}

	public static int EditDistanceBU(String s1, String s2) {

		int[][] strg = new int[s1.length() + 1][s2.length() + 1];

		for (int row = s1.length(); row >= 0; row--) {
			for (int col = s2.length(); col >= 0; col--) {
				if (col == s2.length()) {
					strg[row][col] = s1.length() - row;
					continue;
				}
				if (row == s1.length()) {
					strg[row][col] = s2.length() - col;
					continue;
				}
				if (s1.charAt(row) == s2.charAt(col)) {
					strg[row][col] = strg[row + 1][col + 1] + 1;

				} else {

					int i = strg[row + 1][col];
					int d = strg[row][col + 1];
					int r = strg[row + 1][col + 1];

					strg[row][col] = Math.min(i, Math.min(r, d));

				}

			}
		}

		return strg[0][0];

	}

	public static int MCM(int[] arr, int si, int ei) {

		if (si + 1 == ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;

		for (int k = si + 1; k < ei; k++) {

			int fp = MCM(arr, si, k);
			int sp = MCM(arr, k, ei);

			int sw = arr[si] * arr[k] * arr[ei];

			int total = fp + sp + sw;

			if (total < min) {
				min = total;
			}

		}

		return min;

	}

	public static int MCMTD(int[] arr, int si, int ei, int[][] strg) {

		if (si + 1 == ei) {
			return 0;
		}

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}

		int min = Integer.MAX_VALUE;

		for (int k = si + 1; k < ei; k++) {

			int fp = MCM(arr, si, k);
			int sp = MCM(arr, k, ei);

			int sw = arr[si] * arr[k] * arr[ei];

			int total = fp + sp + sw;

			if (total < min) {
				min = total;
			}

		}
		strg[si][ei] = min;

		return min;

	}

	public static int MCMBU(int[] arr) {

		int n = arr.length;
		int[][] strg = new int[n][n];

		for (int slide = 1; slide <= n - 2; slide++) {

			for (int si = 0; si <= n - slide - 2; si++) {

				int ei = si + slide + 1;

				int min = Integer.MAX_VALUE;

				for (int k = si + 1; k < ei; k++) {

					int fp = strg[si][k];
					int sp = strg[k][ei];

					int sw = arr[si] * arr[k] * arr[ei];

					int total = fp + sp + sw;

					if (total < min) {
						min = total;
					}

				}
				strg[si][ei] = min;

			}

		}

		return strg[0][n - 1];

	}

	public static int wineproblem(int[] arr, int si, int ei, int yr) {

		if (si == ei) {
			return arr[si] * yr;
		}

		int ssell = wineproblem(arr, si + 1, ei, yr + 1) + arr[si] * yr;
		int esell = wineproblem(arr, si, ei - 1, yr + 1) + arr[ei] * yr;

		int ans = Math.max(ssell, esell);

		return ans;

	}

	public static int wineproblemTD(int[] arr, int si, int ei, int[][] strg) {

		int yr = arr.length - (ei - si + 1) + 1;

		if (si == ei) {
			return arr[si] * yr;
		}

		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}
		int ssell = wineproblemTD(arr, si + 1, ei, strg) + arr[si] * yr;
		int esell = wineproblemTD(arr, si, ei - 1, strg) + arr[ei] * yr;

		int ans = Math.max(ssell, esell);
		strg[si][ei] = ans;
		return ans;

	}

	public static int wineproblemBU(int[] arr) {

		int[][] strg = new int[arr.length][arr.length];
		int n = arr.length;

		for (int slide = 0; slide < n; slide++) {

			for (int si = 0; si < n - slide; si++) {
				int ei = si + slide;
				int yr = arr.length - (ei - si + 1) + 1;

				if (si == ei) {
					strg[si][ei] = arr[si] * yr;
				} else {

					int ssell = strg[si + 1][ei] + arr[si] * yr;
					int esell = strg[si][ei - 1] + arr[ei] * yr;

					int ans = Math.max(ssell, esell);

					strg[si][ei] = ans;
				}
			}
		}

		return strg[0][n - 1];
	}

	public static int knopsack(int[] wt, int[] price, int cap, int ind) {

		if (ind == wt.length) {
			return 0;
		}

		int ncap = cap - wt[ind];
		int taken = 0;
		if (ncap >= 0)
			taken = knopsack(wt, price, ncap, ind + 1) + price[ind];

		int nottaken = knopsack(wt, price, cap, ind + 1);

		int ans = Math.max(taken, nottaken);

		return ans;

	}

	public static int knopsackTD(int[] wt, int[] price, int cap, int ind, int[][] strg) {

		if (ind == wt.length) {
			return 0;
		}

		if (strg[ind][cap] != 0) {
			return strg[ind][cap];
		}

		int ncap = cap - wt[ind];
		int taken = 0;
		if (ncap >= 0)
			taken = knopsackTD(wt, price, ncap, ind + 1, strg) + price[ind];

		int nottaken = knopsackTD(wt, price, cap, ind + 1, strg);

		int ans = Math.max(taken, nottaken);

		strg[ind][cap] = ans;
		return ans;

	}

	public static int knapsackBU(int[] wt, int[] price, int cap) {
		int nr = wt.length + 1;
		int nc = cap + 1;

		int[][] strg = new int[nr][nc];

		for (int row = 1; row < nr; row++) {

			for (int col = 1; col < nc; col++) {

				int included = 0;

				if (col >= wt[row - 1]) {
					included = price[row - 1] + strg[row - 1][col - wt[row - 1]];

				}

				int excluded = strg[row - 1][col];

				strg[row][col] = Math.max(included, excluded);

			}
		}
		return strg[nr - 1][nc - 1];
	}

	public static int harrypottercolours(int[] arr, int si, int ei) {

		if (si == ei) {
			return 0;
		}

		int min = Integer.MAX_VALUE;
		for (int k = si; k < ei; k++) {
			int smoke1stp = harrypottercolours(arr, si, k);
			int smoke2ndp = harrypottercolours(arr, k + 1, ei);

			int currsmoke = colour(arr, si, k) * colour(arr, k + 1, ei);

			int smoke = smoke1stp + smoke2ndp + currsmoke;
			if (smoke < min) {
				min = smoke;
			}

		}
		return min;
	}

	public static int colour(int[] arr, int si, int ei) {
		int c = 0;

		for (int i = si; i <= ei; i++) {
			c += arr[i];
		}

		return c % 100;
	}

	public static int harrypottercoloursTD(int[] arr, int si, int ei, int[][] strg) {

		if (si == ei) {
			return 0;
		}
		if (strg[si][ei] != 0) {
			return strg[si][ei];
		}
		int min = Integer.MAX_VALUE;
		for (int k = si; k < ei; k++) {
			int smoke1stp = harrypottercoloursTD(arr, si, k, strg);
			int smoke2ndp = harrypottercoloursTD(arr, k + 1, ei, strg);

			int currsmoke = colour(arr, si, k) * colour(arr, k + 1, ei);

			int smoke = smoke1stp + smoke2ndp + currsmoke;
			if (smoke < min) {
				min = smoke;
			}

		}

		strg[si][ei] = min;

		return min;
	}

	public static boolean stringpattern(String str, String pattern) {

		if (str.length() == 0 && pattern.length() == 0) {
			return true;
		}
		if (str.length() != 0 && pattern.length() == 0) {
			return false;
		}
		if (str.length() == 0 && pattern.length() != 0) {

			for (int i = 0; i < pattern.length(); i++) {

				if (pattern.charAt(i) != '*') {
					return false;
				}

			}
			return true;

		}

		char chs = str.charAt(0);
		String ros = str.substring(1);

		char chp = pattern.charAt(0);
		String rop = pattern.substring(1);

		boolean ans = false;
		if (chs == chp || chp == '?') {
			ans = stringpattern(ros, rop);
		} else if (chp == '*') {
			// 1 character
			// boolean ch1=stringpattern(ros, rop);

			// mul characters
			boolean chmul = stringpattern(ros, pattern);

			// blank
			boolean bla = stringpattern(str, rop);

			ans = chmul || bla;

		} else {
			ans = false;
		}
		return ans;

	}

	public static boolean wildcardmatchingBU(String src, String pattern) {

		boolean[][] strg = new boolean[src.length() + 1][pattern.length() + 1];

		for (int row = strg.length - 1; row >= 0; row--) {

			for (int col = strg[0].length - 1; col >= 0; col--) {

				if (row == strg.length - 1 && col == strg[0].length - 1) {
					strg[row][col] = true;
				} else if (row == strg.length - 1) {
					if (pattern.charAt(col) == '*') {
						strg[row][col] = strg[row][col + 1];
					} else {
						strg[row][col] = false;
					}
				} else if (col == strg[0].length - 1) {
					strg[row][col] = false;
				} else {

					if (src.charAt(row) == pattern.charAt(col) || pattern.charAt(col) == '?') {
						strg[row][col] = strg[row + 1][col + 1];
					} else if (pattern.charAt(col) == '*') {
						strg[row][col] = strg[row + 1][col] || strg[row][col + 1];
					} else {
						strg[row][col] = false;
					}

				}

			}

		}
		return strg[0][0];

	}

//	public static int rodprofit(int[] len, int[] price, int length, int vindx) {
//		if (vindx == len.length) {
//			return 0;
//		}
//
//		int ifcut = Integer.MAX_VALUE;
//		if (len[vindx] != 0 && length > len[vindx]) {
//			ifcut = rodprofit(len, price, length - len[vindx], vindx);
//		}
//
//		int ifnotcut = rodprofit(len, price, length, vindx + 1);
//
//		int ans = Math.max(ifnotcut, ifcut);
//
//		return ans;
//
//	}

	public static int rodcut(int[] price, int n) {

		int max = price[n];

		int left = 1;
		int right = n - 1;

		while (left >= right) {

			int fh = rodcut(price, left);
			int sh = rodcut(price, right);

			int total = fh + sh;
			left++;
			right--;

			if (total > max) {
				max = total;
			}

		}

		return max;

	}

	public static int rodcutTD(int[] price, int n, int[] strg) {

		if (strg[n] != 0) {
			return strg[n];
		}

		int max = price[n];

		int left = 1;
		int right = n - 1;

		while (left >= right) {

			int fh = rodcutTD(price, left, strg);
			int sh = rodcutTD(price, right, strg);

			int total = fh + sh;
			left++;
			right--;

			if (total > max) {
				max = total;
			}

		}

		strg[n] = max;

		return max;
	}

	public static int rodcutBU(int[] price, int n) {

		int[] strg = new int[price.length + 1];

		for (int i = 1; i < price.length; i++) {

			int max = price[i];

			int left = 1;
			int right = i - 1;

			while (left <= right) {

				int fh = strg[left];
				int sh = strg[right];
				int total = fh + sh;
				left++;
				right--;

				if (total > max) {
					max = total;
				}

			}
			strg[i] = max;

		}
		return strg[n];

	}

	public static int catalanseries(int n) {
		if(n==1)
		int ans=0;
		for(int i=1;i<=n;i++) {
			ans=catalanseries(i-1)*catalanseries(n-i);
		}
		return ans;
	}
}

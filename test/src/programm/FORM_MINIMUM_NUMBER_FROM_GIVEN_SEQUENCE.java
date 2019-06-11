package programm;

import java.util.Scanner;

public class FORM_MINIMUM_NUMBER_FROM_GIVEN_SEQUENCE {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		String[] arr=takeinput();
		for(int i=0;i<arr.length;i++) {
		String ss=arr[i];
		printnum(ss);
		}
	}

	public static void printnum(String aos) {
		int num = aos.length() + 1;
		int no = 0;
		int t = aos.length();
		for (int i = aos.length() - 1; i >= -1; i--) {
			if (i==-1||aos.charAt(i) == 'I') {
				for (int j = i + 1; j < t; j++) {
					if (aos.charAt(j) == 'D')
						num = num * 10 + (num % 10 - 1);
					else
						num = num * 10 + (num % 10 + 1);

				}
				no = num * (int) Math.pow(10, count(no)) + no;
				t = i;
				num = num % 10 - 1;
			}

		}
		System.out.println(no);

	}

	public static int count(int n) {
		int c = 0;
		while (n != 0) {

			c++;
			n /= 10;
		}
		return c;
	}

	public static String[] takeinput() {
		int n = scn.nextInt();
		String[] aos = new String[n];
		for (int i = 0; i < n; i++) {
			aos[i] = scn.next();
		}
		return aos;
	}

}

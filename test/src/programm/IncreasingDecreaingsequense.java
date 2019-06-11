package programm;

import java.util.Scanner;

public class IncreasingDecreaingsequense {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		check2();
	}

	public static void check2() {
		int n = scn.nextInt();
		int seq = 0;
		int i = 1;
		int old;
		int flag = 0;
		int check=0;
		for (; i <= n; i++) {
			old = seq;
			seq = scn.nextInt();
			if (i != 1) {
				if (old < seq) {
					i++;
					for (; i <= n; i++) {
						old = seq;
						check=1;
						seq = scn.nextInt();
						if (old > seq) {
							flag = 1;
						break;
					}
				}
				}
		}
		}
		if (flag == 0&&check==1) {
			System.out.println("true");
		} else
			System.out.println("false");
		
	}

	public static void check1() {
		int n = scn.nextInt();
		int sum = 0;
		int i;
		for (i = 1; i <= n; i++) {
			int seq = scn.nextInt();
			int sump = sum;
			sum = sum + seq;
			int a = i;
			if (i != 1) {
				if (sump / i > sum / (i - 1)) {
					sum = 0;
					i++;
					for (; i <= n; i++) {
						seq = scn.nextInt();
						sump = sum;
						sum = sum + seq;
						if (sump / (i - a - 1) > sum / i - a) {
							break;
						}
					}
				}
			}

		}
		if (i == n) {
			System.out.println("true");
		} else
			System.out.println("false");
	}

}
package programm;

import java.util.Scanner;

public class Replacethemall {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long num = scn.nextLong();
		int count = 1;
		long no = num;
		if(num==0) {
			System.out.println(5);
		}else {
		while (num!=0) {
			int rem = (int) (num % 10);
			if (rem == 0) {
				no = no + 5 * (long) Math.pow(10, count-1);
			}
			count++;
			num /= 10;
		}
		System.out.println(no);
		
		
		
		}
	}

	public static int countdigit(long num) {
		int count=1;
		while(num!=0) {
			num/=10;
			count++;
		}
		return count;
	}
}

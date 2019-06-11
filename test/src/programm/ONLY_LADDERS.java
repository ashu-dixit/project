package programm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ONLY_LADDERS {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int boardlen=scn.nextInt();
		int n=path(0, boardlen, "", correspondprime(boardlen));
		System.out.println();
		System.out.println(n);

	}

	public static int path(int crnt, int end, String ans, ArrayList<Integer> rr) {
		if (crnt >= end) {
			System.out.print(ans + "END " + ", ");
			return 1;
		}
		boolean flag=false;
		int a=0;
		int temp=0;
		for(int j=0;j<rr.size();j+=2) {
			if(crnt==rr.get(j)) {
				flag=true;
				temp=crnt;
				crnt=rr.get(j+1);
				a+=path(crnt, end, ans+temp+" ", rr);
			}
		}
		for (int i = 1; i < 7 && crnt + i <= end&&!flag; i++) {
				a+=path(crnt + i, end, ans + crnt + " ", rr);
				
		}
return a;
	}

	public static boolean isprime(int n) {
		if (n == 0 || n == 1)
			return false;
		for (int i = 2; i <= (int) Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static ArrayList<Integer> correspondprime(int end) {
		ArrayList<Integer> rr=new ArrayList<>();
		int lo=0;
		int hi=end;
		while(lo<hi) {
			while(true) {
				if(isprime(lo)) {
					rr.add(lo);
					lo++;
					break;
				}
				lo++;
			}
			while(true) {
				if(isprime(hi)) {
					if(hi==lo-1) {
						rr.remove(rr.size()-1);
						break;
						}
					rr.add(hi);
					hi--;
					break;
				}
				hi--;
			}
		}
		return rr;
	}
}

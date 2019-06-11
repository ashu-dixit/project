package programm;

import java.util.Scanner;

public class AnytoAny {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long sb = scn.nextLong();
		long db = scn.nextLong();
		long sn = scn.nextLong();
		System.out.println(anytoany(sb, db, sn));
		
	}
	public static long anytoany(long sb,long db,long sn) {
		long dec = 0;
		long i = 0;
		while (sn != 0) {
			dec = dec +(sn % 10)*(long) Math.pow(sb, i); 
			i++;
			sn/=10;
		}
		i=0;
		long b=0;
		while(dec!=0) {
			b=b+dec%db*(long)Math.pow(10, i);
			i++;
			dec/=db;
		}
		return b;
	}

}

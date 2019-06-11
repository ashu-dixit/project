package programm;

import java.util.Scanner;

public class String_compression {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String ss = scn.next();
		System.out.println(compress(ss));
	}

	public static String compress(String ss) {
		String s="";
		int j=0;
		
		do {
			int i=j;
			if(i>=ss.length())
				break;
			int count=1;
			for ( j = i+1; j < ss.length(); j++) {
				if (ss.charAt(i) != ss.charAt(j)) 
				break;
				else {
					count++;
				}
			}
			if(count>1)
			s=(s+ss.charAt(i))+count;
			else
				s=s+ss.charAt(i);
		}while(true);

		return s;
	}


}

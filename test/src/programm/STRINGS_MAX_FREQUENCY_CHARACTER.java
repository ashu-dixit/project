package programm;

import java.util.ArrayList;
import java.util.Scanner;

public class STRINGS_MAX_FREQUENCY_CHARACTER {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String ss=scn.next();
		System.out.println(maxfre(ss));

	}
public static char maxfre(String ss) {
	
	char ch='-';
	int max=0;
	for(int i=0;i<ss.length();i++) {
		int count=0;
		for(int j=i+1;j<ss.length();j++) {
			if(ss.charAt(i)==ss.charAt(j)) {
				count++;
			}	
		}
		if(count>max) {
			max=count;
			ch=ss.charAt(i);
		}
	}
	return ch;
}
}

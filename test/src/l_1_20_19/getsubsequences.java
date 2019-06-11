package l_1_20_19;

import java.util.ArrayList;
import java.util.Scanner;

public class getsubsequences {
static Scanner scn=new Scanner(System.in);
	public static void main(String[] args) {
		String str=scn.next();
				//System.out.println(getsubstringascii(str));
				System.out.println(getsubstring(str));
	}
public static ArrayList<String> getsubstringascii(String str) {
	if(str.length()==0) {
		ArrayList<String> br=new ArrayList<>();
		br.add("");
		return br;
	}
	
	char ch=str.charAt(0);
	String ros=str.substring(1);
	ArrayList<String> rr=getsubstringascii(ros);
	ArrayList<String> mr=new ArrayList<>();
	for(String val:rr) {
		mr.add(val);
		mr.add(val+ch);
		mr.add(val+(int)ch);
	}
	
	return mr;
}
public static ArrayList<String> getsubstring(String str) {
	if(str.length()==0) {
		ArrayList<String> br=new ArrayList<>();
		br.add("");
		return br;
	}
	
	char ch=str.charAt(0);
	String ros=str.substring(1);
	ArrayList<String> rr=getsubstring(ros);
	ArrayList<String> mr=new ArrayList<>();
	for(String val:rr) {
		mr.add(val);
		mr.add(val+ch);
	}
	
	return mr;
}

}

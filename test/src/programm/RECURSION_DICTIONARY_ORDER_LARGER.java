package programm;

import java.util.Scanner;

public class RECURSION_DICTIONARY_ORDER_LARGER {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String ss=scn.next();
		dictionaryprint(ss,"",ss);

	}
	public static void dictionaryprint(String ss, String ans,String s) {
		if(ss.length()==0) {
			for(int i=0;i<ans.length();i++) {
			if(ans.charAt(i)>s.charAt(i)) {
				System.out.println(ans);
				return;
			}else if(ans.charAt(i)<s.charAt(i))
				return;
			}
			return ;
		}
		for(int i=0;i<ss.length();i++) {
			char ch =ss.charAt(i);
			String ros=ss.substring(0, i)+ss.substring(i+1);
		
			dictionaryprint(ros,ans+ch,s);
			
		}
		return;
		
	}
}

package l_2_2_19;

public class Kpc {

	public static void main(String[] args) {
		Kpc("145","");

	}
public static void Kpc(String num,String ans) {
	if(num.length()==0) {
		System.out.println(ans);
		return;
	}
	
	char ch=num.charAt(0);
	String ron=num.substring(1);
	
	String ss=getCode(ch);
	for(int i=0;i<ss.length();i++) {
		Kpc(ron,ans+ss.charAt(i));
	}
	
}
public static String getCode(char ch) {

	if (ch == '1')
		return "abc";
	else if (ch == '2')
		return "def";
	else if (ch == '3')
		return "ghi";
	else if (ch == '4')
		return "jk";
	else if (ch == '5')
		return "lmno";
	else if (ch == '6')
		return "pqr";
	else if (ch == '7')
		return "stu";
	else if (ch == '8')
		return "vwx";
	else if (ch == '9')
		return "yz";
	else if (ch == '0')
		return "@#";
	else
		return "";
}

}

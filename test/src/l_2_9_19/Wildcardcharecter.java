package l_2_9_19;

public class Wildcardcharecter {

	public static void main(String[] args) {
		
	}
public static void convertbinary(String ss,String ans) {
	
	
	char ch=ss.charAt(0);
	String ros=ss.substring(1);
	if(ch!='0'||ch!='1') {
	convertbinary(ros, ans+"0");
	convertbinary(ros, ans+"1");
	}
}
}

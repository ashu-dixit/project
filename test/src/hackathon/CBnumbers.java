package hackathon;

import java.util.ArrayList;

public class CBnumbers {

	public static void main(String[] args) {
		

	}
public static ArrayList<String> substring(String s) {
	//base case
	if(s.length()==0) {
	ArrayList<String> br=new ArrayList<>();
	br.add("");
	return br;
	}
	//Smaller work
	char ch=s.charAt(0);
	s=s.substring(1);
	ArrayList<String> rr=substring(s);
	ArrayList<String> mr=new ArrayList<>();
	//self work
	for(String val:rr) {
		mr.add(val);
		mr.add(ch+val);
		
	}
	int[] n=conversion
	
	return mr;
}
public static int[] Conversion(ArrayList<String> mr) {
	String[] s=(String[]) mr.toArray();
	int[] n=new int[s.length];
	int i=0;
	for( i=1;i<s.length;i++);
	n[i]=Integer.parseInt(s[i]);
	
	return n;
}
public static int[]  sort(int[] n) {
	for(int counter=1;counter<n.length;counter++) {
		int temp=n[counter];
		int j=counter-1;
		while(j>=0 && n[j]>temp) {
			n[j+1]=n[j];
		j--;
		}
		n[j+1]=temp;
	}
	return n;
	
}
public static void name() {
	
}

}

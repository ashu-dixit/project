package programm;

import java.util.Scanner;

public class Boardpath {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		System.out.println(path(0,n,"",m));
	}
public static int path(int cr,int end, String ans,int m) {
	if(cr>=end) {
		System.out.println(ans);
		return 1;
	}
	int a=0;
	for(int i=1;i<=m&&cr+i<=end;i++)
	a+=path(cr+i,end,ans+i,m);
	
	
	return a;
	
}
}

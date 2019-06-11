package programm;

import java.util.Scanner;

public class MAZE_PATH_D2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int er=scn.nextInt();
		int ec=er;
		System.out.println(path(1, 1, er, ec, ""));
	}
public static int path(int cr,int cc,int er, int ec,String ans) {
	if(cr==er&&cc==ec) {
		System.out.println(ans);
		return 1;
	}
	if(cr>er||cc>ec)
		return 0;
	int a=0;
	a+=path(cr+1, cc, er, ec, ans+'V');
	a+=path(cr, cc+1, er, ec, ans+'H');
	if(cr==cc||cr+cc==ec+1)
	a+=path(cr+1, cc+1, er, ec, ans+'D');
	return a;
}

}

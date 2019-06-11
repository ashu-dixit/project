package programm;
//wrong but why
import java.util.Scanner;

public class HollowStarPattern {

	public static void main(String[] args) {
	int row=5;
	int rowno=1;
	int nsp=-1;
	int nst=5;
	while(rowno<row) {
		int cst=1;
		while(cst<=nst) {
			int csp=1;
			if(cst==nst/2) {
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
				cst++;
			}}
			cst++;
		}
		
	
	
	}
}
}
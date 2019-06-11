package hackathon;

import java.util.Scanner;

public class Murthalparathas {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int p = scn.nextInt();
		System.out.println(time(rankarr(), p));
	}

	public static int[] rankarr() {
		int c = scn.nextInt();
		int[] rl = new int[c];
		for (int i = 0; i < c; i++)
			rl[i] = scn.nextInt();
		return rl;
	}

	public static int time(int[] rl, int P) {
		int t = 0;
		// where 'p' is paratha made by smaller rank one
		int p = 0;
		int lot=P*(P+1)*rl[0]/2;
		int hit=P*(P+1)*rl[rl.length-1];
		int mid=(lot+hit)/2;
		while(lot<=hit) {
			
			
			
		}
		
		
		return t;
	}
}

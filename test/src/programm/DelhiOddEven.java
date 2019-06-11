package programm;

import java.util.Scanner;

public class DelhiOddEven {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int testcase=scn.nextInt();
		int count =1;
		while(testcase>=count) {
			int carno=scn.nextInt();
			int sumedig=0;
			int sumodig=0;
			while(carno!=0) {
				if((carno%10)%2==0)
					sumedig=sumedig+carno%10;
				else
					sumodig=sumodig+carno%10;
				carno/=10;
			}
			if(sumedig%4==0|| sumodig%3==0)
				System.out.println("Yes");
			else
				System.out.println("No");
			
			
			count++;
		}

	}

}

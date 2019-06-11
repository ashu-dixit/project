package test;

import java.util.Scanner;

//Faculty at CodingBlocks loves to purchase smartphones and decides to play a game. 
//Aayush and Harshit decides to shop for smartphones. 
//Aayush purchases 1 smartphone, then Harshit purchases 2 smartphones, 
//then Aayush purchases 3 smartphones, then Harshit purchases 4 smartphones, and so on.
//Once someone can't purchase more smartphones, he loses.
//
//Aayush can purchase at most M smartphones and Harshit can purchase at most N smartphones.
//Who will win ? Print "Aayush" and "Harshit" accordingly.
public class AyushHarshit {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int testcase = scn.nextInt();
		
		int check = 0;
		int count = 1;

		while (count <= testcase) {
			int ayush = scn.nextInt();
			int ayu = 1, har = 2;
			int sumayu = 0, sumhar = 0;
			int harshit = scn.nextInt();
			while (true) {
				sumayu = sumayu + ayu;
				sumhar = sumhar + har;

				ayu = ayu + 2;
				har = har + 2;
				if (sumayu > ayush) {
					System.out.println("Harshit");
					break;
				}
				if (sumhar > harshit) {
					System.out.println("Aayush");
					break;
				}
			}
			count = count + 1;
		}

	}

}

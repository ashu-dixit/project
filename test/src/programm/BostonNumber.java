package programm;

import java.util.Scanner;

public class BostonNumber {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		int num=scn.nextInt();
		/*System.out.println(primrfactors(num));
		System.out.println(sumdigit(num));
		System.out.println(primesum(num));*/
		if(primesum(num)==sumdigit(num))
			System.out.println(1);
		else
			System.out.println(0);
	}
public static int sumdigit(int num) {
	int sum=0;
	while(num!=0) {
		sum+=num%10;
		num/=10;
	}
	return sum;
}


public static int primrfactors(int num) {
	int sumprime=0;
	int prime = 2;
	int cum=num;
	while (prime <= num) {
		int factor = 0, countin = 1;
		while (countin <= prime) {
			if (prime % countin == 0) {
				factor = factor + 1;
			}
			countin = countin + 1;
		}
		
		if (factor == 2) {
			for(int i=1;;i++) {
				if(cum%prime==0) {
					if(prime>=10)
						sumprime+=sumdigit(prime);
					else
					sumprime+=prime;
					cum/=prime;}
				else
					break;
			}
		}
		prime = prime + 1;

	}
		return sumprime;

}
 public static int primesum(int num) {
	 
	  
	 int sumprime=0;
	 for(int prime=2;prime<=num;prime++) {
		 int check=0;
		 for(int j=2;j<=Math.sqrt(prime);j++) {
			 if(prime%j==0) {
				 check=1;
				 break;
			 }
			 }
		 if(check==0) {
			 for(int i=1;;i++) {
					if(num%prime==0) {
						if(prime>=10)
							sumprime+=sumdigit(prime);
						else
						sumprime+=prime;
						num/=prime;}
					else
						break;
				}
		 }
	 }
	 return sumprime;
}
}

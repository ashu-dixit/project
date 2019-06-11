package test;

public class DEGREETOFARHENITE {

	public static void main(String[] args) {
		int cel=0;
		int dif=20;
		int far;
		
		while(cel!=320) {
			far=(int)((5.0/9.0)*(cel-32));
			System.out.println(cel+" "+far);
			cel=cel+dif;
			
		}

	}

}

package l_2_16_19;

public class Stackclient {

	public static void main(String[] args) throws Exception {
			
		Stack s1=new Stack(4);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		
		s1.display();
		
		System.out.println(s1.pop());
		
		System.out.println(s1.peek());
		
		
	}

}

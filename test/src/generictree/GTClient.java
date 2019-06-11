package generictree;

public class GTClient {
	// 10 3 20 2 50 0 60 0 30 2 70 0 110 0 40 3 80 0 90 0 100 2 120 1 130 0 140 0
	//				  10
	//			/	   |		\
	//		20		  30			40
	//	   /\		 /	 \	  	 /   |   \
	//	 50  60		70	 110	80	90	100
	
	public static void main(String[] args) {
		GenericTree gt=new GenericTree();
		gt.display();
		
//		System.out.println(gt.size());
//		System.out.println(gt.max());
//		System.out.println(gt.hieght());
		System.out.println("-----------------------------");
//		System.out.println(gt.find(7));
//		gt.mirror();
//		gt.display();
//		gt.printlevel(0);
//		gt.display();
		
//		gt.linearize();
//  	gt.display();
//		
//		gt.preorder();
//		gt.display();
//		gt.levelorderLW3();
//		gt.levelorderzz();
		
		gt.multitask(3);	
		
	}

}

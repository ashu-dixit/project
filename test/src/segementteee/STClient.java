package segementteee;

public class STClient {

	public static void main(String[] args) {
		int[] arr= {5,2,10,3,-6,-4,12,13};
		SegementTree st=new SegementTree(arr);
		
		st.display();
		
		System.out.println(st.query(2, 4 ));
		
		st.update(3, 13);
		
		System.out.println(st.query(3, 3));
		
	}

}

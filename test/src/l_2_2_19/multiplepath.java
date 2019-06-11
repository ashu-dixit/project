package l_2_2_19;

public class multiplepath {

	public static void main(String[] args) {
		mulpath(0, 0, 3, 3, "");

	}

	public static void mulpath(int cr,int cc,int ec,int er,String ss) {
	if(cr==er&&cc==ec) {
		System.out.println(ss);
		return;
		
	}
	
	
	for(int i=1;i<ec&&cc<ec;i++) {
		mulpath(cr, cc+i, ec, er, ss+"V"+i);
	}
	for(int i=1;i<er&&cr<er;i++) {
		mulpath(cr+i, cc, ec, er, ss+"H"+i);
	}
	for(int i=1;i<er&&i<ec&&cc<ec&&cr<er;i++) {
		mulpath(cr+i, cc+i, ec, er, ss+"D"+i);
	}
	
}
}

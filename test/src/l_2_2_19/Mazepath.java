package l_2_2_19;

public class Mazepath {

	public static void main(String[] args) {
		path(0,0,2,2,"");

	}
public static void path(int cr,int cc,int er,int ec,String str) {
	if(cr==er&&cc==ec) {
		System.out.println(str);
		return;
	}
	
	if(cc>ec||cr>er) {
		return;
	}
	path(cr+1,cc,er,ec,str+"H");
	path(cr,cc+1,er,ec,str+"V");
	
	
}
}

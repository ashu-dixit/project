package hauffmancoding;

public class HauffmanClient {

	public static void main(String[] args) {
		
		
		HauffmanCoding hc=new HauffmanCoding("aaaaaabbbcccddddddddd");
		
		System.out.println(hc.encode("abcd"));
		//System.out.println(hc.decode());
		
	}

}

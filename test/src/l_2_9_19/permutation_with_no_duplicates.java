package l_2_9_19;

public class permutation_with_no_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		permutation("aab", "");
	}
	public static void permutation(String ss,String ans) {
		if(ss.length()==0) {
			System.out.println(ans);
		}
		
		boolean[] valueof=new boolean[256];
		for(int i=0;i<ss.length();i++) {
			char ch=ss.charAt(i);
			String ros=ss.substring(0, i)+ss.substring(i+1);
			
			if(!valueof[ch])
			permutation(ros, ans+ch);
			valueof[ch] =true;
		}
	}

}

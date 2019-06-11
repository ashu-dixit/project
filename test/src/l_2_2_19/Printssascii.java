package l_2_2_19;

public class Printssascii {

	public static void main(String[] args) {
		print("abc", "");
	}

	public static void print(String qos, String ans) {
		if (qos.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = qos.charAt(0);
		qos = qos.substring(1);

		print(qos, ans);
		print(qos, ans + ch);
		print(qos, ans + ch + (int) ch);
	}
}

package l_2_2_19;

public class Permutation {

	public static void main(String[] args) {
		permutation1("abc", "");
		System.out.println("------------");
		permutation2("abc", "");
	}

	public static void permutation1(String qos, String ans) {
		if (qos.length() == 0) {
			System.out.println(ans);
			return;
		}

		char ch = qos.charAt(0);
		qos = qos.substring(1);
		for (int i = 0; i <= ans.length(); i++) {
			permutation1(qos, ans.substring(0, i) + ch + ans.substring(i));
		}

	}

	public static void permutation2(String qos, String ans) {
		if (qos.length() == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 0; i < qos.length(); i++) {
			char ch = qos.charAt(i);

			String roq = qos.substring(0, i) + qos.substring(i + 1);
			permutation2(roq, ans + ch);

		}

	}
}

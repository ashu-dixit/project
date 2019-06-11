package l_2_9_19;

public class COIN_TOSS {

	public static void main(String[] args) {
//		cointoss(3, "");
		cointossnoconsicutive(3, "", false);
	}

	public static void cointoss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		cointoss(n - 1, ans + "H");
		cointoss(n - 1, ans + "T");

	}

	public static void cointossnoconsicutive(int n, String ans, boolean value) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		if (value) {
			cointossnoconsicutive(n - 1, ans + "T", false);
		} else {
			cointossnoconsicutive(n - 1, ans + "H", true);
			cointossnoconsicutive(n - 1, ans + "T", false);
		}

	}
}

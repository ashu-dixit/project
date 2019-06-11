package l_2_10_19;

public class NUm_of_substring_palindrome {

	public static void main(String[] args) {
		System.out.println(countpalindromicss("niti"));

	}

	public static int countpalindromicss(String ss) {
		int count = 0;

		for (int axis = 0; axis < ss.length(); axis++) {
			for (int orbit = 1; axis - orbit >= 0 && axis + orbit < ss.length(); orbit++) {
				if (ss.charAt(axis - orbit) == ss.charAt(axis + orbit)) {
					count++;
				} else
					break;

			}
		}
		for (double axis = 0.5; axis < ss.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < ss.length(); orbit++) {
				if (ss.charAt((int) (axis - orbit)) == ss.charAt((int) (axis + orbit))) {
					count++;
				} else
					break;

			}
		}

		return count;
	}

}

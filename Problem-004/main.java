/******************************************************************************
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 ******************************************************************************/

public class main {
	public static void main(String[] args) {
		int palindrome = 0;

		for (int i = 100; i < 1000; ++i) {
			for (int j = 100; j < 1000; ++j) {
				int val = i * j;

				String strVal = Integer.toString(val);

				String reverse = "";

				for (int k = strVal.length() - 1; k >= 0; k--) {
					reverse += strVal.charAt(k);
				}

				if (strVal.equals(reverse)
						&& Integer.parseInt(strVal) > palindrome) {
					palindrome = Integer.parseInt(strVal);
				}
			}
		}

		System.out.println("Largest Palindrome: " + palindrome);
	}
}

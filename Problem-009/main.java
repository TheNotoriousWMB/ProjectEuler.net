/******************************************************************************
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which, a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 ******************************************************************************/

public class main {
	public static final int NUM = 1000;

	public static void main(String[] args) {
		int a = 0, b = 0;

		for (b = 2; b < NUM; ++b)
			for (a = 1; a < b; ++a)
				if ((a + b + getC(a, b)) == 1000 && b < getC(a, b)) {
					System.out.println(a + " + " + b + " + " + (int) getC(a, b)
							+ " = " + (int) (a + b + getC(a, b)));
					System.out.println(a + " * " + b + " * " + (int) getC(a, b)
							+ " = " + (long) (a * b * getC(a, b)));
				}
	}

	public static double getC(int a, int b) {
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
}

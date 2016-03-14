/******************************************************************************
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 ******************************************************************************/

public class main {
	public static void main(String[] args) {
		for (int sol = 2520; true; sol += 20) {
			if (test(sol)) {
				System.out.println("Smallest Passing Multiple: " + sol);

				break;
			}
		}
	}

	public static boolean test(int x) {
		for (int i = 2; i <= 20; ++i) {
			if (x % i != 0) {
				return false;
			}
		}

		return true;
	}
}

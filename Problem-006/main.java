/******************************************************************************
 * The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... +
 * 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... +
 * 10^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 − 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 ******************************************************************************/

public class main {
	public static final int MAX = 100;

	public static void main(String[] args) {
		int sumOfSquares = 0;
		int sqaureOfSums = 0;

		for (int i = 1; i <= MAX; ++i)
			sumOfSquares += Math.pow(i, 2);

		for (int i = 1; i <= MAX; ++i)
			sqaureOfSums += i;

		sqaureOfSums = (int) Math.pow(sqaureOfSums, 2);

		System.out.println(sqaureOfSums + " - " + sumOfSquares + " = "
				+ (sqaureOfSums - sumOfSquares));
	}
}

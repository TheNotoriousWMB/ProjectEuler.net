import java.util.Arrays;

/******************************************************************************
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 ******************************************************************************/

public class main {
	public static void main(String[] args) {
		int n = 10;
		int target = 10001;

		while ((n / Math.log(n)) < target)
			n *= 10;

		boolean prime[] = new boolean[n + 1];
		Arrays.fill(prime, true);

		for (int i = 2; i <= Math.sqrt(n); ++i)
			if (prime[i])
				for (int j = i * 2; j <= n; j += i)
					prime[j] = false;

		int count = 0;

		for (int i = 2; i < n; ++i) {
			if (prime[i])
				count++;

			if (count == target) {
				System.out.printf("Prime number #%d = %d\n", target, i);
				break;
			}
		}
	}
}

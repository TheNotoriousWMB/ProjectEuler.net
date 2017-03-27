import java.util.Arrays;

/******************************************************************************
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 ******************************************************************************/

public class main {
	public static void main(String[] args) {
		int n = 2000000;

		boolean prime[] = new boolean[n];
		Arrays.fill(prime, true);

		for (int i = 2; i <= Math.sqrt(n); ++i)
			if (prime[i])
				for (int j = i * 2; j < n; j += i)
					prime[j] = false;

		long sum = 0;

		for (int i = 2; i < n; ++i)
			if (prime[i])
				sum += i;

		System.out.printf("Sum of primes below %d = %d\n", n, sum);
	}
}

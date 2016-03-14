/******************************************************************************
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143 ?
 ******************************************************************************/

public class main {

	public static void main(String[] args) {
		final long num = 600851475143L;

		long factor = 2L;

		while (true) {
			long temp = num / factor;

			if (num % temp == 0 && isPrime(temp)) {
				factor = temp;
				break;
			}
			factor++;
		}

		System.out.println("Largest Factor: " + factor);
	}

	public static boolean isPrime(long n) {
		if (n % 2 == 0) {
			return false;
		}

		long half = (n / 2) % 2 == 0 ? (n / 2) - 1 : n / 2;

		for (int i = 3; i < half; i += 2) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}

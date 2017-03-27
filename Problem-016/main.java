import java.math.BigInteger;

/******************************************************************************
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 21000?
 * *****************************************************************************/

public class main {
	public static void main(String[] args) {
		int n = 1000, sum = 0;
		String power = (new BigInteger("2").pow(n)).toString();

		System.out.printf("Sum of digits in %s = ", power);

		for (char c : power.toCharArray())
			sum += Integer.parseInt(c + "");

		System.out.printf("%d\n", sum);
	}
}

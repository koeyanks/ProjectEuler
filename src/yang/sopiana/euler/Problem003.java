package yang.sopiana.euler;

public class Problem003 
{
	/*
	 * Problem 3
	 * 
	 * The prime factors of 13195 are 5, 7, 13 and 29.
	 * What is the largest prime factor of the number 600851475143 ?
	 *
	 * Thanks to Lars Vogel: http://www.vogella.com/tutorials/JavaAlgorithmsPrimeFactorization/article.html
	 */
	public static Long primeFactors(long numbers) 
	{
		long n = numbers;
		Long factor=0l;
		for (Long i = 2l; i <= n / i; i++) 
		{
			while (n % i == 0) 
			{
				factor = i;
				n /= i;
			}
		}
		
		return factor;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Largest Prime Number is:"+primeFactors(600851475143l));
	}
}

package yang.sopiana.euler;

import java.math.BigInteger;

public class Problem007 
{
	/**
	 * Problem 7
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
	 * What is the 10 001st prime number?
	 */
	public static final long[] first5Primes= {2l, 3l, 5l, 7l, 11l, 13l};
	
	public static void main(String[]args)
	{
		int max = 10001;
		BigInteger temp;
		int counter = first5Primes.length;
		long i=first5Primes[first5Primes.length-1];
		while(counter<max)
		{
			i+=2;
			if(i%first5Primes[1]==0||i%first5Primes[2]==0||i%first5Primes[3]==0||i%first5Primes[4]==0)
				continue;
			temp = BigInteger.valueOf(i);
			if(temp.isProbablePrime(10000))
			{
				System.out.println("Prime["+counter+"] = "+i);
				counter++;
			}
			
		}
	}
}

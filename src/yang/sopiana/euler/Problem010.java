package yang.sopiana.euler;

import java.math.BigInteger;

public class Problem010 
{
public static final long[] first5Primes= {2l, 3l, 5l, 7l, 11l};
	
	public static void main(String[]args)
	{
		int max = 2000000;
		BigInteger temp;
		long start = System.nanoTime();
		long i=first5Primes[first5Primes.length-1];
		long result = first5Primes[0]+first5Primes[1]+first5Primes[2]+first5Primes[3]+first5Primes[4];
		while(i<max)
		{
			i+=2;
			if(i%first5Primes[1]==0||i%first5Primes[2]==0||i%first5Primes[3]==0||i%first5Primes[4]==0)
				continue;
			temp = BigInteger.valueOf(i);
			if(temp.isProbablePrime(Integer.MAX_VALUE))
			{
				result+=i;
			}
			
		}
		System.out.println(result);
		System.out.println("Finish in:"+(System.nanoTime()-start));
	}
}

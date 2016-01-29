package yang.sopiana.euler;

public class Problem005 
{
	/*
	 * Problem 5
	 * 
	 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
	 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	 */
	public static long gcd(long a, long b)
	{
		long temp;
	    while(b != 0)
	    {
	       temp = b; 
	       b = a % b; 
	       a = temp; 
	    }
	    return a;
	}
	
	public static long lcm(long a,long b)
	{
		return a*b/gcd(a,b);
	}
	
	public static void main(String[]args)
	{
		long counter = 20;
		long result = lcm(counter-1,counter);
		counter-=2;
		while(counter>0)
		{
			result = lcm(counter,result);
			--counter;
		}
		System.out.println(result);
	}
}

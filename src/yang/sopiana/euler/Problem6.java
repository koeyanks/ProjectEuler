package yang.sopiana.euler;

public class Problem6 
{
	/*
	 * Problem 6
	 * 
	 * The sum of the squares of the first ten natural numbers is,
	 * 
	 * 12 + 22 + ... + 102 = 385
	 * 
	 * The square of the sum of the first ten natural numbers is,
	 * 
	 * (1 + 2 + ... + 10)2 = 552 = 3025
	 * 
	 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 
	 * 3025 − 385 = 2640.
	 * 
	 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	 */
	public static void main(String[]args)
	{
		int max = 100;
		long sos=0;
		long sum = max*(max+1)/2;
		while(max>0)
			sos+=max*max--;
		sum*=sum;
		System.out.println(sum-sos);
	}
}

package yang.sopiana.euler;

public class Problem1 {
	/*
	 * Problem:
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these 
	 * multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.*/
	public static void main(String[]args)
	{
		int maximumNumber = 1000;
		//Maximum number can be divided by 3
		int max3 = 3*((maximumNumber-1)/3);
		int max5 = 5*((maximumNumber-1)/5);
		int max15 = 15*((maximumNumber-1)/15);
		
		//sum of 3 = 3 + 6 + 9 + 12 + ... + max3
		//		   = 3 * ( 1 + 2 + 3 + 4 + ... + max3/3)
		//         = 3 * (n(n+1)/2) where n = max3/3
		int sum3 = 3 * ((max3/3)*((max3/3)+1)>>1);
		
		//sum of 5 = 5 + 10 + 15 + .... + max5
		//do same thing as sum3
		int sum5 = 5 * ((max5/5)*((max5/5)+1)>>1);
		
		//do same thing as sum3 and sum5
		int sum15 = 15 * ((max15/15)*((max15/15)+1)>>1);
		
		int result = sum3 + sum5 - sum15;
		System.out.println(result);
	}
}

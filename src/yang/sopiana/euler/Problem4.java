package yang.sopiana.euler;

public class Problem4 
{
	/*
	 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit 
	 * numbers is 9009 = 91 × 99.
	 *
	 * Find the largest palindrome made from the product of two 3-digit numbers.
	 */
	public static boolean checkPalindrom(long val)
	{
		long temp = val;
        long reverse = 0;

        while (temp != 0) 
        {
            long remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }

        if (val == reverse) 
            return true;
        return false;
	}
	
	public static void main(String[] args)
	{
		long palindrome=1;
		long largestPalindrome=0;
		for(int i=999;i>0;--i)
		{
			for(int j=999;j>0;--j)
			{
				palindrome = i*j;
				if(checkPalindrom(palindrome))
				{
					if(palindrome>largestPalindrome)
						largestPalindrome = palindrome;
				}
			}
		}
		System.out.println(largestPalindrome);
	}
}

package yang.sopiana.euler;

import java.math.BigInteger;

public class Problem016 {
	public static void main(String[]args)
	{
		
		BigInteger res=new BigInteger("2");
		res = res.pow(1000);
		String resStr = res.toString();
		int sumOfDigit = 0;
		for(int i=0;i<resStr.length();++i)
		{
			sumOfDigit+=(int)(resStr.charAt(i)-'0');
		}
		System.out.println(sumOfDigit);
	}
}

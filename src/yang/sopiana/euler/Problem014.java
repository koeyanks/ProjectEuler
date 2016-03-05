package yang.sopiana.euler;

public class Problem014 {
	public static int getCollatzChainLength(long start)
	{
		int length = 1;
		while(start!=1)
		{
			if(start%2==0)
				start = start>>1;
			else
				start = start*3+1;
			++length;
		}
		return length;
	}
	public static void main(String[]args)
	{
		int collatzChainLength = 0;
		int longestStart = 0;
		int tempChainLength = 0;
		for(int i=1;i<=1000000;++i)
		{
			tempChainLength = getCollatzChainLength(i);
			if(tempChainLength>collatzChainLength)
			{
				collatzChainLength = tempChainLength;
				longestStart = i;
			}
		}
		System.out.println(longestStart);
	}
}

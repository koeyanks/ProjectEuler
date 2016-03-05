package yang.sopiana.euler;

public class Problem012 {
	static long calculateTriangular(long number)
	{
		return (number*(number+1)/2);
	}
	
	static int getNumberOfDivisor(long number)
	{
		int count=2;
		long sqrtNum = (long)Math.ceil(Math.sqrt(number));
		if(number==1)
			return 1;
		for(int i=2;i<sqrtNum;++i)
		{
			if(number%i==0)
				count+=2;
		}
		return count;
	}
	
	public static void main(String[]args)
	{
		long triangularNumber = 0;
		int numOfDivisor = 0;
		int counter = 1;
		while(true)
		{
			triangularNumber = calculateTriangular(counter++);
			numOfDivisor = getNumberOfDivisor(triangularNumber);
			if(numOfDivisor>500)
				break;
		}
		System.out.println("Triangular number:"+triangularNumber);
	}
}

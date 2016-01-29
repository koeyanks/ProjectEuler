package yang.sopiana.euler;

public class Problem009 
{
	/*
	 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
	 * a2 + b2 = c2
	 * For example, 32 + 42 = 9 + 16 = 25 = 52.
	 * 
	 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
	 * Find the product abc.
	 */
	public static void main(String[]args)
	{
		int a=2;
		int b=1;
		int c=0;
		boolean found=false;
		for(;a<1000;++a)
		{
			for(b=1;a+b<1000;++b)
			{
				double cd = Math.sqrt(a*a+b*b);
				if(cd==Math.floor(cd))
				{
					c=(int)cd;
					if(a+b+c==1000)
					{
						found=true;
						break;
					}
				}
			}
			if(found)
				break;
		}
		System.out.println(a*b*c);
	}
}

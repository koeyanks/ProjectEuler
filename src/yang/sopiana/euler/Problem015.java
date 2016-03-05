package yang.sopiana.euler;

public class Problem015 {
	public static void main(String []args)
	{
		/**
		 * lattice path = ((n+k)!)/k!
		 * since n = k;
		 * lattice path =(2n)!/n!
		 * lattice path = ((2n)(2n-1)....1))/((n)(n-1)...1)
		 */
		int gridSize = 20;
		long path =1;
		for(int i=0 ; i < gridSize ;i++)
		{
			path *= 2*gridSize-i;
			path /= (i+1);
		}
		System.out.println(path);
	}
}

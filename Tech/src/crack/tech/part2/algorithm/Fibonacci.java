package crack.tech.part2.algorithm;

public class Fibonacci {
private Fibonacci()
{
	
}
	public int getFibonacci(int n)
	{
		if (n <= 0) return 0;
		else if (n == 1) return 1;
		else if (n == 2) return 2;
		
		return getFibonacci(n-1) + getFibonacci(n-2);
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		for (int n = 1; n < 10; n++)
		{
			System.out.println("n: " + n + ", Fibonacci: " + f.getFibonacci(n));
		}
	}

}

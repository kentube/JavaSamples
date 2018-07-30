package crack.tech.part1.datastructures;

/**
 * 1.1 
 * Implement an algorithm to 
 * determine if a string has all unique characters 
 * What if you can not use additional data structures?
 * @author Kenneth
 *
 */
public class Chap01Q01_UniqueCharacters {
	
	public static void main(String[] args)
	{
		String aString = "aDBse";		
		int length = aString.length();
		char ch = aString.charAt(0);
		for (int i = 1; i < length; i++)
		{
			if (aString.charAt(i) != ch)
			{
				System.err.println("Not same");
				System.exit(0);
			}
		}
		System.out.println("All same");
		System.exit(1);
	}
}

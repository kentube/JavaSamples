package crack.tech.datastructures;

/**
 * 1.2 Write code to reverse a C-Style String 
 * (C-String means that “abcd” is represented as five characters, including the null character )
 * @author Kenneth
 *
 */
public class Chap01Q02_ReverseString {

	public static void main(String[] args) {
		String testString = "AdBdwa";
		char[] chars = testString.toCharArray();
		int len = testString.length();
		for (int i=0; i<len/2; i++)
		{
			char ch = chars[i];
			chars[i] = chars[len-1-i];
			chars[len-1-i] = ch;
		}
		String reverseString = new String(chars);
		System.out.println(testString + " -> " + reverseString);
	}
}

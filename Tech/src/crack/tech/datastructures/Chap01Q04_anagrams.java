package crack.tech.datastructures;

import java.util.Arrays;

/**
 * 1.4 Write a method to decide if two strings are anagrams or not
 * 
 * @author Kenneth
 */
public class Chap01Q04_anagrams {

	public static void main(String[] args) {
		String[][] pairs = { { "apple", "papel" }, { "carrot", "tarroc" }, { "hello", "llloh" } };
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = anagram(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}

	public static boolean anagram(String word1, String word2) {
		char[] chars1 = word1.toCharArray();
		Arrays.sort(chars1);
		char[] chars2 = word2.toCharArray();
		Arrays.sort(chars2);
		return new String(chars1).equals(new String(chars2));
	}

}

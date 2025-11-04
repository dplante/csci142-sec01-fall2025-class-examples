package recursion;

/**
 * 
 * Example of when NOT to use recursion (since easier to just use an iterative
 * approach), but good basic example. Develop a code to calculate the length of
 * an array of characters that is terminated by \0.
 * 
 * @author dplante
 *
 */
public class RecursiveWordLength {

	public static void main(String[] args) {
		new RecursiveWordLength();
	}

	public RecursiveWordLength() {
		int wordLength;
		char word[] = { 'H', 'e', 'l', 'l', 'o', '\0' };
		// char word[] = {'\0'};

		System.out.println("Iterative case:");
		wordLength = this.lengthIterative(word);
		System.out.println("Length = " + wordLength);
		System.out.println("");

		System.out.println("Recursive case:");
		wordLength = this.lengthRecursive(word);
		System.out.println("Length = " + wordLength);

	}

	// Iterative approach
	public int lengthIterative(char[] word) {
		int index = 0;

		while (word[index] != '\0') {
			index++;
		}

		return index;
	}

	// Recursive approach
	/*
	 * Uses method "overloading" of lengthRecursive(), which we can only do if you
	 * pass in different parameters! It is not enough to just return a different
	 * type.
	 * 
	 * That differs from method "overriding" like we did with toString() which is in
	 * Object but we can override it in a class that extends Object (or any other
	 * class).
	 */
	public int lengthRecursive(char[] word) {
		int index = 0;

		index = this.lengthRecursive(word, index);

		return index;
	}

	private int lengthRecursive(char[] word, int index) {

		if (word[index] != '\0') {
			index = 1 + this.lengthRecursive(word, ++index);
		} else {
			return 0;
		}

		return index;
	}

}

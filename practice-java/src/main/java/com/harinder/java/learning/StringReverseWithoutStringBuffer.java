package com.harinder.java.learning;

public class StringReverseWithoutStringBuffer {

	public static void main(String[] args) {
		String originalString = "abcde";

		System.out.println("Original String = " + originalString);
		System.out.println("Reverse String = " + reverseString(originalString));
	}

	private static String reverseString(String parString) {
		char[] stringCharacters = parString.toCharArray();
		char temp;
		for (int i = 0, j = stringCharacters.length - 1; i < (stringCharacters.length) / 2; i++, j--) {
			temp = stringCharacters[i];
			stringCharacters[i] = stringCharacters[j];
			stringCharacters[j] = temp;
		}
		return new String(stringCharacters);

	}
}

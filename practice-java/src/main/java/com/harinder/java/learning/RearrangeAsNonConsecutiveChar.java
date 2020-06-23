package com.harinder.java.learning;

public class RearrangeAsNonConsecutiveChar {
	public static void main(String[] args) {
		String str = "abcd";
		reArrange(str);
	}

	private static void reArrange(String str) {
		char[] charArr = str.toCharArray();
		for (int i = 0; i < charArr.length; i++) {
			int ch1 = charArr[i], ch2;
			if (i != charArr.length - 1) {
				ch2 = charArr[i + 1];
			} else {
				ch2 = charArr[0];
			}
			if ((ch1 - ch2) == 1 || (ch1 - ch2) == -1) {
				System.out.println("Write logic to swap the Characters");
			}
		}
	}
}

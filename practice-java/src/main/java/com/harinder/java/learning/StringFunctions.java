package com.harinder.java.learning;

/*public class StringFunctions {

	public static boolean isPalindrome(String str, int start, int end) {
		boolean palindrome = false;
		for (int i = start, j = end; i < (start + end)/2; i++, j--) {
			if (str.charAt(i) == str.charAt(j)) {
				palindrome = true;
			} else {
				palindrome = false;
			}
		}
		return palindrome;
	}
	public static void main(String[] args) {
		System.out.println(isPalindrome("abaradar121", 3, 7));
	}

}*/

public class StringFunctions {

	public static void main(String[] args) {
		
		System.out.println(longestPalindromeString("abradar121"));
	}

	static public String intermediatePalindrome(String s, int left, int right) {
		if (left > right) return null;
		while (left >= 0 && right < s.length()
				&& s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return s.substring(left + 1, right);
	}

	// O(n^2)
	public static String longestPalindromeString(String s) {
		if (s == null) return null;
		String longest = s.substring(0, 1);
		for (int i = 0; i < s.length() - 1; i++) {
			//odd cases like 121
			String palindrome = intermediatePalindrome(s, i, i);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
			//even cases like 1221
			palindrome = intermediatePalindrome(s, i, i + 1);
			if (palindrome.length() > longest.length()) {
				longest = palindrome;
			}
		}
		return longest;
	}

}
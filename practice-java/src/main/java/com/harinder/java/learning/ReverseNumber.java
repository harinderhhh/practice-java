package com.harinder.java.learning;

public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalNumber = 123;
		System.out.println("original Number = " + originalNumber);
		System.out.println("Reverse Number = " + reverseNumber(originalNumber));
	}
	private static int reverseNumber(int originalNumber)
	{
		int reverse = 0;
		int remainder;
		while (originalNumber > 0)
		{
			remainder = originalNumber%10;
			originalNumber = originalNumber/10;
			reverse = reverse*10 + remainder;
		}
		return reverse;
	}

}

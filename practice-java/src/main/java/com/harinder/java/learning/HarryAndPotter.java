package com.harinder.java.learning;

public class HarryAndPotter {
	public static void main(String[] args) {
		String origStr = "abcabc";
		int len = origStr.length();
		int m = 1, n = 2;
		if (m >= len || n >= len)
			System.out.println("invalid input");
		
		int c = calculate(origStr, m, n, len);
		System.out.println(c);
		//System.out.println(origStr.substring(len-m, len) + origStr.substring(0, len-m));
	}
	private static int calculate(String origStr, int m, int n, int len)
	{
		int count = 0;
		String cut1 = "", cut2 = "";
		cut1 = cutFromEnd(origStr, m, len);
		System.out.println(cut1);
		count++;
		do
		{
			cut2 = cutFromEnd(cut1, n, len);
			System.out.println(cut2);
			count++;
			if (origStr.equals(cut2))
				return count;
			
			cut1 = cutFromEnd(cut2, m, len);
			System.out.println(cut1);
			count++;
			if (origStr.equals(cut1))
				return count; 
		}while (true);
	}
	private static String cutFromEnd(String str, int m, int len)
	{
		return str.substring(len-m, len) + str.substring(0, len-m); 
	}

}

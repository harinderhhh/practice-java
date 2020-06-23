package com.harinder.huawei;

public class CheckBinary {
	public static void isBinary(int num) {
		while (num > 0) {
			int last_digit = num % 10;
			num = num / 10;
			if (last_digit > 1) {
				System.out.println("Not a binary Number!!");
				return;
			}
		}
		System.out.println("It is a Binary Number!!");
	}
}

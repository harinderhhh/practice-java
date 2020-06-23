package com.harinder.huawei;

public class BinaryToDecimal {
	public static int convert(int bin) {
		int dec_num = 0;
		int temp = bin;

		int base = 1;

		while (temp > 0) {
			int last_digit = temp % 10;
			temp = temp / 10;
			dec_num = dec_num + last_digit * base;
			base = base * 2;
		}
		return dec_num;
	}
	public static void main(String[] args) {
		System.out.println("Decimal number: " + convert(10101));
	}
}
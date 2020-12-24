package com.interview;

public class ReverseInteger {

	public static void main(String[] args) {

		// 1. Using Loop
		long num = 123456789;
		long rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("Reverse Number = " + rev);

		System.out.println("------------------");

		// 2. Using String Buffer

		long num1 = 123456;

		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}

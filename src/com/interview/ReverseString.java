package com.interview;

public class ReverseString {

	public static void main(String[] args) {

		// 1. Using for loop
		String s = "Selenium";

		int len = s.length();
		System.out.println(len);

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);

		System.out.println("----------------------");

		// 2. Using String Buffer
		String s1 = "Raj Kumar Bhargav";

		StringBuffer sb = new StringBuffer(s1);

		System.out.println(sb.reverse());
	}

}

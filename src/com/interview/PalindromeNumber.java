package com.interview;

public class PalindromeNumber {

	// 151, 121, 123321, etc...

	public static void main(String[] args) {
		
		isPalindromeNumber(505);
		isPalindromeNumber(123);
		isPalindromeNumber(4224);
		
		System.out.println("=========================");
		isPalindromeCheck(125);
		isPalindromeCheck(1234554321);
	}

	public static void isPalindromeNumber(int num) {

		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10; // To get the remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (t == sum) {
			System.out.println("palidrome number");
		} else {
			System.out.println("not palindrome number");
		}
	}
	
	public static void isPalindromeCheck(int num) {
		
		int rev = 0;
		int t = num;
		
		while(num > 0) {
			rev = (rev * 10) + (num % 10);
			num = num / 10;
		}
		
		System.out.println("Reverse Number = " + rev);
		
		if(t == rev) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("It's Not Palindrome Number");
		}
		
	}

}

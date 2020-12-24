package com.interview;

public class PrimeNumber {

	// 2 is the lowest prime number
	// 3

	public static boolean isPrimeNumber(int num) {

		// edge or corner cases
		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	// How many Prime Number in the range.
	public static void primeCheck(int num) {
		for (int i = 2; i <= num; i++) {
			if (isPrimeNumber(i)) {
				System.out.print(i + " ");
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {

		System.out.println("2 is prime number = " + isPrimeNumber(2));
		System.out.println("3 is prime number = " + isPrimeNumber(3));
		System.out.println("4 is prime number = " + isPrimeNumber(4));
		System.out.println("5 is prime number = " + isPrimeNumber(5));
		System.out.println("6 is prime number = " + isPrimeNumber(6));
		System.out.println("0 is prime number = " + isPrimeNumber(0));
		System.out.println("-5 is prime number = " + isPrimeNumber(-5));
		System.out.println("-15 is prime number = " + isPrimeNumber(-15));
		System.out.println("1 is prime number = " + isPrimeNumber(1));
		System.out.println("9 is prime number = " + isPrimeNumber(9));

		System.out.println("--------------------------------------------");

		primeCheck(7);

		System.out.println("--------------------------------------------");

		primeCheck(20);
	}

}

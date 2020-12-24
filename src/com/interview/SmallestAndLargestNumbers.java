package com.interview;

import java.util.Arrays;

public class SmallestAndLargestNumbers {
	
	public static void main(String[] args) {

		int numbers[] = { -50, -100, 75, 150, 250, -350, 500, 500 };

		int smallest = numbers[0];
		int largest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		System.out.println("Given Array = " + Arrays.toString(numbers));
		System.out.println("Laregst Number = " + largest);
		System.out.println("Smallest Number = " + smallest);

	}

}

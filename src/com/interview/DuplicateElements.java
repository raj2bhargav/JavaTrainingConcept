package com.interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String names[] = { "Java", "C", "JavaScript", "PHP", "Java", "Python", "Ruby", "C" };

		// 1. Compare Each Elements --0 n square -- worst solution
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("Duplicate Element = " + names[i]);
				}
			}
		}

		System.out.println("********************");

		// 2. Using HashSet: is Java Collections - it stores unique value.
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate Element :: " + name);
			}
		}

		System.out.println("********************");

		// 3. Using HashMap:

	}

}

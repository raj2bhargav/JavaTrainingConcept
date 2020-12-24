package com.interview;

public class RemoveJunk {

	public static void main(String[] args) {

		String s = "@@@$$$$&&& latin string ****%%%%%12546897";

		// Regular Expression:[^a-zA-Z0-9]

		s = s.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(s);
	}

}

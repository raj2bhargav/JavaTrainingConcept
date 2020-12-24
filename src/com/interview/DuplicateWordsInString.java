package com.interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsInString {
	
	public static void main(String[] args) {
		
		String s = "hey java is java best language is java";
		
		String words[] = s.split(" ");
		
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		
		System.out.println("*****************************");
		
		for(int j=0; j<words.length; j++) {
			for(int k=j+1; k<words.length; k++) {
				if(words[j].equals(words[k])) {
					System.out.println("Duplicate Words Found = " + words[j]);
				}
			}
		}
		
		System.out.println("===================");
		
		Set<String> store = new HashSet<String>();
		for(String word : words) {
			if(store.add(word) == false) {
				System.out.println("Duplicate = " + word);
			}
		}
		
	}

}

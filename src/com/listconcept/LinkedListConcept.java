package com.listconcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {
	
	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("hello");
		ll.add("rpa");
		
		//print:
		System.out.println("content of linked list : " + ll);
		
		//addfirst
		ll.addFirst("raj");
		
		//addlast
		ll.addLast("automation");
		
		//print:
		System.out.println("content of linked list : " + ll);
		
		//get:
		System.out.println(ll.get(1));
		
		//set:
		ll.set(0, "Tom");
		
		System.out.println(ll.get(0));
		
		System.out.println("content of linked list : " + ll);
		
		//remove first and last:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linked list : " + ll);
		
		//How to print all the values of the LinkedList
		//1. For Loop
		
		System.out.println("******using for loop******");
		
		for(int i=0 ; i<ll.size() ; i++) {
			System.out.println(ll.get(i));
		}
		
		System.out.println("************");
		
		//2. Advanced For Loop
		System.out.println("****using advanced for loop********");
		
		for(String str : ll) {
			System.out.println(str);
		}
		
		
		System.out.println("************");
		
		System.out.println("******using iterator ******");
		//3. Iterator
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("************");
		
		System.out.println("******using while loop ******");
		//4. While Loop
		int num = 0;
		while(ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		System.out.println("************");
		
		
	}

}

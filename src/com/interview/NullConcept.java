package com.interview;

public class NullConcept {
	
	static Object obj;
	static String str;
	static NullConcept nc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. null is case sensitive
		//Object obj = null;
		
		//2. default ref value will be null.
//		System.out.println(obj);
//		System.out.println(str);
//		System.out.println(nc);
	
		//3. instanceof
		Integer i = null;
		Integer j = 10;
		
		System.out.println(i instanceof Integer);
		System.out.println(j instanceof Integer);
		
		
		//4. static vs non static
		NullConcept nj = null;
		
		nj.sum();
		nj.send();
		

	}
	
	public static void sum() {
		System.out.println("sum....");
	}
	
	public void send() {
		System.out.println("send...");
	}

}

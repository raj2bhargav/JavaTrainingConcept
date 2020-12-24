package com.interview;

public class FactorialNumber {
	
	//Fact 3 = 3*2*1 = 6
	//4 = 4*3*2*1 = 24
	//5 = 5*4*3*2*1 = 120
	//10 = 10*9*8....*1
	//fact(0) = 1
	//1 = 1
	
	
	public static void main(String[] args) {
		
		System.out.println(isFactorialNumber(4));
		System.out.println(isFactorialNumber(5));
		System.out.println(isFactorialNumber(1));
		System.out.println(isFactorialNumber(0));
		
		System.out.println("------------------------");
		
		System.out.println(fact(5));
		System.out.println(fact(4));
		System.out.println(fact(0));
		System.out.println(fact(1));
		
	}
	
	
	//1. Without recursive --for loop
	public static int isFactorialNumber(int num) {
		int fact = 1;
		
		if(num == 0) {
			return 1;
		}
		
		for(int i=1; i<=num; i++) {
			fact = fact * i;
		}
		
		return fact;
	}
	
	//2. Recursive Function -- a function is calling itself.
	public static int fact(int num) {
		
		if(num == 0) {
			return 1;
		}
		else {
			return (num * fact(num - 1));
		}
	}
	

}

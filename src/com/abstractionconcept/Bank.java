package com.abstractionconcept;

public abstract class Bank {
	
	
	//partial abstraction
	//hiding the implementation logic is called Abstraction
	
	public abstract void loan();//abstract method -- no method body
	
	public void credit() { //non abstract method
		System.out.println("bank -- credit");
	}
	
	public void debit() { //non abstract method
		System.out.println("bank -- debit");
	}
	
	
}

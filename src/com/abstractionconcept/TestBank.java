package com.abstractionconcept;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFCBank hd = new HDFCBank();
		
		hd.credit();
		hd.debit();
		hd.loan();
		
		
		System.out.println("------------------");
		
		Bank b = new HDFCBank();
		b.loan();
		b.credit();
		b.debit();

	}

}

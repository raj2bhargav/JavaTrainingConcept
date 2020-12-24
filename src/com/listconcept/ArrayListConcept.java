package com.listconcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	
	public static <E> void main(String[] args) {
		
		int a[] = new int[3]; //static array -- size is fixed
		
		//dynamic array -- ArrayList
		//1. Can contain duplicate values/elements
		//2. maintains insertion order
		//3. Synchronized
		//4. allows random access to fetch the element because it stores the values on the basis of indexes
		
		ArrayList ar = new ArrayList(); //Non Generic ArrayList
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(50);//5
		ar.add(12.33);//6
		ar.add("Test");//7
		ar.add(true); //8
		ar.add('a'); //9
		System.out.println(ar.size());//size of arraylist
		
		System.out.println(ar.get(4));//to get the value from an index
		
		System.out.println("**************");
		
		//To print all the values in the arraylist.
		//1. For Loop
		//2. Using Iterator
		
		for(int i = 0 ; i < ar.size() ; i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("**************");
		
		//non generic vs generic
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>(); //Generic ArrayList
		
		 ar1.add(100);
		 //ar1.add("World"); --> not allowed
		
		ArrayList<String> ar2 = new ArrayList<String>(); //Generic ArrayList
		ar2.add("Hello");
		ar2.add("Cricket");
		
		
		ArrayList<E> ar3 = new ArrayList<E>();
		
		//Employee Class Object:
		Employee e1 = new Employee("Raj", 25, "QA");
		Employee e2 = new Employee("Viraj", 5, "CEO");
		Employee e3 = new Employee("Satyam", 15, "Dev");
		
		//Create ArrayList:
		ArrayList<Employee> ar4 = new ArrayList<Employee>();
		
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		System.out.println("**************");
		
		//Iterator to traverse the values
		Iterator<Employee> it = ar4.iterator();
		
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		
		System.out.println("**************");
		
		//**************************
		//addAll()
		ArrayList<String> ar5 = new ArrayList<String>(); //Generic ArrayList
		ar5.add("test");
		ar5.add("Selenium");
		ar5.add("QTP");
		
		
		ArrayList<String> ar6 = new ArrayList<String>(); //Generic ArrayList
		ar6.add("dev");
		ar6.add("Java");
		ar6.add("JavaScript");
		
		ar5.addAll(ar6);
		
		for(int j=0; j<ar5.size(); j++) {
			System.out.println(ar5.get(j));
		}
		
		
		System.out.println("**************");
		
		//removeAll()
		
		ar5.removeAll(ar6);
		
		for(int j=0; j<ar5.size(); j++) {
			System.out.println(ar5.get(j));
		}
		
		System.out.println("**************");
		
		//retainAll()
		
		ArrayList<String> ar7 = new ArrayList<String>(); //Generic ArrayList
		ar7.add("test");
		ar7.add("Selenium");
		ar7.add("QTP");
		
		
		ArrayList<String> ar8 = new ArrayList<String>(); //Generic ArrayList
		ar8.add("test");
		ar8.add("Java");
		
		ar7.retainAll(ar8);
		
		for(int j=0; j<ar7.size(); j++) {
			System.out.println(ar7.get(j));
		}
		
		
		
		
	}

}

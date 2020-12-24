package JavaBasics;

public class ConstructorConcept {
	
	//Constructor can be overloaded.
	//Constructor don;t return anything.
	
	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("single parameter constructor");
		System.out.println("the value of i = " + i);
	}
	
	
	public ConstructorConcept(int i, int j) {
		System.out.println("double parameter constructor");
		System.out.println("the value of i = " + i);
		System.out.println("the value of i = " + j);
	}
	
	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		
		ConstructorConcept obj1 = new ConstructorConcept(10);
		
		ConstructorConcept obj2 = new ConstructorConcept(20,30);
		
	}

}

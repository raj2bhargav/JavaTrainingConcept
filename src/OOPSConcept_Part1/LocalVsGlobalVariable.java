package OOPSConcept_Part1;

public class LocalVsGlobalVariable {

	// Global Variable
	String name = "Raj";
	int age = 30;

	public static void main(String[] args) {

		// local variable
		int i = 5;
		System.out.println(i);

		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		System.out.println(obj.age);
		
		obj.sum();

	}

	public void sum() {
		int i = 15;
		int j = 35;
		int age = 40;
		
		System.out.println(i+j);
	}

}

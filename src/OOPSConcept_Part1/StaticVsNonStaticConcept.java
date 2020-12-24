package OOPSConcept_Part1;

public class StaticVsNonStaticConcept {
	
	String name = "Raj";
	static int age = 25;
	
	public static void main(String[] args) {
		
		//How to call static method and variables.
		//1. Direct Calling.
		sum();
		//2. Calling by Class name
		StaticVsNonStaticConcept.sum();
				
		System.out.println(age);
		System.out.println(StaticVsNonStaticConcept.age);
		
		//How to call Non Static Method and Variable.
		StaticVsNonStaticConcept obj = new StaticVsNonStaticConcept();
		System.out.println(obj.name);
		obj.sendMail();
		
		
	}
	
	public void sendMail() {
		System.out.println("send mail method");
	}
	
	public static void sum() {
		System.out.println("sum method");
	}

}

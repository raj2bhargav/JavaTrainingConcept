package OOPSConcept_Part1;

public class FunctionsInJava {
	
	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		
		int a = obj.testOne();
		System.out.println(a);
		
		String b = obj.testTwo();
		System.out.println(b);
		
		int c = obj.division(20, 10);
		System.out.println(c);
		
	}
	
	//Non Static Method
	public void test() { //No Input, No Output
		System.out.println("test method -- no parameter");
	}
	
	public int testOne() { //No Input, Some Output
		System.out.println("Test One method");
		int a = 10;
		int b = 20;
		int sum = a + b;
		
		return sum;
	}
	
	
	public String testTwo() {//No Input, Some Output
		System.out.println("Test Two Method");
		String s = "Selenium";
		
		return s;
	}
	
	
	public int division(int x, int y) {
		System.out.println("Division Method");
		int d = x/y;
		
		return d;
	}

}

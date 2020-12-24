package OOPSConcept_Part1;

public class FinallyConcept {
	
	public static void main(String[] args) {
		
		test1();
		
		System.out.println("-------------");
		
		test2();
		
	}
	
	
	public static void test1() {
		try {
			System.out.println("inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e){
			System.out.println("inside catch block");
		}
		
		finally {
			System.out.println("inside finally block");
		}
	}
	
	
	public static void test2() {
		try
		{
			System.out.println("inside test2 method");
		}
		finally
		{
			System.out.println("inside test2 finally method");
		}
	}
	

}

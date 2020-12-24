package JavaBasics;

public class ExceptionHandlingConcept {
	
	//int a = 20;
	
	public static void main(String[] args) {
		
//		//uncaught exceptions 
//		int i = 9/0;
//		System.out.println(i);
//		
//		//caught exceptions
//		Thread.sleep(2000);
		
//		ExceptionHandlingConcept obj = new ExceptionHandlingConcept();
//		obj = null;
//		System.out.println(obj.a);
		
		//1. try-catch block:
		try {
			int i = 9/0;
		}
		catch(Exception e) {
			//System.out.println("The error = " + e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("Test");
		
	
		
	}

}

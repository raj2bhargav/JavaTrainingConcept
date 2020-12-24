package OOPSConcept_Part1;

public class Car {
	
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		
		//new Car() --> this is the object of Car class.
		//a,b,c is the object Reference Variable
		//new keyword is used create the Object
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2016;
		b.wheel = 5;
		
		c.mod = 2017;
		c.wheel = 6;
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
	}

}

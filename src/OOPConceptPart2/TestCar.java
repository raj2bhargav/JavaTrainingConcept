package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		// Static Polymorphism --> Compile time polymorphism
		BMW bmw = new BMW();

		// when same methods is present in parent and child class with the same name is
		// called Method Overriding
		bmw.start();
		bmw.stop();

		bmw.refuel();
		bmw.theft();

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();

	}

}

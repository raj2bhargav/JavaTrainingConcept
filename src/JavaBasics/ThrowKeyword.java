package JavaBasics;

public class ThrowKeyword {

	public static void main(String[] args) {

		System.out.println("ABC");

		try {
			throw new Exception("Raj Exception");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("PQR");
	}

}


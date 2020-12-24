package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {

		// Dis-Advantage of Single Dimension Array
		// 1. Size is fixed --> To overcome this problem, we use Collection -->
		// ArrayList, HashMap --> Dynamic Array
		// 2. Same data types --> To overcome this problem, we use Object Array.

		// 1. Int Array
		int i[] = new int[5];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		i[4] = 50;

		System.out.println(i.length);

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}

		// 2. Double Array
		double d[] = new double[2];
		d[0] = 10.55;
		d[1] = 12.55;
		System.out.println(d[1]);

		// 3. Char Array
		char c[] = new char[3];
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';
		System.out.println(c[2]);

		// 4. Boolean Arrray
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[1]);

		// 5. String Array
		String s[] = new String[3];
		s[0] = "Test";
		s[1] = "World";
		s[2] = "Hello";

		System.out.println(s.length);
		System.out.println("*****************");

		// 6. Object Array
		Object obj[] = new Object[5];
		obj[0] = 10;
		obj[1] = 10.55;
		obj[2] = 'A';
		obj[3] = "Hello";
		obj[4] = true;

		for (int m = 0; m < obj.length; m++) {
			System.out.println(obj[m]);
		}

	}

}

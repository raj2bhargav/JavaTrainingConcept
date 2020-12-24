package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();

		ar.add(100);
		ar.add(200);
		ar.add(300);

		System.out.println(ar.size());

		ar.add(400);
		ar.add(500);

		System.out.println(ar.size());

		ar.add("Tom");
		ar.add('A');
		ar.add(12.55);
		ar.add("Hello");

		System.out.println(ar.size());

		System.out.println(ar.get(2));

		System.out.println("--------------");

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		System.out.println("--------------");

		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(150);
		// ar1.add(11.11);

		ArrayList<String> ar2 = new ArrayList<String>();
		// ar2.add(250);
		ar2.add("Test");

	}

}
